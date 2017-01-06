package com.example.joanna.kosciol;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Warsztaty extends AppCompatActivity {
    private Button uwo;
    private Button tea;
    private Button git;
    private Button pia;
    private Button beb;
    private Button gl;
    private Button ci;
    private Button ul;
    private Button hi;
    private Button gr;
    private Button ko;
    private Button ma;
    private Button pa;
    private Button fo;
    private Button be;
    private Button kar;
    private Button rys;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warsztaty);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        uwo = (Button) findViewById(R.id.button14);

        uwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(v.getContext(), Uwolnij.class);
                startActivity(i1);
            }
        });
        tea = (Button) findViewById(R.id.button18);

        tea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(v.getContext(),Teatr.class);
                startActivity(i1);
            }
        });
        git = (Button) findViewById(R.id.button19);

       git.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(v.getContext(),Gitara.class);
                startActivity(i1);
            }
        });
        pia = (Button) findViewById(R.id.button20);
        pia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(v.getContext(),Pianista.class);
                startActivity(i1);
            }
        });
        beb = (Button) findViewById(R.id.button21);
        beb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(v.getContext(),Bebny.class);
                startActivity(i1);
            }
        });
        gl = (Button) findViewById(R.id.button22);
        gl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(v.getContext(), Glos.class);
                startActivity(i1);
            }
        });

        ci = (Button) findViewById(R.id.button23);
        ci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(v.getContext(), Cialo.class);
                startActivity(i1);
            }
        });
        ul = (Button) findViewById(R.id.button24);
        ul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(v.getContext(), Ulica.class);
                startActivity(i1);
            }
        });
        hi = (Button) findViewById(R.id.button25);
        hi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(v.getContext(), Hip.class);
                startActivity(i1);
            }
        });
        gr= (Button) findViewById(R.id.button26);
        gr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(v.getContext(), Grafiti.class);
                startActivity(i1);
            }
        });
        ko= (Button) findViewById(R.id.button27);
        ko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(v.getContext(), Koral.class);
                startActivity(i1);
            }
        });
        ma= (Button) findViewById(R.id.button28);
        ma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(v.getContext(), Makijaz.class);
                startActivity(i1);
            }
        });
        pa= (Button) findViewById(R.id.button29);
        pa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(v.getContext(), Padre.class);
                startActivity(i1);
            }
        });
        fo= (Button) findViewById(R.id.button30);
        fo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(v.getContext(), Foto.class);
                startActivity(i1);
            }
        });
        be= (Button) findViewById(R.id.button31);
        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(v.getContext(), Bezp.class);
                startActivity(i1);
            }
        });
        kar= (Button) findViewById(R.id.button32);
        kar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(v.getContext(), Karton.class);
                startActivity(i1);
            }
        });
        rys= (Button) findViewById(R.id.button33);
        rys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(v.getContext(), Rysowanie.class);
                startActivity(i1);
            }
        });


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
