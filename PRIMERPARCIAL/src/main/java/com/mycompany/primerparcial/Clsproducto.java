/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.primerparcial;

import java.util.Scanner;

/**
 *
 * @author HP-PC
 */
public class Clsproducto {
    
  private Scanner t = new Scanner(System.in);
    private String descripcion;
    private int precio;
    private Double cantidad;
    private Double peso ;
    
    public void recolectarInformacion(){
        System.out.println("Ingrese la descripcion: ");
        setDescripcion(getT().nextLine());
        System.out.println("Ingrese la precio: ");
        setprecio(getT().nextInt());
        getT().nextLine();
        System.out.println("Ingrese el cantidad: ");
        setcantidad(Double.valueOf(getT().nextLine()));
        System.out.println("Ingrese el peso: ");
        setPeso(Double.valueOf(getT().nextLine()));
    }

    /**
     * @return the t
     */
    public Scanner getT() {
        return t;
    }

    /**
     * @param t the t to set
     */
    public void setT(Scanner t) {
        this.t = t;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the cantidad
     */
    public int getprecio() {
        return precio;
    }

    /**
     * @param precio the cantidad to set
     */
    public void setprecio(int precio) {
        this.precio = precio;
    }

    /**
     * @return the valor
     */
    public Double getcantidad() {
        return cantidad;
    }

    /**
     * @param cantidar the cantidad to set
     */
    public void setcantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the peso
     */
    public Double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(Double peso) {
        this.peso = peso;
    }

}
