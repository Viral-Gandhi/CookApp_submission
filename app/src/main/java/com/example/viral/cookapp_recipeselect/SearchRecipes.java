package com.example.viral.cookapp_recipeselect;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SearchRecipes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_recipes);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        populatingListRecs();
    }
    private void populatingListRecs() {
        final int NO_RECIPES = 3;
        String[] AllRecipes = new String[NO_RECIPES];
        AllRecipes[0] = "Falafel";
        AllRecipes[1] = "Korma";
        AllRecipes[2] = "Chicken Tikka";

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(SearchRecipes.this, R.layout.activity_search_recipes, AllRecipes);
        ListView listRecs = (ListView) findViewById(R.id.listViewSearchRec);
        listRecs.setAdapter(adapter);
    }
  }
