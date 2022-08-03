package br.edu.ifsp.scl.ads.pdm.preparacao.contador;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

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

        activityMainBinding.zeroRb.setOnClickListener( view -> contador = 0);
        activityMainBinding.dezRb.setOnClickListener( view -> contador = 10);

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