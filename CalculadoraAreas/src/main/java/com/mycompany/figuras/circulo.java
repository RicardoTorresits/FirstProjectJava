/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.figuras;

/**
 *
 * @author it-seekers
 */


public class circulo implements FiguraGeometrica {
    
    private double radio;
    
    public circulo () {}

    public circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularArea(){
        double restult = Math.pow(Math.PI * getRadio(),2);
        return restult;
    }


}
