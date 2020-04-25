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


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private Context context;
    private ArrayList<DouyuIndexData.DataBean> jsonElements = new ArrayList<>();


    private Gson gson = new Gson();
     RecyclerViewAdapter(Context context){
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
        if (jsonElements.size() != 0){
            String roomid = jsonElements.get(position).getRoom_id();
            String title = jsonElements.get(position).getRoom_name();
            String cover = jsonElements.get(position).getRoom_src();
            Glide.with(MyApplication.getContext()).load(cover).into(holder.im1);
            holder.tx1.setText(title);
            Intent intent = new Intent(context,Main2Activity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            holder.itemView.setOnClickListener(v -> {
                intent.putExtra("rid", roomid);
                intent.putExtra("tv","douyu");
                intent.putExtra("title",title);
                intent.putExtra("cover",cover);
                context.startActivity(intent);
            });

        }
    }

    @Override
    public int getItemCount() {
       if (jsonElements.size()>0){
           return jsonElements.size();
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
             jsonElements.clear();
         }
         DouyuIndexData douyuIndexData = gson.fromJson(Datas, DouyuIndexData.class);
         jsonElements.addAll(douyuIndexData.getData());
         notifyDataSetChanged();
    }

}
