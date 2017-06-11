package com.tatlicilar.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText nameEt,passEt;
    String name, pass;
    ArrayList<Kisi> veriler;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        passEt = (EditText) findViewById(R.id.passET);
        nameEt = (EditText) findViewById(R.id.nameET);
        veriler = new ArrayList();

        Kisi k1 = new Kisi("Neval","qwert");
        Kisi k2 = new Kisi("Elif","asd");

        veriler.add(k1);
        veriler.add(k2);
    }

    public void onClick(View v)
    {
        pass=passEt.getText().toString();
        name=nameEt.getText().toString();
        int buldum=0;
        Kisi tmp;

        for (int i=0;i<veriler.size();i++)
        {
            tmp = veriler.get(i);
            if(tmp.getIsim().equals(name) && tmp.getParola().equals(pass))
                buldum=1;
        }

        intent = new Intent(this,IkinciActivite.class);
        intent.putExtra("anahtar",buldum);
        startActivity(intent);


    }
}
