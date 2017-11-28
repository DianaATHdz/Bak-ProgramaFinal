package com.example.dell.bak;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.gms.maps.MapView;

public class Comprar extends AppCompatActivity {
ImageButton boton1,boton2,boton3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comprar);
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
        boton1=(ImageButton)findViewById(R.id.mty);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri uri = Uri.parse("https://www.google.com/maps/place/Iglesia+Cristiana+Castillo+Del+Rey+Congregacion+Brisas/@25.627306,-100.294111,17z/data=!4m5!3m4!1s0x0:0xba2e113d0124ef67!8m2!3d25.6284071!4d-100.2939951?hl=es-419");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        boton3=(ImageButton)findViewById(R.id.tam);
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.google.com/maps/@22.265306,-97.872139,18z?hl=es-419");
                Intent intent1 = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent1);
            }
        });
        boton3=(ImageButton)findViewById(R.id.sn);
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri uri = Uri.parse("https://www.google.com/maps/place/San+Pedro+de+Pinta/@25.657301,-100.370335,14z/data=!4m5!3m4!1s0x0:0x44be60ce3841c8e4!8m2!3d25.6573014!4d-100.3703346?hl=es-419");
                Intent intent2 = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent2);

            }
        });


    }

}
