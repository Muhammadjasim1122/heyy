package com.example.heyyy.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.heyyy.R;

public class MainActivity extends AppCompatActivity {
      Button btn ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      btn = findViewById(R.id.startbtn);
      btn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent hf = new Intent(MainActivity.this, MainActivity2.class);
              startActivity(hf);
          }
      });
    }
}