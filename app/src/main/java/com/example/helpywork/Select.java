package com.example.helpywork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Select extends AppCompatActivity {


    private int CREATE = 1;
    private ImageButton selected;
    private ImageButton teacher_btn;
    private ImageButton student_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teacher_btn = (ImageButton) findViewById(R.id.teacherButton);
        student_btn = (ImageButton) findViewById(R.id.studentButton);

        teacher_btn.setTag("teacher");
        student_btn.setTag("student");
    }

    public void onClick(View v){
        selected = findViewById(v.getId());

        Intent intent = new Intent(Select.this, CreateAccount.class);
        if(selected.getTag() == "teacher"){
            intent.putExtra("personType", "teacher");
        } else if ( selected.getTag() == "student"){
            intent.putExtra("personType", "student");
        }
        startActivityForResult(intent, CREATE);
    }
}
