package com.example.viral.cookapp_recipeselect;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RecKeema extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rec_keema);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String[] KeemaIng = new String[11];
        KeemaIng[0]="Ingredients";
        KeemaIng[1] ="2 tbsp Oil";
        KeemaIng[2] ="2 large onion";
        KeemaIng[3] ="3 Cloves of garlic";
        KeemaIng[4] ="3 Chilli";
        KeemaIng[5] ="500g lamb mince";
        KeemaIng[6] ="2 tbsp Curry powder";
        KeemaIng[7] ="1tbsp of Chilli powder";
        KeemaIng[8] ="400g Chickpeas";
        KeemaIng[9] ="Chopped Tomatoes";
        KeemaIng[10] ="200g Spinach";


        final ArrayAdapter<String> adapterKeema = new ArrayAdapter<String>(this, R.layout.listviewrecsearchlayout, KeemaIng);
        ListView KeemaList = (ListView) findViewById(R.id.listViewKeema);
        KeemaList.setAdapter(adapterKeema);

    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }
}
