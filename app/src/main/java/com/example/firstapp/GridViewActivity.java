package com.example.firstapp;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class GridViewActivity extends AppCompatActivity {

    android.widget.GridView fruitIV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        fruitIV = findViewById(R.id.GVfruits);
        ArrayList<GridModel> FruitModelArrayList = new ArrayList<>();

        FruitModelArrayList.add(new GridModel("Apples", R.drawable.apple));
        FruitModelArrayList.add(new GridModel("Mangoes", R.drawable.mango));
        FruitModelArrayList.add(new GridModel("Orange", R.drawable.orange));
        FruitModelArrayList.add(new GridModel("Watermelon", R.drawable.watermelon));
        FruitModelArrayList.add(new GridModel("Grapes", R.drawable.grapes));

        GridAdapter adapter = new GridAdapter(this, FruitModelArrayList);
        fruitIV.setAdapter(adapter);


    }

    public void goBackOnClick(View view) {
        finish();
    }
}