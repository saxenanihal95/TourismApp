package com.notnull.nsaxena.viewbhopal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class TempleDetails extends AppCompatActivity {

    TextView address,openingHours,about;

    ImageView templeImage;

    Button mapButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temple_details);

        address=findViewById(R.id.drop1);
        openingHours=findViewById(R.id.drop2);
        about=findViewById(R.id.drop3);

        templeImage=findViewById(R.id.imageView);

        Intent intent = getIntent();
        final Temple temple = (Temple)intent.getSerializableExtra("TEMPLE_TRANSFER");

        Glide.with(getApplicationContext()).load(temple.getImageUrl()).into(templeImage);
        address.setText(temple.getAddress());
        openingHours.setText(temple.getOpeningHours());
        about.setText(temple.getAbout());

        mapButton=(Button) findViewById(R.id.mapButton);

        mapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(getApplicationContext(),MapsActivity.class);
                intent.putExtra("LAT",temple.getLatitude());
                intent.putExtra("LNG",temple.getLongitude());
                startActivity(intent);            }
        });
    }
}
