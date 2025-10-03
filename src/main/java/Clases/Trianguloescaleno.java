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
public class Trianguloescaleno extends Triangulo{
    
    public Trianguloescaleno(double base, double altura, double lado1, double lado2, Color color){
        super(base, altura, lado1, lado2, color);
    }
    
    @Override
    public double area(){
        return this.base * this.altura/2;
    }
    
    @Override
    public double perimetro(){
        return this.lado1 + this.lado2 + this.base;
    }
}
