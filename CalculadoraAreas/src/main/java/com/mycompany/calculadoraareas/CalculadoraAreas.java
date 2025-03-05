/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoraareas;

import com.mycompany.figuras.calcularArea;
import com.mycompany.figuras.triangulo;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author it-seekers
 */
public class CalculadoraAreas {

    public static void main(String[] args) {
        Map<Integer,calcularArea>calculadoraAreas = new HashMap<>();
        
        System.out.println(calculadoraAreas.put(1,new calcularArea(new triangulo())));
    }
}
