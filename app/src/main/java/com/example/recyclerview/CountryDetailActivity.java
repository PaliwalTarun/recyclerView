package com.example.recyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CountryDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_detail);

        TextView textViewCapital = findViewById(R.id.textViewCapital);

        Intent intent = getIntent();
        if (intent != null) {
            String countryName = intent.getStringExtra("country_name");
            String capital = getCapitalForCountry(countryName); // Implement this method
            textViewCapital.setText(capital);
        }
    }

    private String getCapitalForCountry(String countryName) {
        // Implement a method to look up the capital for the given
        return "Capital of " + countryName;
    }
}