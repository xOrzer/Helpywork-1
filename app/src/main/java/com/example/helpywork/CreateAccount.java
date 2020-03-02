package com.example.helpywork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateAccount extends AppCompatActivity {

    private EditText newLogin;
    private EditText newPassword;
    private EditText confirmPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        newLogin = (EditText) findViewById(R.id.login);
        newPassword = (EditText) findViewById(R.id.password);
        confirmPassword = (EditText) findViewById(R.id.confirmPassword);
    }

    public void onClick(View v){
        Intent intent = new Intent(CreateAccount.this, Account.class);
        intent.putExtra("login", newLogin.getText().toString());
        if(newPassword.getText().toString().matches(confirmPassword.getText().toString())) {
            intent.putExtra("password", newPassword.getText().toString());
        }
        startActivity(intent);
    }
}
