package desafiosemanal.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botaoInsere = findViewById(R.id.botao_inserir_nome);
        botaoInsere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //chamar outra página com o valor inserido
                Intent intent = new Intent(MainActivity.this, SegundaPagina.class);
                startActivity(intent);
            }
        });
    }
}