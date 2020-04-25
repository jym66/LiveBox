package com.livebox.index;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.EncryptBean.bilibiliIndex;
import com.EncryptBean.egameDatebean;
import com.EncryptBean.egameindex;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.util.MyApplication;

import java.util.ArrayList;
import java.util.Collections;


public class RecyclerViewAdapter3 extends RecyclerView.Adapter<RecyclerViewAdapter3.ViewHolder> {
    private Context context;
    private ArrayList<String> egame = new ArrayList<>();
//    private ArrayList<egameDatebean> egamedata = new ArrayList<>();
    private Gson gson = new Gson();
     RecyclerViewAdapter3(Context context){
        this.context = context;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
         egameDatebean egameDatebeans = gson.fromJson(egame.get(position),egameDatebean.class);
//        Log.e("AAAAAAAAAA",String.valueOf(egameDatebeans.getAnchor_id()));
//        Log.d("TAG", String.valueOf(position));
        if (egame.size()>0){
            String roomid = String.valueOf(egameDatebeans.getAnchor_id());
            String title = egameDatebeans.getTitle();
            String cover = egameDatebeans.getVideo_info().getUrl();
            Glide.with(MyApplication.getContext()).load(cover).into(holder.im1);
            holder.tx1.setText(title);
            Intent intent = new Intent(context,Main2Activity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            holder.itemView.setOnClickListener(v -> {
                intent.putExtra("rid", roomid);
                intent.putExtra("tv","egame");
                intent.putExtra("title",title);
                intent.putExtra("cover",cover);
                context.startActivity(intent);
            });
        }
    }

    @Override
    public int getItemCount() {
         if (egame.size()>0){
             return egame.size();
         }
        return 0;
    }

     class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView im1;
        private TextView tx1;
        ViewHolder(@NonNull View itemView) {
            super(itemView);
            im1 = itemView.findViewById(R.id.grid_img);
            tx1 = itemView.findViewById(R.id.grid_txt);
        }
    }
     void updateList(String Datas,boolean isMore){
         if (!isMore){
             egame.clear();
         }
         egameindex data = gson.fromJson(Datas,egameindex.class);
//         Log.e("AAAAAAAAAA", String.valueOf(data.getData().get_$0().getRetBody().getData().getLive_data().getLive_list().get(0).getData_h5()));
         for (egameindex.DataBeanX._$0Bean.RetBodyBean.DataBean.LiveDataBean.LiveListBean da: data.getData().get_$0().getRetBody().getData().getLive_data().getLive_list()) {
            egame.add(da.getData_h5());

         }
//         egameDatebean egameDatebeans = gson.fromJson(String.valueOf(data.getData().get_$0().getRetBody().getData().getLive_data().getLive_list()),egameDatebean.class);
//
//         egamedata.addAll(Collections.singleton(egameDatebeans));
         notifyDataSetChanged();
    }

}
