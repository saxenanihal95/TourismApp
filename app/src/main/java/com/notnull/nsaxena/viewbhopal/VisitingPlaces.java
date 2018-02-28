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
        Intent intent = new Intent(this,VisitingPlaceDetails.class);
        intent.putExtra("VISITING_PLACE_TRANSFER", myAdapter.getVistingPlace(postition));
        startActivity(intent);
    }

    @Override
    public void onItemLongClick(View view, int postition) {

    }

}

