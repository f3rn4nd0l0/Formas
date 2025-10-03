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
public class Cuadrado extends Rectangulo{
    
    public Cuadrado(double base, double altura, double altura2, double base2, Color color){
        super(base, altura, base2, altura2, color);
        
    }
    
    
    @Override
    public double perimetro(){
        return this.base * 4;
    }
    
    @Override
    public double area(){
        return this.base * this.base2;
    }
}
