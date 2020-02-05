package com.eshamber.investorapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class FarmDetailsActivity extends AppCompatActivity {
    private static final String TAG = "FarmDetailsActivity";

    private Toolbar mActionBarToolbar;
    private CardView cardViewInvestFarm;
    //  private Button buttonSubFarmUnits, buttonAddFarmUnits;
    private TextView textViewSelectedFarmUnits;
    private TextView textViewAmount, textViewPayBackAmount, textViewReturns;
    private int rate = 22;
    private int farmUnits = 1;
    private float returns;
    private float totalPay;
    NumberPicker numberPicker;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farm_details);

        mActionBarToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mActionBarToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Farm Details");

        cardViewInvestFarm = findViewById(R.id.card_view_invest);
        //  buttonSubFarmUnits = findViewById(R.id.button_sub_farm_units);
        //  buttonAddFarmUnits = findViewById(R.id.button_add_farm_units);
        // textViewSelectedFarmUnits = findViewById(R.id.text_view_selected_farm_units);
        textViewAmount = findViewById(R.id.text_view_amount);
        textViewPayBackAmount = findViewById(R.id.text_view_payback_amount);
        textViewReturns = findViewById(R.id.text_view_returns_amount);
        numberPicker = findViewById(R.id.numberPicker);

        numberPicker.setMinValue(1);
        numberPicker.setMaxValue(100);

        numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {

                farmUnits = numberPicker.getValue();

            }
        });


        cardViewInvestFarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(FarmDetailsActivity.this, "Go to choose a payment method", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
