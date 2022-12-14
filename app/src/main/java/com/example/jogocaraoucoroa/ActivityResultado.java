package com.example.jogocaraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ActivityResultado extends AppCompatActivity {

    private ImageView imageResultado;
    private ImageView imageVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imageResultado = findViewById(R.id.imageResultado);
        imageVoltar = findViewById(R.id.imageVoltar);

        imageVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();

            }
        });

        //Recuperar dados
        Bundle dados = getIntent().getExtras();
        int numero = dados.getInt("numero");

        if (numero == 0) { //cara

            imageResultado.setImageResource(R.drawable.moeda_cara);

        } else { //coroa

            imageResultado.setImageResource(R.drawable.moeda_coroa);


        }
    }
}