package com.example.denise.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.denise.intent.MESSAGE" ;
    public static final String EXTRA_MESSAGE2 = "com.example.denise.intent.MESSAGE2";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = (Button)findViewById(R.id.iniciar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void BotaoIniciar(View view){
        Intent intent = new Intent(this, Main2Activity.class);
        EditText enviar = (EditText)findViewById(R.id.nome1);
        String mensagem = enviar.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, mensagem);

        EditText enviar2 = (EditText)findViewById(R.id.nome2);
        String mensagem2 = enviar2.getText().toString();
        intent.putExtra(EXTRA_MESSAGE2, mensagem2);
        startActivity(intent);
    }

}
