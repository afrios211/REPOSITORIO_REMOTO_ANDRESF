/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeometricas;

/**
 *
 * @author ANDRES F
 */
public class circulo extends figura {
    private Double radio ;

    /**
     * @return the radio
     */
    public Double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(Double radio) {
        this.radio = radio;
    }
    
    public circulo(Double pradio ){
        this.radio = pradio;
    }
    
    public double calcularPerimetro(){
        return (2*3.1416*this.radio);
    }
    
    public double calcularPerimetro(Double numero){
        return (2*3.1416*numero);
    }
    
    /**
     *
     * @return
     */
    @Override
    public double calcularArea(){
        return (3.1416*this.radio*this.radio);
    }
    
    public String toSgtring(){
        return "circulo {" + "radio" + radio + "}";
    }
    
    
}



