package com.example.hellosummer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        Button btn = findViewById(R.id.button);

        btn.setOnClickListener(v -> openMain());

        ImageSlider imageSlider = findViewById(R.id.imageSlider);
        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.burger, ScaleTypes.CENTER_INSIDE));
        slideModels.add(new SlideModel(R.drawable.cake, ScaleTypes.CENTER_INSIDE));
        slideModels.add(new SlideModel(R.drawable.beverage, ScaleTypes.CENTER_INSIDE));
        slideModels.add(new SlideModel(R.drawable.bread, ScaleTypes.CENTER_INSIDE));


        imageSlider.setImageList(slideModels,ScaleTypes.CENTER_INSIDE);
    }

    public void openMain(){
        Intent intent    = new Intent(this, MainActivity.class);
        startActivity(intent);
    }



}