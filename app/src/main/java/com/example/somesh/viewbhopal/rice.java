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


public class rice extends ActionBarActivity {


        Integer[] imageIDs = {
                R.drawable.rb1,
                R.drawable.rb2,
                R.drawable.rb3,
                R.drawable.rb4,
                R.drawable.rb5,
                R.drawable.rb6
        };

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_rice);
        }



    }


