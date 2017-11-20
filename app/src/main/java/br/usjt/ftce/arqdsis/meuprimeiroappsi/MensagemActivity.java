package br.usjt.ftce.arqdsis.meuprimeiroappsi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class MensagemActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensagem);
        Intent intent = getIntent();
        String texto = intent.getStringExtra(MainActivity.MENSAGEM);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(texto);

        ViewGroup layout = findViewById(R.id.mostrarMensagem);
        layout.addView(textView);
    }
}
