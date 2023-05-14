/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.figurasgeometricas;

/**
 *
 * @author ANDRES F
 */
public class FigurasGeometricas {

    public static void main(String[] args) {
        
        circulo circulo1 = new circulo(5.0);
        cuadrado cuadrado1 = new cuadrado(5.0,5.0);
        triangulo triangulo1 = new triangulo(5.0,5.0,5.0,5.0);
     
        System.out.println("el area del circulo es " + circulo1.calcularArea());
        System.out.println("el area de cuadrado es "+ cuadrado1.calcularArea());
         System.out.println("el area de triangulo es "+ triangulo1.calcularArea());
    
    }


}


