//Android Developer Training Session 3 - Assignment 3.1

//Implement an app to take input from user and search the user entered data in Google search engine using intents.


package com.example.sandeep.webpage;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openWebPage(View v) {
        Intent webIntent = new Intent(Intent.ACTION_VIEW);
        webIntent.setData(Uri.parse("http://www.google.com"));
        startActivity(webIntent);

    }

}
