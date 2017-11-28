package com.example.dell.bak;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class Productos extends AppCompatActivity {
ImageButton boton2;
ImageButton boton1;
ImageButton boton3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos);
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
        boton1=(ImageButton)findViewById(R.id.al);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent boton1 = new Intent(Productos.this,Alimento.class);
                startActivity(boton1);
            }
        });
        boton2=(ImageButton)findViewById(R.id.hu);
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent boton2 =new Intent(Productos.this,Hueso.class);
                startActivity(boton2);
            }
        });
        boton3=(ImageButton)findViewById(R.id.med);
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent boton3 =new Intent(Productos.this,Premio.class);
                startActivity(boton3);
            }
        });
    }

}
