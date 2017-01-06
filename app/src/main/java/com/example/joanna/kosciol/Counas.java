package com.example.joanna.kosciol;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Counas extends AppCompatActivity {
private Button kon;
    private Button war;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counas);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        kon = (Button) findViewById(R.id.button11);

        kon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(v.getContext(), Koncerty.class);
                startActivity(i1);
            }
        });
        war = (Button) findViewById(R.id.button13);
        war.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(v.getContext(), Warsztaty.class);
                startActivity(i1);
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
