package com.example.foodieshub;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;

public class FrontPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_page);

        Thread thread=new Thread(){
          public void run(){
              try {
               sleep(1000);
              }
              catch (Exception e){
              e.printStackTrace();
               }
              finally {
                  Intent intent=new Intent(FrontPage.this,MainActivity.class);
                  startActivity(intent);
              }
              }
        };thread.start();
    }


}