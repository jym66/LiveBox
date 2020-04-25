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

import com.EncryptBean.DouyuIndexData;
import com.EncryptBean.bilibiliIndex;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.util.MyApplication;

import java.util.ArrayList;


public class RecyclerViewAdapter2 extends RecyclerView.Adapter<RecyclerViewAdapter2.ViewHolder> {
    private Context context;
    private ArrayList<bilibiliIndex.DataBean> bilibili = new ArrayList<>();
    private Gson gson = new Gson();
     RecyclerViewAdapter2(Context context){
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
        Log.d("TAG", String.valueOf(position));
        if (bilibili.size()>0){
            String roomid = String.valueOf(bilibili.get(position).getRoomid());
//                Log.d("AAAAAAAAAAAAA", roomid);
            String title = bilibili.get(position).getTitle();
            String cover = bilibili.get(position).getUser_cover();
            Glide.with(MyApplication.getContext()).load(cover).into(holder.im1);
            holder.tx1.setText(title);
            Intent intent = new Intent(context,Main2Activity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            holder.itemView.setOnClickListener(v -> {
                intent.putExtra("rid", roomid);
                intent.putExtra("tv","bilibili");
                intent.putExtra("title",title);
                intent.putExtra("cover",cover);
                context.startActivity(intent);
            });
        }
    }

    @Override
    public int getItemCount() {
         if (bilibili.size()>0){
             return bilibili.size();
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
             bilibili.clear();
         }
         bilibiliIndex da = gson.fromJson(Datas,bilibiliIndex.class);
         bilibili.addAll(da.getData());
         notifyDataSetChanged();
    }

}
