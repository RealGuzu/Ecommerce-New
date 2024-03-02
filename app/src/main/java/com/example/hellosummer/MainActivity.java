package com.example.hellosummer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.hellosummer.databinding.ActivityMainBinding;

import java.util.ArrayList;




public class MainActivity extends AppCompatActivity {

CardView fruitsCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fruitsCard = findViewById(R.id.fruitCard);

        fruitsCard.setOnClickListener(v -> {
            Intent intent  = new Intent(MainActivity.this, ActivityFruits.class);
            startActivity(intent);
        });


        ImageSlider imageSlider = findViewById(R.id.imageSlider);
        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.burger, ScaleTypes.CENTER_INSIDE));
        slideModels.add(new SlideModel(R.drawable.cake, ScaleTypes.CENTER_INSIDE));
        slideModels.add(new SlideModel(R.drawable.beverage, ScaleTypes.CENTER_INSIDE));
        slideModels.add(new SlideModel(R.drawable.bread, ScaleTypes.CENTER_INSIDE));


        imageSlider.setImageList(slideModels,ScaleTypes.CENTER_INSIDE);
    }
}