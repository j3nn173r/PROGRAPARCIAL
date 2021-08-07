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
public class clsgastos {

    Double getimpuesto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Double getmobiliario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Double getmercaderia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public class ClsGastos {
    private Scanner t = new Scanner(System.in);
    private Double impuesto;
    private Double mobiliario;
    private Double mercaderia;
   
    
    public void recolectarInformacion(){
        System.out.println("impuesto: ");
        setimpuesto(Double.valueOf(getT().nextLine()));
        System.out.println("mobiliario: ");
        setmobiliario(Double.valueOf(getT().nextLine()));
        System.out.println("mercaderia: ");
        setmercaderia(Double.valueOf(getT().nextLine()));
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
     * @return the impuesto
     */
    public Double getimpuesto() {
        return impuesto;
    }

    /**
     * @param impuesto the impuesto to set
     */
    public void setimpuesto(Double impuesto) {
        this.impuesto = impuesto;
    }

    /**
     * @return the mobiliario
     */
    public Double getmobiiario() {
        return mobiliario;
    }

    /**
     * @param mobiliario the mobiliario to set
     */
    public void setmobiliario(Double mobiliario) {
        this.mobiliario = mobiliario;
    }

    /**
     * @return the mercaderia
     */
    public Double getmercaderia() {
        return mercaderia;
    }

    /**
     * @param mercaderia the mercaderia to set
     */
    public void setmercaderia(Double mercaderia) {
        this.mercaderia  = mercaderia;
    }

    }
}
