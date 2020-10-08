package com.example.prova_web_ex3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Math.sqrt;

public class MainActivity extends AppCompatActivity {

    TextView edNumero, edParImpar, edDobro, edRaiz;

    Button btnCalcular;

    double numero, res1, res2, res3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalcular = findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                edNumero = (TextView) findViewById(R.id.edNumero);
                edParImpar = (TextView) findViewById(R.id.edParImpar);
                edDobro = (TextView) findViewById(R.id.edDobro);
                edRaiz = (TextView) findViewById(R.id.edRaiz);

                numero = Double.parseDouble(edNumero.getText().toString());

                //PAr ou Impar
                res1 = numero % 2;
                if(res1 == 0)
                {
                    edParImpar.setText("PAR");
                }
                else
                {
                    edParImpar.setText("IMPAR");
                }

                //Doubro
                res2 = numero * 2;
                edDobro.setText(String.valueOf(res2));
                //Raiz
                res3 = sqrt(numero);
                edRaiz.setText(String.valueOf(res3));
            }
        });

    }
}