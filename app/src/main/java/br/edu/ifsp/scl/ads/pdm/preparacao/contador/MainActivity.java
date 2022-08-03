package br.edu.ifsp.scl.ads.pdm.preparacao.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button cliqueBt;
    private TextView contadorTv;
    private EditText inicialEt;
    private int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicialEt = findViewById(R.id.inicialEt);
        contadorTv = findViewById(R.id.contadorTv);
        cliqueBt = findViewById(R.id.cliqueBt);

        inicialEt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                contador = Integer.parseInt(charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        cliqueBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorTv.setText(String.valueOf(++contador));
            }
        });

        // Lambda
        //cliqueBt.setOnClickListener( (view) -> contadorTv.setText(String.valueOf(++contador)) );
    }
}