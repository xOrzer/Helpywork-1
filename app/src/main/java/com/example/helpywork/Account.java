package com.example.helpywork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Account extends AppCompatActivity {

    private TextView name;
    private TextView pw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        name = (TextView) findViewById(R.id.name);
        pw = (TextView) findViewById(R.id.pwAccount);

        Intent intent = getIntent();
        name.setText(intent.getStringExtra("login"));
        pw.setText(intent.getStringExtra("password"));
    }
}
