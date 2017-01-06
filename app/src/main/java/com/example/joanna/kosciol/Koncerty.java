package com.example.joanna.kosciol;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Koncerty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_koncerty);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
public void pokazMarika(View view)
{
    final Dialog brushDialog = new Dialog(this);
    brushDialog.setTitle("MARIKA");
    brushDialog.setContentView(R.layout.koncert);
    brushDialog.show();
}
    public void pokazUgorna(View view)
    {
        final Dialog brushDialog = new Dialog(this);
        brushDialog.setTitle("MARZENA UGORNA");
        brushDialog.setContentView(R.layout.ugorna);
        brushDialog.show();
    }
    public void pokazMaleo(View view)
    {
        final Dialog brushDialog = new Dialog(this);
        brushDialog.setTitle("MALEO REGGAE ROCKERS");
        brushDialog.setContentView(R.layout.maleo);
        brushDialog.show();
    }
    public void pokazAbba(View view)
    {
        final Dialog brushDialog = new Dialog(this);
        brushDialog.setTitle("ABBA PATER MUSIC");
        brushDialog.setContentView(R.layout.abba);
        brushDialog.show();

    }
}
