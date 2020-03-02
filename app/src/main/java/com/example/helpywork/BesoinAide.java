package com.example.helpywork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class BesoinAide extends AppCompatActivity {

    ImageButton enLigne;
    ImageButton aDomicile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_besoin_aide);

        enLigne = (ImageButton) findViewById(R.id.aideEnLigne);
        aDomicile = (ImageButton) findViewById(R.id.aideADomicile);

    }

    public void onClickenLigne(View v){
        Intent intent = new Intent(BesoinAide.this, AideEnLigne.class);
        startActivity(intent);
    }

    public void onClickDomicile(View v){
        Intent intent = new Intent(BesoinAide.this, AideDomicile.class);
        startActivity(intent);
    }



}
