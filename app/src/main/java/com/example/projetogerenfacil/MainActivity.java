package com.example.projetogerenfacil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginButton = findViewById(R.id.btnLogin);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para verificar as credenciais e navegar para a próxima tela
                // Se as credenciais estiverem corretas, inicie a próxima atividade
                Intent intent = new Intent(MainActivity.this, NextActivity.class);
                startActivity(intent);
            }
        });

        TextView forgotPasswordTextView = findViewById(R.id.tvForgotPassword);
        forgotPasswordTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para lidar com o clique no texto "Esqueceu a senha?"
                // Implemente a navegação para a tela de redefinição de senha, se necessário
            }
        });

        TextView registerTextView = findViewById(R.id.tvRegister);
        registerTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para lidar com o clique no texto "Cadastre-se"
                // Implemente a navegação para a tela de cadastro, se necessário
            }
        });
    }
}
