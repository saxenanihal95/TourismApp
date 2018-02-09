package com.example.somesh.viewbhopal;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;


public class bhopalex extends ActionBarActivity {

        Integer[] imageIDs = {
                R.drawable.be1,
                R.drawable.be2,
                R.drawable.be3,
                R.drawable.be4,
                R.drawable.be5,
                R.drawable.be6,
                R.drawable.be7,
                R.drawable.be8
        };

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_bhopalex);
        }



    }


