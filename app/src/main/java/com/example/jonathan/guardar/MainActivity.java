package com.example.jonathan.guardar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv1;

    private int generado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView) findViewById(R.id.tv1);
        if (savedInstanceState != null){
            generado = savedInstanceState.getInt("generado");
            tv1.setText(String.valueOf(generado));
        }
        else {
            generado = generarAleatorio(50);
            tv1.setText(String.valueOf(generado));

        }

    }

    private int generarAleatorio(int cantidad){
        return ((int)(Math.random()*cantidad));
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt("generado", generado);
        super.onSaveInstanceState(outState);
    }
}

