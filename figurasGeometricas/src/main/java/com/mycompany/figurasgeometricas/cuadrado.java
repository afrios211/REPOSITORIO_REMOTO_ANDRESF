/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeometricas;

/**
 *
 * @author ANDRES F
 */
public class cuadrado extends figura{
    private double ancho;
    private double alto;

    /**
     * @return the ancho
     */
    public double getAncho() {
        return ancho;
    }

    /**
     * @param ancho the ancho to set
     */
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    /**
     * @return the alto
     */
    public double getAlto() {
        return alto;
    }

    /**
     * @param alto the alto to set
     */
    public void setAlto(double alto) {
        this.alto = alto;
    }
    
    public cuadrado(double pancho, double palto){
        this.ancho = pancho;
        this.alto = palto;
    }
    
    public double calcularPerimetro(){
        return (this.ancho + this.ancho + this.alto + this.alto);
    }
    
    public double calcularArea(){
        return (this.ancho * this.alto);
    }
    
    public String toString() {
        return "Cuadrado{" + "alto=" + alto + ", ancho=" + ancho + "}";
    }
}
    

    
    

