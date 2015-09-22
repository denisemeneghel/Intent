package com.example.denise.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button b11 = (Button)findViewById(R.id.b11);
        Button b12 = (Button)findViewById(R.id.b12);
        Button b13 = (Button)findViewById(R.id.b13);
        Button b21 = (Button)findViewById(R.id.b21);
        Button b22 = (Button)findViewById(R.id.b22);
        Button b23 = (Button)findViewById(R.id.b23);
        Button b31 = (Button)findViewById(R.id.b31);
        Button b32 = (Button)findViewById(R.id.b32);
        Button b33 = (Button)findViewById(R.id.b33);

        Intent intent = getIntent();
        EditText vamosmudar = (EditText)findViewById(R.id.nome12);
        String mensagem = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        vamosmudar.setText(mensagem);

        EditText vamosmudar2 = (EditText)findViewById(R.id.nome22);
        String mensagem2 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE2);
        vamosmudar2.setText(mensagem2);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main2, menu);
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


    public void Click11(View view) {

    }
    public void Click12(View view) {
    }
    public void Click13(View view) {
    }
    public void Click21(View view) {
    }
    public void Click22(View view) {
    }
    public void Click23(View view) {
    }
    public void Click31(View view) {
    }
    public void Click32(View view) {
    }
    public void Click33(View view) {
    }

}


