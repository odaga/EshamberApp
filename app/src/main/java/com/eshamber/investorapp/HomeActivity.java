package com.eshamber.investorapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {

    private static final String TAG = "HomeActivity";

    private Button buttonAvailableFarms;
    private CardView cardViewTransactions;
    private CardView cardViewProjections;
    private CardView cardViewFarmUpdates;
    private CardView cardViewAccounts;
    private ImageView imageViewSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        buttonAvailableFarms = findViewById(R.id.button_available_farms);
        cardViewTransactions = findViewById(R.id.card_transaction);
        cardViewProjections = findViewById(R.id.Card_investment_projections);
        cardViewFarmUpdates = findViewById(R.id.card_Farm_update);
        imageViewSettings = findViewById(R.id.image_view_settings);
        cardViewAccounts = findViewById(R.id.card_view_account);


        buttonAvailableFarms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), AvailableFarmsActivity.class));
            }
        });


        cardViewProjections.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ProjectionsActivity.class));
            }
        });

        cardViewTransactions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), TransactionsActivity.class));
            }
        });

        cardViewFarmUpdates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), FarmUpdatesActivity.class));
            }
        });

        imageViewSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), SettingsActivity.class));
            }
        });

        cardViewAccounts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), AccountsActivity.class));
            }
        });
    }
}
