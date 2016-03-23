package com.example.viral.cookapp_recipeselect;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RecKeema extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rec_keema);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        String[] KeemaIng = new String[10];
        KeemaIng[0] ="2 tbsp Oil";
        KeemaIng[1] ="2 large onion";
        KeemaIng[2] ="3 Cloves of garlic";
        KeemaIng[3] ="3 Chilli";
        KeemaIng[4] ="500g lamb mince";
        KeemaIng[5] ="2 tbsp Curry powder";
        KeemaIng[6] ="1tbsp of Chilli powder";
        KeemaIng[7] ="400g Chickpeas";
        KeemaIng[8] ="Chopped Tomatoes";
        KeemaIng[9] ="200g Spinach";


        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.listviewrecsearchlayout, KeemaIng);
        ListView KeemaList = (ListView) findViewById(R.id.listViewKeema);
        KeemaList.setAdapter(adapter);

    }

}
