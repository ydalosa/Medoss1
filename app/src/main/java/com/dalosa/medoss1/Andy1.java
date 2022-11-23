package com.dalosa.medoss1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Andy1 extends AppCompatActivity {
    Button btnAndy1;
    private void initUI(){
        btnAndy1 = findViewById(R.id.btnAndy1);
    }
    private void clicLinear(){
        btnAndy1.setOnClickListener(new View.OnClickListener() { // Gestion du clic avec le listener
            @Override
            public void onClick(View view) {
                // Action effectuée lors du clic ici un intent pour se rendre sur l'activité des linear layout
                // Départ                   // Arrivée
                Intent intent = new Intent(Andy1.this, Andy2.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andy1);
        initUI();
        clicLinear();
    }
}