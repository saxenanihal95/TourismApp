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

        public class ImageAdapter extends BaseAdapter {
            private Context context;
            private int itemBackground;

            public ImageAdapter(Context c) {
                context = c;
// sets a grey background; wraps around the images
                TypedArray a = obtainStyledAttributes(R.styleable.MyGallery);
                itemBackground = a.getResourceId(R.styleable.MyGallery_android_galleryItemBackground, 0);
                a.recycle();
            }

            // returns the number of images
            public int getCount() {
                return imageIDs.length;
            }

            // returns the ID of an item
            public Object getItem(int position) {
                return position;
            }

            // returns the ID of an item
            public long getItemId(int position) {
                return position;
            }

            // returns an ImageView view
            public View getView(int position, View convertView, ViewGroup parent) {
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(imageIDs[position]);
                imageView.setLayoutParams(new Gallery.LayoutParams(100, 100));
                imageView.setBackgroundResource(itemBackground);
                return imageView;
            }
        }

    }
