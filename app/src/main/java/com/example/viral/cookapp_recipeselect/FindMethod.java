package com.example.viral.cookapp_recipeselect;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class FindMethod extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_method);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button StartCuisineSelect = (Button) findViewById(R.id.buttonCuisineChoose);
        StartCuisineSelect.setOnClickListener(new View.OnClickListener() {


            public void onClick(View view) {
                Intent openCuisineSelect = new Intent(FindMethod.this, CuisineFind.class);
                startActivity(openCuisineSelect);
            }
        });

        Button StartSearchRecipe = (Button) findViewById(R.id.buttonAllRecipes);
        StartSearchRecipe.setOnClickListener(new View.OnClickListener() {


            public void onClick(View view) {
                Intent openSearchRecipes = new Intent(FindMethod.this, SearchRecipes.class);
                startActivity(openSearchRecipes);
            }
        });
    }

}
