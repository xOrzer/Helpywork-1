package com.example.helpywork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Account extends AppCompatActivity {

    private TextView name;
    private TextView pw;

    private int CREATE = 1;
    private ImageButton selected;

    private ImageButton teacher_btn;
    private ImageButton student_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        teacher_btn = (ImageButton) findViewById(R.id.teacherButton);
        student_btn = (ImageButton) findViewById(R.id.studentButton);

        teacher_btn.setTag("teacher");
        student_btn.setTag("student");

        name = (TextView) findViewById(R.id.name);

        Intent intent = getIntent();
        name.setText(intent.getStringExtra("login"));
    }

    public void onClick(View v){
        selected = findViewById(v.getId());


        if(selected.getTag() == "teacher"){
            Intent intent = new Intent(Account.this, ProposerAide.class);
            startActivity(intent);
        } else if ( selected.getTag() == "student"){
            Intent intent = new Intent(Account.this, BesoinAide.class);
            startActivity(intent);
        }

    }
}