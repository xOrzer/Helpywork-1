package com.example.helpywork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;

public class AideEnLigne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aide_en_ligne);

        Spinner spinnerMatiere = (Spinner) findViewById(R.id.spinnerMatiere);
        Spinner spinnerNiveau = (Spinner) findViewById(R.id.spinnerNiveau);

        //layoutList.setVisibility(View.INVISIBLE);

        /* ----------------------------------------------------------------------- */

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.matiere_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMatiere.setAdapter(adapter);

        /* ----------------------------------------------------------------------- */

        adapter = ArrayAdapter.createFromResource(this,
                R.array.niveau_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerNiveau.setAdapter(adapter);
    }
}
