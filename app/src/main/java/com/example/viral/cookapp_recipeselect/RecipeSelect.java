package com.example.viral.cookapp_recipeselect;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.common.api.GoogleApiClient;

public class RecipeSelect extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_select);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*
        *Following Section has code introducing a new button that will respond to a user clicking.
        *It requires the button to be bale to find the correct ID from the set of IDs available in
        *the .XML file for this Activity, where styles etc can be applied. This links the current
        *activity with the appropriate recipe's activity.*/
        final int NO_BUTTONS=12;
        Button[] btns = new Button[NO_BUTTONS];
        btns[0] = (Button) findViewById(R.id.Rec1);
        btns[1] = (Button) findViewById(R.id.Rec2);
        btns[2] = (Button) findViewById(R.id.Rec3);
        btns[3] = (Button) findViewById(R.id.Rec4);
        btns[4] = (Button) findViewById(R.id.Rec5);
        btns[5] = (Button) findViewById(R.id.Rec6);
        btns[6] = (Button) findViewById(R.id.Rec7);
        btns[7] = (Button) findViewById(R.id.Rec8);
        btns[8] = (Button) findViewById(R.id.Rec9);
        btns[9] = (Button) findViewById(R.id.Rec10);
        btns[10] = (Button) findViewById(R.id.Rec11);
        btns[11] = (Button) findViewById(R.id.Rec12);


        Button Recipe1 = btns[0];
        Recipe1.setOnClickListener(new View.OnClickListener() {


            public void onClick(View view) {
            Intent openRecipeOne = new Intent(RecipeSelect.this, RecKeema.class );
                startActivity(openRecipeOne);
            }
        });

        Button Recipe2 = btns[1];
        Recipe2.setOnClickListener(new View.OnClickListener() {


            public void onClick(View view) {
                Intent openRecipeTwo = new Intent(RecipeSelect.this, RecCurry.class );
                startActivity(openRecipeTwo);
            }
        });

        Button Recipe3 = btns[2];
        Recipe3.setOnClickListener(new View.OnClickListener() {


            public void onClick(View view) {
                Intent openRecipeThree = new Intent(RecipeSelect.this, RecFalafel.class );
                startActivity(openRecipeThree);
            }
        });

    }

}