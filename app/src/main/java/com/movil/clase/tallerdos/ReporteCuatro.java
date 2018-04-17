package com.movil.clase.tallerdos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class ReporteCuatro extends AppCompatActivity {
    private ArrayList<Smartphone> telefonos;
    private ArrayList<Smartphone> telefonos2 = new ArrayList<>();
    private String apple = "Apple";
    private String negro = "Negro";
    private TextView numero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporte_cuatro);
        telefonos = Datos.obtener();
        numero = findViewById(R.id.txtReporte);
        Smartphone actual;
        for (int i = 0; i < telefonos.size(); i++) {
            actual = telefonos.get(i);
            if (actual.getMarca().equals(apple) && actual.getColor().equals(negro)){
                telefonos2.add(actual);
            }
        }
        numero.setText(telefonos2.size()+"");
    }
}
