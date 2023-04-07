package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Login extends AppCompatActivity {

    Button login_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
    }
    public void init(){
        login_btn = findViewById(R.id.btn1);
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_Login = new Intent(Login.this,MainActivity.class);
                startActivity(intent_Login);
                Toast.makeText(Login.this, "Login Complete", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void signup(View view) {
        Intent intent_signup = new Intent(Login.this,Signup.class);
        startActivity(intent_signup);
    }

    public void Forget(View view) {
        Intent intent_forget = new Intent(Login.this,Forget.class);
        startActivity(intent_forget);
    }
}