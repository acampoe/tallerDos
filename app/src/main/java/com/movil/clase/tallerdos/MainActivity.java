package com.movil.clase.tallerdos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView lv;
    private String[] opc;
    private Intent in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.lstOpciones);
        opc = getResources().getStringArray(R.array.opciones);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, opc);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        in = new Intent(MainActivity.this,Registrar.class);
                        startActivity(in);
                        break;
                    case 1:
                        in = new Intent(MainActivity.this,Listar.class);
                        startActivity(in);
                        break;
                    case 2:
                        in = new Intent(MainActivity.this,ReporteUno.class);
                        startActivity(in);
                        break;
                    case 3:
                        in = new Intent(MainActivity.this,ReporteCuatro.class);
                        startActivity(in);
                        break;
                }

            }
        });

    }
}
