package com.example.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    String[] Currency;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Currency = getResources().getStringArray(R.array.currency);
        spinner = findViewById(R.id.spinnerId);
        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<>(this, R.layout.sample_view, R.id.textViewsampleId, Currency);
        spinner.setAdapter(adapter);
    }
}
