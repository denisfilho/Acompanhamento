package desafiosemanal.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import desafiosemanal.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botaoInsere = findViewById(R.id.botao_inserir_nome);
        botaoInsere.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                final Pessoa pessoaCadastrada = new Pessoa();

                EditText campoNome = findViewById(R.id.nome);
                String nome = campoNome.getText().toString();
                pessoaCadastrada.setNome(nome);

                Intent intent = new Intent(MainActivity.this, SegundaPagina.class);
                intent.putExtra("Pessoa",pessoaCadastrada);
                startActivity(intent);
            }
        });
    }
}