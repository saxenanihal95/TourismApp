package com.notnull.nsaxena.viewbhopal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class RestaurantDetails extends AppCompatActivity {

    private static final String TAG = "RestaurantDetails";

    TextView address,cuisines,openingHours,highlights,cost;

    ImageView restaurantImage;

    Button mapButton;

    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_details);

        address=findViewById(R.id.drop1);
        cuisines=findViewById(R.id.drop2);
        openingHours=findViewById(R.id.drop3);
        highlights=findViewById(R.id.drop4);
        cost=findViewById(R.id.drop5);
        restaurantImage=findViewById(R.id.imageView);
        linearLayout=findViewById(R.id.linearlayout);
        Intent intent = getIntent();
        final Restaurant restaurant = (Restaurant)intent.getSerializableExtra("RESTAURANT_TRANSFER");

        Glide.with(getApplicationContext()).load(restaurant.getImageUrl()).into(restaurantImage);
        address.setText(restaurant.getAddress());
        cuisines.setText(restaurant.getCuisines());
        openingHours.setText(restaurant.getOpeningHours());
        highlights.setText(restaurant.getHighlights());
        cost.setText(restaurant.getCost());

        for(String menuImage:restaurant.getMenuImages())
        {
            ImageView currentImage = new ImageView(this);
            linearLayout.addView(currentImage);
            Glide.with(getApplicationContext()).load(menuImage).into(currentImage);
        }

        mapButton=(Button) findViewById(R.id.mapButton);

        mapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(getApplicationContext(),MapsActivity.class);
                intent.putExtra("LAT",restaurant.getLatitude());
                intent.putExtra("LNG",restaurant.getLongitude());
                startActivity(intent);            }
        });
    }

}
