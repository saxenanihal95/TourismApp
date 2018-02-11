package com.notnull.nsaxena.viewbhopal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class VisitingPlaceDetail extends AppCompatActivity {
    private static final String TAG = "VisitingPlaceDetail";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visiting_place_detail);

        Intent intent = getIntent();
        VisitingPlace visitingPlace = (VisitingPlace)intent.getSerializableExtra("VISITING_PLACE_TRANSFER");
        Log.d(TAG, "onCreate: "+visitingPlace);
    }
}
