/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeometricas;

/**
 *
 * @author ANDRES F
 */
public class triangulo extends figura {
    
    private double base;
    private double ladoA;
    private double ladoB;
    private double altura;
    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * @return the ladoA
     */
    public double getLadoA() {
        return ladoA;
    }

    /**
     * @param ladoA the ladoA to set
     */
    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    /**
     * @return the ladoB
     */
    public double getLadoB() {
        return ladoB;
    }

    /**
     * @param ladoB the ladoB to set
     */
    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }
    
     /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }
    
    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public triangulo (double pbase, double pladoA, double pladoB, double paltura){
        this.base = pbase;
        this.ladoA = pladoA;
        this.ladoB = pladoB;
        this.altura = paltura;
    }
    
    public double calcularPerimetro(){
        return (this.base + this.ladoA + this.ladoB);
    }
    
    public double calcularArea(){
        return ((this.base * this.altura)/2.0);
    }

    public String toString() {
        return "triangulo{" + "base=" + base + ", ladoA=" + ladoA + ",ladoB" + ladoB + ",altura" + altura + "}";
    }
    
}
