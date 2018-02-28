package com.notnull.nsaxena.viewbhopal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class VisitingPlaceDetails extends AppCompatActivity {
    private static final String TAG = "VisitingPlaceDetails";

    TextView address,goodFor,openingHours,entryFee,website,visitDuration,about;

    ImageView visitingPlaceImage;

    Button mapButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visiting_place_detail);
        // loading album cover using Glide library

        address=findViewById(R.id.drop1);
        goodFor=findViewById(R.id.drop2);
        openingHours=findViewById(R.id.drop3);
        entryFee=findViewById(R.id.drop4);
        website=findViewById(R.id.drop5);
        visitDuration=findViewById(R.id.drop6);
        about=findViewById(R.id.drop7);
        visitingPlaceImage=findViewById(R.id.imageView);
        Intent intent = getIntent();
        final VisitingPlace visitingPlace = (VisitingPlace)intent.getSerializableExtra("VISITING_PLACE_TRANSFER");
        Glide.with(getApplicationContext()).load(visitingPlace.getImageUrl()).into(visitingPlaceImage);
        address.setText(visitingPlace.getAddress());
        goodFor.setText(visitingPlace.getGoodFor());
        openingHours.setText(visitingPlace.getOpeningHours());
        entryFee.setText(visitingPlace.getEntryFee());
        website.setText(visitingPlace.getWebsites());
        visitDuration.setText(visitingPlace.getVisitDuration());
        about.setText(visitingPlace.getAbout());
        mapButton=(Button) findViewById(R.id.mapButton);

        mapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(getApplicationContext(),MapsActivity.class);
                intent.putExtra("LAT",Double.valueOf(visitingPlace.getLatitude()));
                intent.putExtra("LNG",Double.valueOf(visitingPlace.getLongitude()));
                startActivity(intent);            }
        });

    }
}
