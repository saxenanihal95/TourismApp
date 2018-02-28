package com.notnull.nsaxena.viewbhopal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;


public class Restaurants extends AppCompatActivity implements RestaurantsListener.OnReclyclerClickListener{

    RecyclerView myRecyclerView;
    RestaurantsAdapter myAdapter;
    List mRestaurants = new ArrayList<Restaurant>();
    private DatabaseReference mDatabase;
    private static final String TAG = "Restaurants";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mDatabase = FirebaseDatabase.getInstance().getReference();
        mDatabase.child("restaurants").addChildEventListener(new ChildEventListener() {
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
        setContentView(R.layout.restaurants);
        myRecyclerView =(RecyclerView)findViewById(R.id.recycler_view);
        myRecyclerView.addOnItemTouchListener(new RestaurantsListener(this,myRecyclerView,this));
        Log.d(TAG, "onCreate: "+ mRestaurants);

    }

    public void loadData(DataSnapshot dataSnapshot)
    {

        Restaurant restaurant=dataSnapshot.getValue(Restaurant.class);
        mRestaurants.add(restaurant);

        myAdapter = new RestaurantsAdapter(Restaurants.this, mRestaurants);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),2);
        myRecyclerView.setLayoutManager(gridLayoutManager);
        myRecyclerView.setAdapter(myAdapter);
    }

    @Override
    public void onItemClick(View view, int postition) {
        Log.d(TAG, "onItemClick: starts");
        Intent intent = new Intent(this,RestaurantDetails.class);
        intent.putExtra("RESTAURANT_TRANSFER", myAdapter.getRestaurant(postition));
        startActivity(intent);
    }

    @Override
    public void onItemLongClick(View view, int postition) {

    }

    /*
    public void buttonFunction15(View v)
    {
        Intent intent= new Intent(getApplicationContext(), natural.class);
        startActivity(intent);
    }

*/
}
