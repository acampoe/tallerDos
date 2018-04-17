package com.movil.clase.tallerdos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class ReporteUno extends AppCompatActivity {
    private TableLayout tabla;
    private ArrayList<Smartphone> telefonos;
    private ArrayList<Smartphone> telefonos2 = new ArrayList<>();
    private String samsung = "Samsung";
    private String negro = "Negro";
    private String android = "Android";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporte_uno);
        tabla = findViewById(R.id.tabla_uno);
        telefonos = Datos.obtener();
        Smartphone actual;

        for (int i = 0; i < telefonos.size(); i++) {
            actual = telefonos.get(i);
            if (actual.getMarca().equals(samsung) && actual.getColor().equals(negro) && actual.getSo().equals(android)){
                telefonos2.add(actual);
            }
        }
        for (int i = 0; i < telefonos2.size(); i++) {
            TableRow fila = new TableRow(this);

            TextView c1 = new TextView(this);
            TextView c3 = new TextView(this);
            TextView c5 = new TextView(this);
            TextView c9 = new TextView(this);

            c1.setText(String.valueOf(i + 1));
            c3.setText(telefonos2.get(i).getModelo());
            c5.setText(telefonos2.get(i).getRam());
            c9.setText(String.valueOf(telefonos2.get(i).getPrecio()));

            fila.addView(c1);
            fila.addView(c3);
            fila.addView(c5);
            fila.addView(c9);

            tabla.addView(fila);
        }
    }
}
