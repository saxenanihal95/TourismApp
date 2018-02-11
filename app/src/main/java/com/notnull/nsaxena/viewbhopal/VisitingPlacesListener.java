package com.notnull.nsaxena.viewbhopal;

import android.content.Context;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;


class VisitingPlacesListener extends RecyclerView.SimpleOnItemTouchListener{
    private static final String TAG = "VisitingPlacesListener";

    interface OnReclyclerClickListener{
        void onItemClick(View view,int postition);
        void onItemLongClick(View view,int postition);
    }

    private final OnReclyclerClickListener mListener;
    private final GestureDetectorCompat mGetGestureDetector;

    public VisitingPlacesListener(Context context,final RecyclerView recyclerView,OnReclyclerClickListener listener) {
        mListener = listener;
        mGetGestureDetector=new GestureDetectorCompat(context,new GestureDetector.SimpleOnGestureListener(){
            @Override
            public boolean onSingleTapUp(MotionEvent e) {
                Log.d(TAG, "onSingleTapUp: starts");
                View childVeiw = recyclerView.findChildViewUnder(e.getX(),e.getY());
                if(childVeiw!=null&&mListener!=null){
                    Log.d(TAG, "onSingleTapUp: calling listener onItemClick");
                    mListener.onItemClick(childVeiw,recyclerView.getChildAdapterPosition(childVeiw));
                }
                return true;
            }

            @Override
            public void onLongPress(MotionEvent e) {

                Log.d(TAG, "onLongPress: starts");
                View childView=recyclerView.findChildViewUnder(e.getX(),e.getY());
                if(childView!=null && mListener!=null){
                    Log.d(TAG, "onLongPress: calling listener onItemClick");
                    mListener.onItemClick(childView,recyclerView.getChildAdapterPosition(childView));
                }
            }
        });
    }

    @Override
    public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
        Log.d(TAG, "onInterceptTouchEvent: starts");
        if(mGetGestureDetector!=null){
            boolean result =mGetGestureDetector.onTouchEvent(e);
            Log.d(TAG, "onInterceptTouchEvent: returned "+result);
            return result;
        }else {
            Log.d(TAG, "onInterceptTouchEvent: returned false");
            return false;
        }

    }
}