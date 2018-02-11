package com.notnull.nsaxena.viewbhopal;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



public class VisitingPlaces extends AppCompatActivity implements VisitingPlacesListener.OnReclyclerClickListener{

    RecyclerView myRecyclerView;
    VisitingPlacesAdapter myAdapter;
    //List mVistingPlaceList = new ArrayList<>(Arrays.asList("Person 1", "Person 2", "Person 3", "Person 4", "Person 5", "Person 6", "Person 7"));
    List mVistingPlaceList = new ArrayList<VisitingPlaces>();
    private DatabaseReference mDatabase;
    private static final String TAG = "VisitingPlaces";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mDatabase = FirebaseDatabase.getInstance().getReference();
        mDatabase.child("visiting places").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                loadData(dataSnapshot);
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
                loadData(dataSnapshot);
            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        super.onCreate(savedInstanceState);
        setContentView(R.layout.visiting_places);
        myRecyclerView =(RecyclerView)findViewById(R.id.recycler_view);
        myRecyclerView.addOnItemTouchListener(new VisitingPlacesListener(this,myRecyclerView,this));
        Log.d(TAG, "onCreate: "+mVistingPlaceList);

    }

    public void loadData(DataSnapshot dataSnapshot)
    {

        VisitingPlace visitingPlace=dataSnapshot.getValue(VisitingPlace.class);
        mVistingPlaceList.add(visitingPlace);

        myAdapter = new VisitingPlacesAdapter(VisitingPlaces.this,mVistingPlaceList);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),2);
        myRecyclerView.setLayoutManager(gridLayoutManager);
        myRecyclerView.setAdapter(myAdapter);
    }

    @Override
    public void onItemClick(View view, int postition) {
        Log.d(TAG, "onItemClick: starts");
        Toast.makeText(this,"Normal tap at position "+postition,Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this,VisitingPlaceDetail.class);
        intent.putExtra("VISITING_PLACE_TRANSFER", myAdapter.getVistingPlace(postition));
        startActivity(intent);
    }

    @Override
    public void onItemLongClick(View view, int postition) {

    }
/*
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

*/
}

