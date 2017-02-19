package com.example.somesh.viewbhopal;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Restaurants extends ActionBarActivity {



    public void buttonFunction1(View v)
    {
        Intent intent= new Intent(getApplicationContext(), bakenshake.class);
        startActivity(intent);
    }

    public void buttonFunction2(View v)
    {
        Intent intent= new Intent(getApplicationContext(), bapu.class);
        startActivity(intent);
    }

    public void buttonFunction3(View v)
    {
        Intent intent= new Intent(getApplicationContext(), hakeem.class);
        startActivity(intent);
    }

    public void buttonFunction4(View v)
    {
        Intent intent= new Intent(getApplicationContext(), pizzeria.class);
        startActivity(intent);
    }

    public void buttonFunction5(View v)
    {
        Intent intent= new Intent(getApplicationContext(), soorma.class);
        startActivity(intent);
    }
    public void buttonFunction6(View v)
    {
        Intent intent= new Intent(getApplicationContext(), momo.class);
        startActivity(intent);
    }
    public void buttonFunction7(View v)
    {
        Intent intent= new Intent(getApplicationContext(), tea_talks.class);
        startActivity(intent);
    }
    public void buttonFunction8(View v)
    {
        Intent intent= new Intent(getApplicationContext(), sagar.class);
        startActivity(intent);
    }
    public void buttonFunction9(View v)
    {
        Intent intent= new Intent(getApplicationContext(), kafe.class);
        startActivity(intent);
    }
    public void buttonFunction10(View v)
    {
        Intent intent= new Intent(getApplicationContext(), wonder.class);
        startActivity(intent);
    }
    public void buttonFunction11(View v)
    {
        Intent intent= new Intent(getApplicationContext(), rice.class);
        startActivity(intent);
    }
    public void buttonFunction12(View v)
    {
        Intent intent= new Intent(getApplicationContext(), hong.class);
        startActivity(intent);
    }
    public void buttonFunction13(View v)
    {
        Intent intent= new Intent(getApplicationContext(), abh.class);
        startActivity(intent);
    }
    public void buttonFunction14(View v)
    {
        Intent intent= new Intent(getApplicationContext(), bhopalex.class);
        startActivity(intent);
    }
    public void buttonFunction15(View v)
    {
        Intent intent= new Intent(getApplicationContext(), natural.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_restaurants, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
