package com.eshamber.investorapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
public class AvailableFarmsActivity extends AppCompatActivity {
    private static final String TAG = "AvailableFarmsActivity";

    private Toolbar mActionBarToolbar;
    private CardView cardViewFarm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_available_farms);

        mActionBarToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mActionBarToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Available Farms");

        cardViewFarm = findViewById(R.id.card_view_farm);

        cardViewFarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AvailableFarmsActivity.this, FarmDetailsActivity.class));
            }
        });
    }
}
