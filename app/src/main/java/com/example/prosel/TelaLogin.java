package com.example.prosel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TelaLogin extends AppCompatActivity {

        private TextView texttelacad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);

        IniciarComponentes();

        texttelacad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaLogin.this, cadastro.class);
                startActivity(intent);
            }
        });

    }

    private void IniciarComponentes(){
        texttelacad = findViewById(R.id.texttelacad);
    }
}