package com.notnull.nsaxena.viewbhopal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends AppCompatActivity {



    public void buttonClickFunction(View v)
    {
        Intent intent= new Intent(getApplicationContext(),VisitingPlaces.class);
        startActivity(intent);
    }

    public void clickFunction(View x)
    {
        Intent intent = new Intent(getApplicationContext(), Temples.class);
        startActivity(intent);
    }

    public void buttonFunction(View y)
    {
        Intent intent= new Intent(getApplicationContext(),Restaurants.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}

