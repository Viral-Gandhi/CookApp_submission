package com.example.viral.cookapp_recipeselect;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RecCurry extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rec_curry);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String[] CurryIng = new String[17];
        CurryIng[0]="Ingredients";
        CurryIng[1] ="2 large white onions ";
        CurryIng[2] ="3 garlic cloves ";
        CurryIng[3] ="3 chillies ";
        CurryIng[4] ="1 tbsp tomato puree ";
        CurryIng[5] ="400ml vegetable stock";
        CurryIng[6] ="800g chopped tomatoes ";
        CurryIng[7] ="1 tbsp turmeric ";
        CurryIng[8] ="1 tbsp garam masala ";
        CurryIng[9] ="1 tbsp chilli powder ";
        CurryIng[10] ="1 tbsp ground coriander ";
        CurryIng[11] ="1 tbsp cumin ";
        CurryIng[12] ="2 tbsp vegetable oil ";
        CurryIng[13] ="500g chicken ";
        CurryIng[14] ="1 bunch of fresh coriander";
        CurryIng[15] ="200g spinach ";
        CurryIng[16] ="400g chickpeas";


        final ArrayAdapter<String> adapterCurry = new ArrayAdapter<String>(this, R.layout.listviewrecsearchlayout, CurryIng);
        ListView CurryList = (ListView) findViewById(R.id.listViewCurry);
        CurryList.setAdapter(adapterCurry);

    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
   }
}
