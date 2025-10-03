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
public class Rectangulo extends Forma{
    double base, altura, base2, altura2;
    
    public Rectangulo(double base, double altura, double base2, double altura2, Color color){
        super(color);
        
        this.altura = altura;
        this.base = base;
        this.base2 = base2;
        this.altura2 = altura2;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase2() {
        return base2;
    }

    public double getAltura2() {
        return altura2;
    }

    public Color getColor() {
        return color;
    }
    
    public double area(){
        return base * altura;
    }

    public double perimetro(){
        return base + base2 + altura + altura2;
    }
    
    
}
