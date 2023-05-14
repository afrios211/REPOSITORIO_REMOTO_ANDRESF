/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeometricas;

/**
 *
 * @author ANDRES F
 */
//CLASE: plantilla para creacion de un objeto,aqui van los atributos o variables
public class figura {
   
    private String color;

    /**
     * @return the color
     */
    //metodo get, obtengo el valor del atributo
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    //metodo set, modifico el valor del atributo
    public void setColor(String color) {
        this.color = color;
    }
    
    public double calcularArea(){
        return 0.0;
    }
    
    public double calcularPerimetro(){
        return 0.0;
    }
    //numero, correspone a radio en circulo y a lado en cadrado
    public double calcularPerimetro(Double numero){
        return 0.0;
    }
    
    public String toString(){
        return "figura {" + "color" + color + "}" ;
    }
    
    
}
