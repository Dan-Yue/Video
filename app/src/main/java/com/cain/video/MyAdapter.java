package com.cain.video;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/**
 * Created by Administrator on 16-4-18.
 * User:cain[FR]
 * Date:16-4-18
 * Email:1543880711@qq.com
 * ProjectName:Video
 */
public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder holder) {
        super.onViewDetachedFromWindow(holder);
    }
}
