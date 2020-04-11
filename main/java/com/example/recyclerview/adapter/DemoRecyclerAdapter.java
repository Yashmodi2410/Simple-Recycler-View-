package com.example.recyclerview.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;
import com.example.recyclerview.model.DemoModel;

import java.util.ArrayList;

public class DemoRecyclerAdapter extends RecyclerView.Adapter<DemoRecyclerAdapter.MyHolder> {

    Activity mActivity;
    ArrayList<DemoModel> list;

    public DemoRecyclerAdapter(Activity mActivity, ArrayList<DemoModel> list) {
        this.mActivity = mActivity;
        this.list = list;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mActivity).inflate(R.layout.layout_demo, parent, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.img.setImageResource(list.get(position).getPlayer_img());
        holder.tv_name.setText(list.get(position).getPlayer_name());
        holder.tv_avg.setText(list.get(position).getPlayer_avg());
        holder.tv_run.setText(list.get(position).getPlayer_run());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        private final ImageView img;
        private final TextView tv_name;
        private final TextView tv_run;
        private final TextView tv_avg;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.img);
            tv_name = itemView.findViewById(R.id.tv_name);
            tv_run = itemView.findViewById(R.id.tv_run);
            tv_avg = itemView.findViewById(R.id.tv_avg);
        }
    }
}
