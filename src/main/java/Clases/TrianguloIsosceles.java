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
public class TrianguloIsosceles extends Triangulo{

    public TrianguloIsosceles(double base, double altura, double ladosIguales, Color color) {
        super(base, altura, ladosIguales, ladosIguales, color);
    }

    @Override
    public double perimetro() {
        return this.lado1 * 2 + this.base;
    }

    @Override
    public double area() {
        return this.base * this.altura/2;
    }
    
    
    
    
}
