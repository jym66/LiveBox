package com.livebox.index;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.Service.indexService;
import com.scwang.smart.refresh.layout.api.RefreshLayout;
import com.util.BaseUrl;
import com.util.MyApplication;
import com.util.RetrofitManager;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Fragment3 extends Fragment {

    private View view;
//    private RecyclerView recyclerView;
    int spanCount; // 3 columns
    int spacing = 30; // 50px
    boolean includeEdge = false;
    private boolean State;
    private int page =1;
    private RecyclerViewAdapter3 recyclerViewAdapter=new RecyclerViewAdapter3(MyApplication.getContext());

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag3,container,false);
        init();
        initData(false,1);
        return view;
    }
    void init(){
        if (isLandscape(getActivity())){
            spanCount=4;
        }else {
            spanCount=2;
        }
        RecyclerView recyclerView = view.findViewById(R.id.my_recycler_view);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getActivity(), spanCount);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(new GridSpacingItemDecoration(spanCount, spacing, includeEdge));
        recyclerView.setAdapter(recyclerViewAdapter);
        initData(false,1);
        RefreshLayout refreshLayout = view.findViewById(R.id.refreshLayout);
//        下拉刷新
        refreshLayout.setOnRefreshListener(refreshLayout1 -> {
            initData(false,1);
            refreshLayout1.finishRefresh(State);
//            上拉加载说明已经在顶上了，所以重置页数为1
            page = 1;
        });
//        上拉加载
        refreshLayout.setOnLoadMoreListener(refreshLayout1 -> {
            page+=1;
            initData(true,page);
            refreshLayout.finishLoadMore(State);

        });
    }
    void initData(boolean isMore,int page) {
        String params = "{\"0\":{\"param\":{\"page_num\":"+page+",\"page_size\":10},\"module\":\"pgg_live_read_ifc_mt_svr\",\"method\":\"get_live_list_by_recom_h5\"}}";
        String app_info = "{\"platform\":2,\"terminal_type\":4,\"version_code\":\"undefined\",\"version_name\":\"undefined\",\"pvid\":\"567417344020042222\",\"ssid\":\"593408102420042420\",\"imei\":\"0\"}";
        RetrofitManager retrofitManager = new RetrofitManager(BaseUrl.egame);
        Call<ResponseBody> call = retrofitManager.crratereq(indexService.class).getEgameIndex(String.valueOf(System.currentTimeMillis()/1000),params,app_info);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
//                    Log.e("TAG1", response.body().string());
                    recyclerViewAdapter.updateList(response.body().string(),isMore);
                    State = true;
                } catch (IOException e) {
                    State = false;
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                State = false;
            }
        });
    }
    public static boolean isLandscape(Context context) {
        int orientation = context.getResources().getConfiguration().orientation; //获取屏幕方向
        // Checks the orientation of the screen
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            //横屏
            return true;
        } else if (orientation == Configuration.ORIENTATION_PORTRAIT) {
            //竖屏
            return false;
        }
        return false;
    }
}
