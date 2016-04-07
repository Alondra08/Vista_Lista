package com.example.ftsoporte.vista_lista;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;


import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;


public class MainActivity extends Activity {
    ListViewAdapter adapter;
    String[]title=new String[]{"Avon","Esika","Natura", "Rimmel"};

    int[] img={
            R.drawable.avon,
            R.drawable.esika,
            R.drawable.natura,
            R.drawable.rimmel


    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ListView lista=(ListView)findViewById(R.id.listView);
        adapter=new ListViewAdapter(this,title,img);
        lista.setAdapter(adapter);
    }
}