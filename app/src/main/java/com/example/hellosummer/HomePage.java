package com.example.hellosummer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;



public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        Button btn = findViewById(R.id.button);

        btn.setOnClickListener(v -> openMain());


    }

    public void openMain(){
        Intent intent    = new Intent(this, MainActivity.class);
        startActivity(intent);
    }



}