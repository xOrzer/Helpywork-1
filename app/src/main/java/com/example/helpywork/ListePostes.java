package com.example.helpywork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListePostes extends AppCompatActivity {
    private String[] postes = new String[]{
            "Physique - Mesure quantité de matière", "Physique - Calculs Conductimétrie", "Physique - Chute des corps et énérgie", "Physique - Energie, matière et rayonnement", "Physique - Photon", "Physique - Variation des températures"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_postes);

        ListView mListView = (ListView) findViewById(R.id.listView);

        final ArrayAdapter<String> adaptername = new ArrayAdapter<String>(ListePostes.this,
                android.R.layout.simple_list_item_1, postes);
        mListView.setAdapter(adaptername);
    }
}
