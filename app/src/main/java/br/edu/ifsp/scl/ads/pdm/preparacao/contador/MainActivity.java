package br.edu.ifsp.scl.ads.pdm.preparacao.contador;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import br.edu.ifsp.scl.ads.pdm.preparacao.contador.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding activityMainBinding;
    private int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());

        activityMainBinding.inicialEt.addTextChangedListener(new TextWatcher() {
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

        activityMainBinding.cliqueBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activityMainBinding.contadorTv.setText(String.valueOf(++contador));
            }
        });

        // Lambda
        //cliqueBt.setOnClickListener( (view) -> contadorTv.setText(String.valueOf(++contador)) );
    }
}