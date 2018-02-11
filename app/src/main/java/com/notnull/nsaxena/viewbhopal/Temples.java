package com.notnull.nsaxena.viewbhopal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Temples extends AppCompatActivity {

    public void buttonFunction1(View v)
    {
        Intent intent= new Intent(getApplicationContext(), birla.class);
        startActivity(intent);
    }


    public void buttonFunction2(View v)
    {
        Intent intent= new Intent(getApplicationContext(), bhoj.class);
        startActivity(intent);
    }

    public void buttonFunction3(View v)
    {
        Intent intent= new Intent(getApplicationContext(), malai.class);
        startActivity(intent);
    }

    public void buttonFunction4(View v)
    {
        Intent intent= new Intent(getApplicationContext(), mata.class);
        startActivity(intent);
    }


    public void buttonFunction5(View v)
    {
        Intent intent= new Intent(getApplicationContext(), gufa.class);
        startActivity(intent);
    }
    public void buttonFunction6(View v)
    {
        Intent intent= new Intent(getApplicationContext(), jain.class);
        startActivity(intent);
    }
    public void buttonFunction7(View v)
    {
        Intent intent= new Intent(getApplicationContext(), kali.class);
        startActivity(intent);
    }
    public void buttonFunction8(View v)
    {
        Intent intent= new Intent(getApplicationContext(), moti.class);
        startActivity(intent);
    }
    public void buttonFunction9(View v)
    {
        Intent intent= new Intent(getApplicationContext(), sai.class);
        startActivity(intent);
    }
    public void buttonFunction10(View v)
    {
        Intent intent= new Intent(getApplicationContext(), bari.class);
        startActivity(intent);
    }
    public void buttonFunction11(View v)
    {
        Intent intent= new Intent(getApplicationContext(), maa.class);
        startActivity(intent);
    }
    public void buttonFunction12(View v)
    {
        Intent intent= new Intent(getApplicationContext(), guru.class);
        startActivity(intent);
    }
    public void buttonFunction13(View v)
    {
        Intent intent= new Intent(getApplicationContext(), she.class);
        startActivity(intent);
    }
    public void buttonFunction14(View v)
    {
        Intent intent= new Intent(getApplicationContext(), gan.class);
        startActivity(intent);
    }
    public void buttonFunction15(View v)
    {
        Intent intent= new Intent(getApplicationContext(), neo.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temples);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_temples, menu);
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
