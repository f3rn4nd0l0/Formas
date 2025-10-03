/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.awt.Color;

/**
 *
 * @author ferlo
 */
public class Circulo extends Forma{
    double radio;
    
    public Circulo(double radio, double pi, Color color){
        super(color);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public Color getColor() {
        return color;
    }
    
    public double area(){
        return Math.PI * Math.pow(radio, 2);
    }
    
    public double perimetro(){
        return 2 * Math.PI * radio;
    }
}
