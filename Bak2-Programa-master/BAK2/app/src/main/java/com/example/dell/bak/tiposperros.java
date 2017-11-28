package com.example.dell.bak;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class tiposperros extends AppCompatActivity {
    ImageButton boton1,boton2,boton3,boton4,boton5,boton6,boton7,boton8,boton9,boton10,boton11,boton12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiposperros);
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
        boton1=(ImageButton)findViewById(R.id.imageButton2);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent boton1 = new Intent(tiposperros.this,beagleactivity.class);
                startActivity(boton1);
            }
        });
        boton2=(ImageButton)findViewById(R.id.imageButton3);
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent boton1 = new Intent(tiposperros.this,borderactivity.class);
                startActivity(boton1);
            }
        });
        boton3=(ImageButton)findViewById(R.id.imageButton4);
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent boton1 = new Intent(tiposperros.this,bulterrieractivity.class);
                startActivity(boton1);
            }
        });
        boton4=(ImageButton)findViewById(R.id.imageButton5);
        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent boton1 = new Intent(tiposperros.this,canichieactivity.class);
                startActivity(boton1);
            }
        });
        boton5=(ImageButton)findViewById(R.id.imageButton6);
        boton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent boton1 = new Intent(tiposperros.this,chihuactivity.class);
                startActivity(boton1);
            }
        });
        boton6=(ImageButton)findViewById(R.id.imageButton7);
        boton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent boton1 = new Intent(tiposperros.this,dalmataactivity.class);
                startActivity(boton1);
            }
        });
        boton7=(ImageButton)findViewById(R.id.imageButton8);
        boton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent boton1 = new Intent(tiposperros.this,pugactivity.class);
                startActivity(boton1);
            }
        });
        boton8=(ImageButton)findViewById(R.id.imageButton9);
        boton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent boton1 = new Intent(tiposperros.this,goldenactivity.class);
                startActivity(boton1);
            }
        });
        boton9=(ImageButton)findViewById(R.id.imageButton10);
        boton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent boton1 = new Intent(tiposperros.this,schactivity.class);
                startActivity(boton1);
            }
        });
        boton10=(ImageButton)findViewById(R.id.imageButton11);
        boton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent boton1 = new Intent(tiposperros.this,sanbactivity.class);
                startActivity(boton1);
            }
        });
        boton11=(ImageButton)findViewById(R.id.imageButton12);
        boton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent boton1 = new Intent(tiposperros.this,pastoractivity.class);
                startActivity(boton1);
            }
        });
        boton12=(ImageButton)findViewById(R.id.imageButton13);
        boton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent boton1 = new Intent(tiposperros.this,shiactivity.class);
                startActivity(boton1);
            }
        });
    }

}
