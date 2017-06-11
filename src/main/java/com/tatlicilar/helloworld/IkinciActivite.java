package com.tatlicilar.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class IkinciActivite extends AppCompatActivity {

    Intent intent;
    TextView sonuctv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ikinci_activite);

        sonuctv = (TextView) findViewById(R.id.sonucTv);

        intent = getIntent();

        int sonuc = intent.getIntExtra("anahtar",0);

        if (sonuc==1)
            sonuctv.setText("Hosgeldiniz");
        else
            sonuctv.setText("Hatalı Giriş");
    }
}
