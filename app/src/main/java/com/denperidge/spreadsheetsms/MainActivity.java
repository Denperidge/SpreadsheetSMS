package com.denperidge.spreadsheetsms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import okhttp3.OkHttp;
import okhttp3.OkHttpClient;

public class MainActivity extends AppCompatActivity {
    OkHttpClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        client = new OkHttpClient();

        EditText etURL = findViewById(R.id.etURL);
        etURL.addTextChangedListener(new android.text.TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                String csv = downloadGSheetAsCsv(s.toString());
                loadCsvIntoTable(csv);
            }
        });
    }

    private String downloadGSheetAsCsv(String url) {



        return url;
    }

    private void loadCsvIntoTable(String csv) {

    }
}