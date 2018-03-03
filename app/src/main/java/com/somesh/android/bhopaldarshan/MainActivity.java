package com.somesh.android.bhopaldarshan;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    NetworkInfo netInfo;

    private static final String TAG = "MainActivity";


    public void buttonClickFunction(View v)
    {
        if (netInfo == null){
            Toast.makeText(this,"There is no Internet Connectivity !",Toast.LENGTH_SHORT).show();
        }else {
            Intent intent = new Intent(getApplicationContext(), VisitingPlaces.class);
            startActivity(intent);
        }
    }

    public void clickFunction(View x)
    {
        if (netInfo == null){
            Toast.makeText(this,"There is no Internet Connectivity !",Toast.LENGTH_SHORT).show();
        }else {
            Intent intent = new Intent(getApplicationContext(), Temples.class);
            startActivity(intent);
        }
    }

    public void buttonFunction(View y)
    {
        if (netInfo == null){
            Toast.makeText(this,"There is no Internet Connectivity !",Toast.LENGTH_SHORT).show();
        }else {
            Intent intent = new Intent(getApplicationContext(), Restaurants.class);
            startActivity(intent);
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConnectivityManager conMgr =  (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        netInfo = conMgr.getActiveNetworkInfo();

    }

}

