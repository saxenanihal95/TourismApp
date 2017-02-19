package com.example.somesh.viewbhopal;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Visitingplaces extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vp);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_visitingplaces, menu);
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

    public void buttonFuntion1(View view) {
        Intent intent = new Intent(getApplicationContext(), taj.class);
        startActivity(intent);
    }

    public void buttonFuntion2(View view) {
        Intent intent = new Intent(getApplicationContext(), bheem.class);
        startActivity(intent);
    }

    public void buttonFunction3(View view) {
        Intent intent = new Intent(getApplicationContext(), van.class);
        startActivity(intent);
    }

    public void buttonFunction4 (View view) {
        Intent intent = new Intent(getApplicationContext(), birlam.class);
        startActivity(intent);
    }

    public void buttonFuntion5(View view) {

        Intent intent = new Intent(getApplicationContext(), gohar.class);
        startActivity(intent);
    }
    public void buttonFuntion6 (View view) {

        Intent intent = new Intent(getApplicationContext(), manav.class);
        startActivity(intent);
    }
    public void buttonFuntion7(View view) {

        Intent intent = new Intent(getApplicationContext(), kanha.class);
        startActivity(intent);
    }
    public void buttonFuntion8(View view) {

        Intent intent = new Intent(getApplicationContext(), sanchi.class);
        startActivity(intent);
    }
    public void buttonFuntion9(View view) {

        Intent intent = new Intent(getApplicationContext(), upper.class);
        startActivity(intent);
    }
    public void buttonFuntion10(View view) {

        Intent intent = new Intent(getApplicationContext(), science.class);
        startActivity(intent);
    }
    public void buttonFuntion11(View view) {

        Intent intent = new Intent(getApplicationContext(), bharat.class);
        startActivity(intent);
    }
    public void buttonFunction12 (View view) {

        Intent intent = new Intent(getApplicationContext(), shaurya.class);
        startActivity(intent);
    }
    public void buttonFuntion13(View view) {

        Intent intent = new Intent(getApplicationContext(), sair.class);
        startActivity(intent);
    }
    public void buttonFuntion14(View view) {

        Intent intent = new Intent(getApplicationContext(), people.class);
        startActivity(intent);
    }
    public void buttonFuntion15(View view) {

        Intent intent = new Intent(getApplicationContext(), manua.class);
        startActivity(intent);
    }


}
