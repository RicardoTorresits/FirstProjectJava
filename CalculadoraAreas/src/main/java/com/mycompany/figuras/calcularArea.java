/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.figuras;

/**
 *
 * @author it-seekers
 */
public class calcularArea {

    private FiguraGeometrica figura;

    public calcularArea(){}
    
    public calcularArea(FiguraGeometrica figura) {
        this.figura = figura;
    }

    public FiguraGeometrica getFigura() {
        return figura;
    }

    public void setFigura(FiguraGeometrica figura) {
        this.figura = figura;
    }
    
    public double calcular(){
        return this.figura.calcularArea();
    }
}
