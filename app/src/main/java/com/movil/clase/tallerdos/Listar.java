package com.movil.clase.tallerdos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class Listar extends AppCompatActivity {
    private TableLayout tabla;
    private ArrayList<Smartphone> telefonos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar);
        tabla = findViewById(R.id.tabla_main);
        telefonos = Datos.obtener();
        for (int i = 0; i < telefonos.size(); i++) {
            TableRow fila = new TableRow(this);

            TextView c1 = new TextView(this);
            TextView c2 = new TextView(this);
            TextView c3 = new TextView(this);
            TextView c4 = new TextView(this);
            TextView c5 = new TextView(this);
            TextView c6 = new TextView(this);
            TextView c7 = new TextView(this);
            TextView c8 = new TextView(this);
            TextView c9 = new TextView(this);

            c1.setText(String.valueOf(i + 1));
            c2.setText(telefonos.get(i).getMarca());
            c3.setText(telefonos.get(i).getModelo());
            c4.setText(telefonos.get(i).getProcesador());
            c5.setText(telefonos.get(i).getRam());
            c6.setText(telefonos.get(i).getRom());
            c7.setText(telefonos.get(i).getColor());
            c8.setText(telefonos.get(i).getSo());
            c9.setText(String.valueOf(telefonos.get(i).getPrecio()));

            fila.addView(c1);
            fila.addView(c2);
            fila.addView(c3);
            fila.addView(c4);
            fila.addView(c5);
            fila.addView(c6);
            fila.addView(c7);
            fila.addView(c8);
            fila.addView(c9);

            tabla.addView(fila);
        }
    }
}
