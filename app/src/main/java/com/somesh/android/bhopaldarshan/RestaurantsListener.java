package com.somesh.android.bhopaldarshan;

import android.content.Context;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by nsaxena on 28/2/18.
 */

class RestaurantsListener extends RecyclerView.SimpleOnItemTouchListener {
    private static final String TAG = "RestaurantsListener";

    interface OnReclyclerClickListener{
        void onItemClick(View view, int postition);
        void onItemLongClick(View view,int postition);
    }

    private final RestaurantsListener.OnReclyclerClickListener mListener;
    private final GestureDetectorCompat mGetGestureDetector;

    public RestaurantsListener(Context context, final RecyclerView recyclerView, RestaurantsListener.OnReclyclerClickListener listener) {
        mListener = listener;
        mGetGestureDetector=new GestureDetectorCompat(context,new GestureDetector.SimpleOnGestureListener(){
            @Override
            public boolean onSingleTapUp(MotionEvent e) {
                View childVeiw = recyclerView.findChildViewUnder(e.getX(),e.getY());
                if(childVeiw!=null&&mListener!=null){
                    mListener.onItemClick(childVeiw,recyclerView.getChildAdapterPosition(childVeiw));
                }
                return true;
            }

            @Override
            public void onLongPress(MotionEvent e) {

                View childView=recyclerView.findChildViewUnder(e.getX(),e.getY());
                if(childView!=null && mListener!=null){
                    mListener.onItemClick(childView,recyclerView.getChildAdapterPosition(childView));
                }
            }
        });
    }

    @Override
    public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
        if(mGetGestureDetector!=null){
            boolean result =mGetGestureDetector.onTouchEvent(e);
            return result;
        }else {
            return false;
        }

    }
}
