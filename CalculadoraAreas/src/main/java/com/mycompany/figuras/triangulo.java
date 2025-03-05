/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.figuras;

/**
 *
 * @author it-seekers
 */
public class triangulo implements FiguraGeometrica {
    private double base;
    private double altura;
    
    public triangulo(){}
    
    public triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    @Override
    public double calcularArea(){
        
        double restult = (getBase() * getAltura())/2;
        
        return restult;
    }
}
