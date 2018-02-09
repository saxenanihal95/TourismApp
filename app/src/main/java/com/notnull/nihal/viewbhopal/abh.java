package com.example.somesh.viewbhopal;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;


public class abh extends AppCompatActivity {


        Integer[] imageIDs = {
                R.drawable.abh1,
                R.drawable.abh2,
                R.drawable.abh3,
                R.drawable.abh4
        };

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_abh);
        }


}
