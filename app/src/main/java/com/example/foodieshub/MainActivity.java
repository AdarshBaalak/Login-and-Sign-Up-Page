package com.example.foodieshub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 Button login;
 Button register;
 Button skip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login=findViewById(R.id.log_in_btn_main);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Login has been Clicked", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,SignIn.class);
                startActivity(intent);
            }
        });
        register=findViewById(R.id.register_btn_main);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Register has been Clicked", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,SignUp.class);
                startActivity(intent);
            }
        });
        skip=findViewById(R.id.skip_btn_main);
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Skip has been Clicked", Toast.LENGTH_SHORT).show();
               Intent intent=new Intent(MainActivity.this,Home.class);
               startActivity(intent);
            }
        });
    }
}