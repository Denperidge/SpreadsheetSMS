package com.denperidge.spreadsheetsms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/*
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.gson.GsonFactory;
//import com.google.api.services.sheets.v4.Sheets;
*/

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.time.temporal.ValueRange;


public class MainActivity extends AppCompatActivity {

    /*
    NetHttpTransport http_transport;
    JsonFactory json_factory;
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        try {
            http_transport = GoogleNetHttpTransport.newTrustedTransport();
        } catch (GeneralSecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        json_factory = new GsonFactory();

         */


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
                try {
                    getDataFromGSheet(s.toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
    }

    private String getDataFromGSheet(String url) throws IOException {
        /*
        String spreadsheetId = url.split("/")[4];
        HttpRequestInitializer httpRequestInitializer = new HttpRequestInitializer() {
            @Override
            public void initialize(HttpRequest request) throws IOException {

            }
        };
        Sheets service = new Sheets.Builder(http_transport, json_factory, httpRequestInitializer).build();
        com.google.api.services.sheets.v4.model.ValueRange response =
                service.spreadsheets().values().get(spreadsheetId, "A:Z").execute();


        return url;
         */
        return "";
    }
}