package com.example.dell.bak;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class chihuactivity extends AppCompatActivity {
    EditText txt1,res;
    Button boton,boton2;
    Spinner lista;
    String[] datos={"Actividad física baja","Actividad física normal","Actividad física alta"};
    boolean pequeña=false;
    boolean mediana=false;
    boolean grande=false;
    int peso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chihuactivity);
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
        txt1=(EditText)findViewById(R.id.caja1);
        res=(EditText)findViewById(R.id.caja2);
        lista=(Spinner)findViewById(R.id.sp1);

        boton=(Button)findViewById(R.id.btn1);
        boton2=(Button)findViewById(R.id.btn2);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1=Integer.parseInt(txt1.getText().toString());
                if(n1<2){
                    peso=1;
                }
                if(n1==2){
                    peso=1;
                }
                if(n1==3){
                    peso=2;
                }
                if(n1>3){
                    peso=3;
                }
                int resultado= (int) ((peso*1000)*.08);

                if(pequeña==true){


                    int resultado1=(int)((resultado)-(resultado*.15));
                    if(resultado>=1000){
                        res.setText("Gramos al dia: "+String.valueOf(resultado1)+", paquete 1000 gramos($42.00), semana($294.00");
                    }
                    if(resultado<=400){
                        res.setText("Gramos al dia: "+String.valueOf(resultado1)+", paquete 400 gramos($20.00), semana($140.00");
                    }
                    if(resultado>400&&resultado<=500){

                        res.setText("Gramos al dia: "+String.valueOf(resultado1)+", paquete 500 gramos($24.00), semana($168.00");
                    }
                    if(resultado>500&&resultado<=600){
                        res.setText("Gramos al dia: "+String.valueOf(resultado1)+", paquete 600 gramos($27.00), semana($189.00");
                    }
                    if(resultado>600&&resultado<=700){
                        res.setText("Gramos al dia: "+String.valueOf(resultado1)+", paquete 700 gramos($31.00), semana($217.00");
                    }
                    if(resultado>700&&resultado<=800){
                        res.setText("Gramos al dia: "+String.valueOf(resultado1)+", paquete 800 gramos($35.00), semana($245.00");
                    }
                    if(resultado>800&&resultado<=900){
                        res.setText("Gramos al dia: "+String.valueOf(resultado1)+", paquete 900 gramos($39.00), semana($273.00");
                    }

                }
                else if(mediana==true){


                    if(resultado>=1000){
                        res.setText("Gramos al dia: "+String.valueOf(resultado)+", paquete 1000 gramos($42.00), semana($294.00");
                    }
                    if(resultado<=400){
                        res.setText("Gramos al dia: "+String.valueOf(resultado)+", paquete 400 gramos($20.00), semana($140.00");
                    }
                    if(resultado>400&&resultado<=500){

                        res.setText("Gramos al dia: "+String.valueOf(resultado)+", paquete 500 gramos($24.00), semana($168.00");
                    }
                    if(resultado>500&&resultado<=600){
                        res.setText("Gramos al dia: "+String.valueOf(resultado)+", paquete 600 gramos($27.00), semana($189.00");
                    }
                    if(resultado>600&&resultado<=700){
                        res.setText("Gramos al dia: "+String.valueOf(resultado)+", paquete 700 gramos($31.00), semana($217.00");
                    }
                    if(resultado>700&&resultado<=800){
                        res.setText("Gramos al dia: "+String.valueOf(resultado)+", paquete 800 gramos($35.00), semana($245.00");
                    }
                    if(resultado>800&&resultado<=900){
                        res.setText("Gramos al dia: "+String.valueOf(resultado)+", paquete 900 gramos($39.00), semana($273.00");
                    }
                }
                else if(grande==true){


                    int resultado4=(int)((resultado)+(resultado*.15));
                    res.setText(String.valueOf(resultado4));
                    if(resultado>=1000){
                        res.setText("Gramos al dia: "+String.valueOf(resultado4)+", paquete 1000 gramos($42.00), semana($294.00");
                    }
                    if(resultado<=400){
                        res.setText("Gramos al dia: "+String.valueOf(resultado4)+", paquete 400 gramos($20.00), semana($140.00");
                    }
                    if(resultado>400&&resultado<=500){

                        res.setText("Gramos al dia: "+String.valueOf(resultado4)+", paquete 500 gramos($24.00), semana($168.00");
                    }
                    if(resultado>500&&resultado<=600){
                        res.setText("Gramos al dia: "+String.valueOf(resultado4)+", paquete 600 gramos($27.00), semana($189.00");
                    }
                    if(resultado>600&&resultado<=700){
                        res.setText("Gramos al dia: "+String.valueOf(resultado4)+", paquete 700 gramos($31.00), semana($217.00");
                    }
                    if(resultado>700&&resultado<=800){
                        res.setText("Gramos al dia: "+String.valueOf(resultado4)+", paquete 800 gramos($35.00), semana($245.00");
                    }
                    if(resultado>800&&resultado<=900){
                        res.setText("Gramos al dia: "+String.valueOf(resultado4)+", paquete 900 gramos($39.00), semana($273.00");
                    }
                }

            }
        });
        boton2=(Button)findViewById(R.id.btn2);
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText("");
                txt1.setText("");

            }
        });

        lista.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,datos));


        lista.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(adapterView.getContext(),
                        (String) adapterView.getItemAtPosition(i), Toast.LENGTH_SHORT).show();

                if(i==0) {
                    pequeña=true;
                    mediana=false;
                    grande=false;

                }


                if(i==1) {

                    pequeña = false;
                    mediana = true;
                    grande = false;

                }
                if(i==2) {
                    pequeña = false;
                    mediana = false;
                    grande = true;

                }


            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }


        });
    }

}
