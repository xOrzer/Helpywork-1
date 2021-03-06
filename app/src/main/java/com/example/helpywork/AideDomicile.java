package com.example.helpywork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;

public class AideDomicile extends AppCompatActivity {

    private String[] prenoms = new String[]{
            "Antoine", "Benoit", "Cyril", "David", "Eloise", "Florent",
            "Gerard", "Hugo", "Ingrid"
    };

    LinearLayout layoutList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aide_domicile);


        Spinner spinnerMatiere = (Spinner) findViewById(R.id.spinnerMatiere);
        Spinner spinnerNiveau = (Spinner) findViewById(R.id.spinnerNiveau);
        layoutList = (LinearLayout) findViewById(R.id.layoutList);

        layoutList.setVisibility(View.INVISIBLE);

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

        ListView mListView = (ListView) findViewById(R.id.listView);

        final ArrayAdapter<String> adaptername = new ArrayAdapter<String>(AideDomicile.this,
                android.R.layout.simple_list_item_1, prenoms);
        mListView.setAdapter(adaptername);
    }

    public void onClick(View v){

        layoutList.setVisibility(View.VISIBLE);
    }


}
