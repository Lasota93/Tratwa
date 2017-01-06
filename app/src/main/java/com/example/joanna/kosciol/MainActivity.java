package com.example.joanna.kosciol;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends Activity {
private Button plan;
    private Button dojazd;
    private Button counas;
    private Button kontakt;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        // Get the view from activity_main.xml
        setContentView(R.layout.activity_main);

        plan = (Button) findViewById(R.id.button);
       plan.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i1 = new Intent(v.getContext(), Plan.class);
               startActivity(i1);
           }
       });
        dojazd = (Button) findViewById(R.id.button3);
        dojazd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(v.getContext(), Dojazd.class);
                startActivity(i1);
            }
        });
        counas = (Button) findViewById(R.id.button2);
        counas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(v.getContext(), Counas.class);
                startActivity(i1);
            }
        });
        kontakt = (Button) findViewById(R.id.button4);
       kontakt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(v.getContext(), Kontakt.class);
                startActivity(i1);
            }
        });
    }

}