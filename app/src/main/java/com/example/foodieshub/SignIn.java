package com.example.foodieshub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SignIn extends AppCompatActivity {
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
     tv=findViewById(R.id.tv_sign_in);
     tv.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent intent=new Intent(SignIn.this,SignUp.class);
             startActivity(intent);
         }
     });

    }
}