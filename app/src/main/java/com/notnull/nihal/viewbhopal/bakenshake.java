package com.notnull.nihal.viewbhopal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class bakenshake extends AppCompatActivity {




    Integer[] imageIDs = {
            R.drawable.b1,
            R.drawable.b2,

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bakenshake);

        Button mapButton=(Button) findViewById(R.id.mapButton);

        mapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(getApplicationContext(),MapsActivity.class);
                intent.putExtra("LAT",23.2333);
                intent.putExtra("LNG",77.4341);
                startActivity(intent);            }
        });


    }


}


