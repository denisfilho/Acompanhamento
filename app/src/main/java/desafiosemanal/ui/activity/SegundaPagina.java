package desafiosemanal.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import desafiosemanal.model.Pessoa;

public class SegundaPagina extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_pagina);

        setTitle("Segunda Página");

        Intent intent = getIntent();
        if(intent.hasExtra("Pessoa")){
            Pessoa pessoa = (Pessoa) intent.getSerializableExtra("Pessoa");
            TextView campoNome = findViewById(R.id.segunda_pagina_nome);
            campoNome.setText(pessoa.getNome());
        }

    }
}