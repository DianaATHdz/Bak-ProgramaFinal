package com.example.dell.bak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BAK extends AppCompatActivity {
    Button boton,boton2,boton3,boton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bak);
        boton=(Button)findViewById(R.id.btn1);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent boton =new Intent(BAK.this,Productos.class);
                startActivity(boton);
            }
        });
        boton2=(Button)findViewById(R.id.btn2);
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent boton2 =new Intent(BAK.this,conozcoono.class);
                startActivity(boton2);
            }
        });
        boton3=(Button)findViewById(R.id.btn3);
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent boton3 =new Intent(BAK.this,informacion.class);
                startActivity(boton3);
            }
        });
        boton4=(Button)findViewById(R.id.btn4);
        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent boton4 =new Intent(BAK.this,Comprar.class);
                startActivity(boton4);
            }
        });

    }
}
