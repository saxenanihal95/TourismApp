package com.notnull.nsaxena.viewbhopal;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by nsaxena on 28/2/18.
 */

class RestaurantsAdapter extends RecyclerView.Adapter<RestaurantsAdapter.MyViewHolder>{
    List<Restaurant> mRestaurants;
    Context context;

    public RestaurantsAdapter(Context context,List restaurantList) {
        this.context=context;
        this.mRestaurants = restaurantList;
    }
    @Override
    public int getItemCount() {
        return mRestaurants.size();
    }

    @Override
    public RestaurantsAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.restaurant_list_item,parent, false);
        return new RestaurantsAdapter.MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(RestaurantsAdapter.MyViewHolder holder, final int position) {
        // set the data in items
        Restaurant restaurant =mRestaurants.get(position);
        holder.placeTitle.setText(restaurant.getTitle());
        // loading album cover using Glide library
        Glide.with(context).load(restaurant.getImageUrl()).into(holder.placeImage);
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView placeTitle;
        public ImageView placeImage;

        public MyViewHolder(View view) {
            super(view);
            placeTitle=(TextView)view.findViewById(R.id.restaurant_title);
            placeImage=(ImageView)view.findViewById(R.id.restaurant_image);
        }
    }

    public Restaurant getRestaurant(int position) {
        return mRestaurants.get(position);
    }
}
