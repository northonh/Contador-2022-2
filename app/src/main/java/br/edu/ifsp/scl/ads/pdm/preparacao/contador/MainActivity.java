package br.edu.ifsp.scl.ads.pdm.preparacao.contador;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

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

        activityMainBinding.inicialSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                contador = (i == 0)? 0 : (i == 1)? 5 : 10;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

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