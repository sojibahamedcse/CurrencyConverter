package com.example.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String[] Currency;
    Spinner spinner;
    Button button;
    EditText edtx;
    TextView taka,usd,euro,pound,dinar;
    CheckBox cusd,ctaka,cdinar,cpound,ceuro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtx =(EditText) findViewById(R.id.inputId);

        cusd = (CheckBox) findViewById(R.id.usdCheckBox);
        ctaka = (CheckBox) findViewById(R.id.takaCheckBox);
        cdinar = (CheckBox) findViewById(R.id.dinarCheckBox);
        cpound = (CheckBox) findViewById(R.id.poundCheckBox);
        ceuro = (CheckBox) findViewById(R.id.euroCheckBox);

        usd =(TextView) findViewById(R.id.usdText);
        taka =(TextView) findViewById(R.id.takaText);
        dinar =(TextView) findViewById(R.id.dinarText);
        pound =(TextView) findViewById(R.id.poundText);
        euro =(TextView) findViewById(R.id.euroText);

        button = (Button) findViewById(R.id.btnId);
        Currency = getResources().getStringArray(R.array.currency);
        spinner = findViewById(R.id.spinnerId);
        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<>(this, R.layout.sample_view, R.id.textViewsampleId, Currency);
        spinner.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Converter();
            }
        });
    }

    public void Converter() {
        String st_usd = usd.getText().toString().trim();
        String st_taka = taka.getText().toString().trim();
        String st_dinar = dinar.getText().toString().trim();
        String st_pound = pound.getText().toString().trim();
        String st_euro = euro.getText().toString().trim();

        String inputType = spinner.getSelectedItem().toString().trim();

        if (inputType.equals("USD")) {
            if (cusd.isChecked()) {
                String input = edtx.getText().toString().trim();
                final double inputItem = Integer.parseInt(input);
                double result=inputItem*1;
                String st_result=String.valueOf(result);
                usd.setText(st_result);
            }
            else {
                usd.setText("");
            }
            if (ceuro.isChecked()) {
                String input = edtx.getText().toString().trim();
                final double inputItem = Integer.parseInt(input);
                double result=inputItem*0.89;
                String st_result=String.valueOf(result);
                euro.setText(st_result);
            }
            else {
                euro.setText("");
            }
            if (cpound.isChecked()) {
                String input = edtx.getText().toString().trim();
                final double inputItem = Integer.parseInt(input);
                double result=inputItem*17.33;
                String st_result=String.valueOf(result);
                pound.setText(st_result);
            }
            else {
                pound.setText("");
            }
            if (cdinar.isChecked()) {
                String input = edtx.getText().toString().trim();
                final double inputItem = Integer.parseInt(input);
                double result=inputItem*0.30;
                String st_result=String.valueOf(result);
                dinar.setText(st_result);

            }
            else {
                dinar.setText("");
            }
            if (ctaka.isChecked()) {
                String input = edtx.getText().toString().trim();
                final double inputItem = Integer.parseInt(input);
                double result=inputItem*84.24;
                String st_result=String.valueOf(result);
                taka.setText(st_result);

            }
            else {
                taka.setText("");
            }
        }
        if (inputType.equals("TAKA")) {
            if (cusd.isChecked()) {
                String input = edtx.getText().toString().trim();
                final double inputItem = Integer.parseInt(input);
                double result=inputItem*0.012;
                String st_result=String.valueOf(result);
                usd.setText(st_result);
            }
            else {
                usd.setText("");
            }
            if (ceuro.isChecked()) {
                String input = edtx.getText().toString().trim();
                final double inputItem = Integer.parseInt(input);
                double result=inputItem*0.011;
                String st_result=String.valueOf(result);
                euro.setText(st_result);
            }
            else {
                euro.setText("");
            }
            if (cpound.isChecked()) {
                String input = edtx.getText().toString().trim();
                final double inputItem = Integer.parseInt(input);
                double result=inputItem*0.21;
                String st_result=String.valueOf(result);
                pound.setText(st_result);
            }
            else {
                pound.setText("");
            }
            if (cdinar.isChecked()) {
                String input = edtx.getText().toString().trim();
                final double inputItem = Integer.parseInt(input);
                double result=inputItem*0.0036;
                String st_result=String.valueOf(result);
                dinar.setText(st_result);

            }
            else {
                dinar.setText("");
            }
            if (ctaka.isChecked()) {
                String input = edtx.getText().toString().trim();
                final double inputItem = Integer.parseInt(input);
                double result=inputItem*1;
                String st_result=String.valueOf(result);
                taka.setText(st_result);

            }
            else {
                taka.setText("");
            }

        }
        if (inputType.equals("DINAR")) {
            if (cusd.isChecked()) {
                String input = edtx.getText().toString().trim();
                final double inputItem = Integer.parseInt(input);
                double result=inputItem*3.28;
                String st_result=String.valueOf(result);
                usd.setText(st_result);
            }
            else {
                usd.setText("");
            }
            if (ceuro.isChecked()) {
                String input = edtx.getText().toString().trim();
                final double inputItem = Integer.parseInt(input);
                double result=inputItem*2.93;
                String st_result=String.valueOf(result);
                euro.setText(st_result);
            }
            else {
                euro.setText("");
            }
            if (cpound.isChecked()) {
                String input = edtx.getText().toString().trim();
                final double inputItem = Integer.parseInt(input);
                double result=inputItem*56.88;
                String st_result=String.valueOf(result);
                pound.setText(st_result);
            }
            else {
                pound.setText("");
            }
            if (cdinar.isChecked()) {
                String input = edtx.getText().toString().trim();
                final double inputItem = Integer.parseInt(input);
                double result=inputItem*1;
                String st_result=String.valueOf(result);
                dinar.setText(st_result);

            }
            else {
                dinar.setText("");
            }
            if (ctaka.isChecked()) {
                String input = edtx.getText().toString().trim();
                final double inputItem = Integer.parseInt(input);
                double result=inputItem*276.58;
                String st_result=String.valueOf(result);
                taka.setText(st_result);

            }
            else {
                taka.setText("");
            }

        }
        if (inputType.equals("POUND")) {
            if (cusd.isChecked()) {
                String input = edtx.getText().toString().trim();
                final double inputItem = Integer.parseInt(input);
                double result=inputItem*0.058;
                String st_result=String.valueOf(result);
                usd.setText(st_result);
            }
            else {
                usd.setText("");
            }
            if (ceuro.isChecked()) {
                String input = edtx.getText().toString().trim();
                final double inputItem = Integer.parseInt(input);
                double result=inputItem*0.052;
                String st_result=String.valueOf(result);
                euro.setText(st_result);
            }
            else {
                euro.setText("");
            }
            if (cpound.isChecked()) {
                String input = edtx.getText().toString().trim();
                final double inputItem = Integer.parseInt(input);
                double result=inputItem*1;
                String st_result=String.valueOf(result);
                pound.setText(st_result);
            }
            else {
                pound.setText("");
            }
            if (cdinar.isChecked()) {
                String input = edtx.getText().toString().trim();
                final double inputItem = Integer.parseInt(input);
                double result=inputItem*0.018;
                String st_result=String.valueOf(result);
                dinar.setText(st_result);

            }
            else {
                dinar.setText("");
            }
            if (ctaka.isChecked()) {
                String input = edtx.getText().toString().trim();
                final double inputItem = Integer.parseInt(input);
                double result=inputItem*4.86;
                String st_result=String.valueOf(result);
                taka.setText(st_result);

            }
            else {
                taka.setText("");
            }

        }
        if (inputType.equals("EURO")) {
            if (cusd.isChecked()) {
                String input = edtx.getText().toString().trim();
                final double inputItem = Integer.parseInt(input);
                double result=inputItem*0.89;
                String st_result=String.valueOf(result);
                usd.setText(st_result);
            }
            else {
                usd.setText("");
            }
            if (ceuro.isChecked()) {
                String input = edtx.getText().toString().trim();
                final double inputItem = Integer.parseInt(input);
                double result=inputItem*1;
                String st_result=String.valueOf(result);
                euro.setText(st_result);
            }
            else {
                euro.setText("");
            }
            if (cpound.isChecked()) {
                String input = edtx.getText().toString().trim();
                final double inputItem = Integer.parseInt(input);
                double result=inputItem*19.40;
                String st_result=String.valueOf(result);
                pound.setText(st_result);
            }
            else {
                pound.setText("");
            }
            if (cdinar.isChecked()) {
                String input = edtx.getText().toString().trim();
                final double inputItem = Integer.parseInt(input);
                double result=inputItem*0.34;
                String st_result=String.valueOf(result);
                dinar.setText(st_result);

            }
            else {
                dinar.setText("");
            }
            if (ctaka.isChecked()) {
                String input = edtx.getText().toString().trim();
                final double inputItem = Integer.parseInt(input);
                double result=inputItem*94.37;
                String st_result=String.valueOf(result);
                taka.setText(st_result);

            }
            else {
                taka.setText("");
            }

        }

    }
}
