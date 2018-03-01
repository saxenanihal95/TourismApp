package com.notnull.nsaxena.viewbhopal;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

/**
 * Created by nsaxena on 27/2/18.
 */

public class TemplesAdapter extends RecyclerView.Adapter<TemplesAdapter.MyViewHolder>{
    List<Temple> mTemples;
    Context context;

    public TemplesAdapter(Context context,List templeList) {
        this.context=context;
        this.mTemples = templeList;
    }
    @Override
    public int getItemCount() {
        return mTemples.size();
    }

    @Override
    public TemplesAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.temple_list_item,parent, false);
        return new TemplesAdapter.MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(TemplesAdapter.MyViewHolder holder, final int position) {
        // set the data in items
        Temple temple =mTemples.get(position);
        holder.placeTitle.setText(temple.getTitle());
        // loading album cover using Glide library
        Glide.with(context)
                .load(temple.getImageUrl())
                .thumbnail(Glide.with(context).load(R.drawable.giphy))
                .apply(new RequestOptions()
                        .error(R.drawable.broken_image))
                .into(holder.placeImage);
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView placeTitle;
        public ImageView placeImage;

        public MyViewHolder(View view) {
            super(view);
            placeTitle=(TextView)view.findViewById(R.id.temple_title);
            placeImage=(ImageView)view.findViewById(R.id.temple_image);
        }
    }

    public Temple getTemple(int position) {
        return mTemples.get(position);
    }
}
