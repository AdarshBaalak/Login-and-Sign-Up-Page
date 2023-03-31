package com.example.foodieshub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        tv= findViewById(R.id.tv_sign_up);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignUp.this, "Wait", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(SignUp.this,SignIn.class);
                startActivity(intent);
            }
        });
    }
}