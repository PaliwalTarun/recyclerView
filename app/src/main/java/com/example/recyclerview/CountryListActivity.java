package com.example.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class  CountryListActivity extends AppCompatActivity {

       private RecyclerView recyclerView;
        private CountryAdapter adapter;
        private List<Country> countryList;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_country_list);

            recyclerView = findViewById(R.id.recyclerView);
            countryList = createCountryList(); // Create a list of countries
            adapter = new CountryAdapter(countryList);

            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setAdapter(adapter);
        }

        private List<Country> createCountryList() {
            // Create and return a list of countries and their capitals
            List<Country> countries = new ArrayList<>();
            countries.add(new Country("Country1", "Capital1"));
            countries.add(new Country("Country2", "Capital2"));
            countries.add(new Country("Country3", "Capital3"));
            countries.add(new Country("Country4", "Capital4"));
            countries.add(new Country("Country5", "Capital5"));
            countries.add(new Country("Country6", "Capital6"));
            countries.add(new Country("Country7", "Capital7"));
            countries.add(new Country("Country8", "Capital8"));
            // Add more countries...
            return countries;
        }
    }

