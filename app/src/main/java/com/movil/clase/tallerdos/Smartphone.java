package com.movil.clase.tallerdos;

/**
 * Created by android on 16/04/2018.
 */

public class Smartphone {
    private String marca;
    private String modelo;
    private String procesador;
    private String ram;
    private String rom;
    private String color;
    private String so;
    private double precio;

    public Smartphone(String marca, String modelo, String procesador, String ram, String rom, String color, String so, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.procesador = procesador;
        this.ram = ram;
        this.rom = rom;
        this.color = color;
        this.so = so;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getProcesador() {
        return procesador;
    }

    public String getRam() {
        return ram;
    }

    public String getRom() {
        return rom;
    }

    public String getColor() {
        return color;
    }

    public String getSo() {
        return so;
    }

    public double getPrecio() {
        return precio;
    }
    public void guardar(){ Datos.guardar(this); }
}
