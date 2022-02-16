package desafiosemanal.ui.activity;

import static desafiosemanal.ui.activity.ActivityConstantes.CHAVE_PESSOA;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import desafiosemanal.model.Pessoa;

public class SegundaPagina extends AppCompatActivity {

    public static final String TITULO_APPBAR = "Segunda Página";
    public static final String NOME = "Nome: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_pagina);

        setTitle(TITULO_APPBAR);

        carregaNomeRecebido();

    }

    private void carregaNomeRecebido() {
        Intent intent = getIntent();
        if(intent.hasExtra(CHAVE_PESSOA)){
            Pessoa pessoa = (Pessoa) intent.getSerializableExtra(CHAVE_PESSOA);
            TextView campoNome = findViewById(R.id.segunda_pagina_nome);
            campoNome.setText(NOME + pessoa.getNome());
        }
    }
}