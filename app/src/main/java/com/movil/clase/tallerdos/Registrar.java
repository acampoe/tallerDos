package com.movil.clase.tallerdos;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Registrar extends AppCompatActivity {
    private EditText txtModelo,txtProcesador,txtPrecio;
    private Spinner cmbMarca,cmbRam,cmbRom,cmbColor,cmbSo;
    private Resources recursos;
    String[] marcas,rams,roms,colores,sos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);
        recursos = this.getResources();
        txtModelo = findViewById(R.id.txtModelo);
        txtProcesador = findViewById(R.id.txtProcesador);
        txtPrecio = findViewById(R.id.txtPrecio);
        cmbColor = findViewById(R.id.cmbColor);
        cmbMarca = findViewById(R.id.cmbMarca);
        cmbRam = findViewById(R.id.cmbRam);
        cmbRom = findViewById(R.id.cmbRom);
        cmbSo = findViewById(R.id.cmbSo);
        marcas = recursos.getStringArray(R.array.marcas);
        rams = recursos.getStringArray(R.array.rams);
        roms = recursos.getStringArray(R.array.roms);
        colores = recursos.getStringArray(R.array.colores);
        sos = recursos.getStringArray(R.array.sos);
        ArrayAdapter<String> adapterMarcas = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,marcas);
        ArrayAdapter<String> adapterRams = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,rams);
        ArrayAdapter<String> adapterRoms = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,roms);
        ArrayAdapter<String> adapterColores = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,colores);
        ArrayAdapter<String> adapterSos = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,sos);
        cmbMarca.setAdapter(adapterMarcas);
        cmbRam.setAdapter(adapterRams);
        cmbRom.setAdapter(adapterRoms);
        cmbColor.setAdapter(adapterColores);
        cmbSo.setAdapter(adapterSos);
    }
    public boolean validar(){
        if (txtModelo.getText().toString().isEmpty()){
            txtModelo.requestFocus();
            txtModelo.setError(recursos.getString(R.string.error_modelo));
            return false;
        }else if (txtProcesador.getText().toString().isEmpty()){
            txtProcesador.requestFocus();
            txtProcesador.setError(recursos.getString(R.string.error_procesador));
            return false;
        }else if (txtPrecio.getText().toString().isEmpty()){
            txtPrecio.requestFocus();
            txtPrecio.setError(recursos.getString(R.string.error_precio));
            return false;
        }else if (Double.parseDouble(txtPrecio.getText().toString()) == 0){
            txtPrecio.requestFocus();
            txtPrecio.setError(recursos.getString(R.string.error_precio));
            return false;
        }else{
            return true;
        }
    }
    public void guardar(View v){
        validar();
        String marca = "";
        String modelo = txtModelo.getText().toString();
        String procesador = txtProcesador.getText().toString();
        String ram = "";
        String rom = "";
        String color = "";
        String so = "";
        double precio = Double.parseDouble(txtPrecio.getText().toString());
        int brand = cmbMarca.getSelectedItemPosition();
        switch (brand){
            case 0:
                marca = "Samsung";
                break;
            case 1:
                marca = "Huawei";
                break;
            case 2:
                marca = "Nokia";
                break;
            case 3:
                marca = "Apple";
                break;
        }
        int ra = cmbRam.getSelectedItemPosition();
        switch (ra){
            case 0:
                ram = "1 GB";
                break;
            case 1:
                ram = "2 GB";
                break;
            case 2:
                ram = "4 GB";
                break;

        }
        int ro = cmbRom.getSelectedItemPosition();
        switch (ro){
            case 0:
                rom = "16 GB";
                break;
            case 1:
                rom = "32 GB";
                break;
            case 2:
                rom = "64 GB";
                break;
        }
        int co = cmbColor.getSelectedItemPosition();
        switch (co){
            case 0:
                color = "Blanco";
                break;
            case 1:
                color = "Negro";
                break;
            case 2:
                color = "Gris";
                break;
            case 3:
                color = "Plata";
                break;
            case 4:
                color = "Oro";
                break;
        }
        int os = cmbSo.getSelectedItemPosition();
        switch (os){
            case 0:
                so = "Android";
                break;
            case 1:
                so = "iOS";
                break;
        }
        Smartphone s = new Smartphone(marca,modelo,procesador,ram,rom,color,so,precio);
        s.guardar();
        Toast.makeText(this,recursos.getString(R.string.guardar2),Toast.LENGTH_SHORT);
        borrar();
    }
    public void borrar(){
        txtModelo.setText(null);
        txtProcesador.setText(null);
        txtPrecio.setText(null);
    }
    public void limpiar(View v){
        borrar();
    }
}
