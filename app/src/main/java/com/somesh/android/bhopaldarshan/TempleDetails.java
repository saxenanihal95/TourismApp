package com.somesh.android.bhopaldarshan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

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

        Glide.with(getApplicationContext())
                .load(temple.getImageUrl())
                .thumbnail(Glide.with(getApplicationContext()).load(R.drawable.giphy))
                .apply(new RequestOptions()
                        .error(R.drawable.broken_image))
                .into(templeImage);
        address.setText(temple.getAddress());
        openingHours.setText(temple.getOpeningHours());
        about.setText(temple.getAbout());

        mapButton=(Button) findViewById(R.id.mapButton);

        mapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(getApplicationContext(),MapsActivity.class);
                intent.putExtra("LAT",Double.valueOf(temple.getLatitude()));
                intent.putExtra("LNG",Double.valueOf(temple.getLongitude()));
                startActivity(intent);            }
        });
    }
}
