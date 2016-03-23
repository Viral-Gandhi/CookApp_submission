package com.example.viral.cookapp_recipeselect;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

public class SearchRecipes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_recipes);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String[] AllRecipes = new String[3];
        AllRecipes[0] = "Falafel";
        AllRecipes[1] = "Korma";
        AllRecipes[2] = "Chicken Tikka";

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.listviewrecsearchlayout, AllRecipes);
        ListView listRecs = (ListView) findViewById(R.id.listViewSearchRec);
        listRecs.setAdapter(adapter);
        listRecs.setOnItemClickListener(new openIntents());

        SearchView SearchRec = (SearchView) findViewById(R.id.searchViewSearchRec);
        SearchRec.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

            @Override
            public boolean onQueryTextSubmit(String RecSearched) {
            return false;
            }

            @Override
            public boolean onQueryTextChange(String RecSearched) {

                    adapter.getFilter().filter(RecSearched);

                return false;
            }
        });
    }

    public class openIntents implements AdapterView.OnItemClickListener{
        public void onItemClick(AdapterView<?> parent, View viewClicked, int position, long id) {
            if(position==0){
                Intent openFalafel = new Intent(SearchRecipes.this, RecipeOne.class);
                startActivity(openFalafel);
            }
            else if (position == 1) {
                Intent openKorma = new Intent(SearchRecipes.this, CuisineFind.class);
                startActivity(openKorma);
            }
        }
    }



}
