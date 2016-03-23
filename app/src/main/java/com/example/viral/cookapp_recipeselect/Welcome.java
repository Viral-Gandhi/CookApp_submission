package com.example.viral.cookapp_recipeselect;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button Start = (Button) findViewById(R.id.buttonStart);
        Start.setOnClickListener(new View.OnClickListener() {


            public void onClick(View view) {
                Intent openSearchMethod = new Intent(Welcome.this, FindMethod.class);
                startActivity(openSearchMethod);
            }
        });
    }
}
