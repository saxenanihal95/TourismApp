package com.notnull.nihal.viewbhopal;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;



public class Visitingplaces extends AppCompatActivity {

    RecyclerView myRecyclerView;
    RecyclerView.Adapter myAdapter;
    //List mVistingPlaceList = new ArrayList<>(Arrays.asList("Person 1", "Person 2", "Person 3", "Person 4", "Person 5", "Person 6", "Person 7"));
    List mVistingPlaceList = new ArrayList<Visitingplaces>();
    private DatabaseReference mDatabase;
    private static final String TAG = "Visitingplaces";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.visiting_places);
        mDatabase = FirebaseDatabase.getInstance().getReference();
        for(int i=0;i<2;i++)
        {
            Query myTopPostsQuery = mDatabase.child("visiting places").child(String.valueOf(i));

            // My top posts by number of stars
            myTopPostsQuery.addValueEventListener(new ValueEventListener() {
                String about;
                String address;
                String entryFee;
                String goodFor;
                String openingHours;
                String title;
                String visitDuration;
                String websites;
                String imageUrl;
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    for (DataSnapshot postSnapshot: dataSnapshot.getChildren()) {

                        switch (postSnapshot.getKey()) {
                            case "About":
                                about = postSnapshot.getValue().toString();
                                break;
                            case "Address":
                                address = postSnapshot.getValue().toString();
                                break;
                            case "Entry Fee":
                                entryFee = postSnapshot.getValue().toString();
                                break;
                            case "Good For":
                                goodFor = postSnapshot.getValue().toString();
                                break;
                            case "Opening Hours":
                                openingHours = postSnapshot.getValue().toString();
                                break;
                            case "Title":
                                title = postSnapshot.getValue().toString();
                                break;
                            case "Visit Duration":
                                visitDuration = postSnapshot.getValue().toString();
                                break;
                            case "Websites":
                                websites = postSnapshot.getValue().toString();
                                break;
                            case "ImageUrl":
                                imageUrl = postSnapshot.getValue().toString();
                                break;
                        }
                    }
                    mVistingPlaceList.add(new VisitingPlace( title,  about,  address,  goodFor,  imageUrl,  openingHours,  visitDuration, websites));
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {
                    // Getting Post failed, log a message
                    Log.w(TAG, "loadPost:onCancelled", databaseError.toException());
                    // ...
                }
            });
        }


        myRecyclerView =(RecyclerView)findViewById(R.id.recycler_view);
        Log.d(TAG, "onCreate: "+mVistingPlaceList);
        myAdapter = new VisitingPlacesAdapter(Visitingplaces.this,mVistingPlaceList);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),2);
        myRecyclerView.setLayoutManager(gridLayoutManager);
        myRecyclerView.setAdapter(myAdapter);

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

