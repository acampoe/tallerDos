package com.movil.clase.tallerdos;

import java.util.ArrayList;

/**
 * Created by android on 16/04/2018.
 */

public class Datos {
    private static ArrayList<Smartphone> telefonos = new ArrayList<>();

    public static void guardar(Smartphone s){
        telefonos.add(s);
    }
    public static ArrayList<Smartphone> obtener(){
        return telefonos;
    }
}
