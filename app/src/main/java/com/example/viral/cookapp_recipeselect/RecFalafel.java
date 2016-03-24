package com.example.viral.cookapp_recipeselect;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RecFalafel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rec_falafel);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String[] FalafelIng = new String[10];
        FalafelIng[0]="Ingredients";
        FalafelIng[1] ="One white onion ";
        FalafelIng[2] ="2 garlic cloves ";
        FalafelIng[3] ="1 chillies ";
        FalafelIng[4] ="800g Chickpeas ";
        FalafelIng[5] ="3 tbsp cumin";
        FalafelIng[6] ="1 tbsp coriander";
        FalafelIng[7] ="2 tbsp vegetable oil";
        FalafelIng[8] ="1 egg";
        FalafelIng[9] ="Plain flour";


        final ArrayAdapter<String> adapterFalafel = new ArrayAdapter<String>(this, R.layout.listviewrecsearchlayout, FalafelIng);
        ListView FalafelList = (ListView) findViewById(R.id.listViewFalafel);
        FalafelList.setAdapter(adapterFalafel);

    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }
}