package com.notnull.nihal.viewbhopal;

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
 * Created by nsaxena on 10/2/18.
 */

class VisitingPlacesAdapter extends RecyclerView.Adapter<VisitingPlacesAdapter.MyViewHolder> {

    List<VisitingPlace> visitingPlacesList;
    Context context;

    public VisitingPlacesAdapter(Context context,List visitingPlacesList) {
        this.context=context;
        this.visitingPlacesList = visitingPlacesList;
    }
    @Override
    public int getItemCount() {
        return visitingPlacesList.size();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.visiting_places_list_item,parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        // set the data in items
        //holder.placeTitle.setText((Integer) visitingPlacesList.get(position));
        VisitingPlace visitingPlace =visitingPlacesList.get(position);
        holder.placeTitle.setText(visitingPlace.getTitle());
        // loading album cover using Glide library
        Glide.with(context).load(visitingPlace.getImageUrl()).into(holder.placeImage);
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView placeTitle;
        public ImageView placeImage;

        public MyViewHolder(View view) {
            super(view);
            placeTitle=(TextView)view.findViewById(R.id.visiting_place_title);
            placeImage=(ImageView)view.findViewById(R.id.visiting_place_image);
        }
    }
}
