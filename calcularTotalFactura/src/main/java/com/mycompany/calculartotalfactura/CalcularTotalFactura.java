/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
                      /*Escribe un programa que calcule el total de una
                        factura a partir de la base de la compra (precio sin
                        IVA). La base de la compra estará almacenada en una
                        variable.
                        Salida en consola:
                        Base sin IVA: $3500
                        IVA: $665
                        Total: $4165*/
package com.mycompany.calculartotalfactura;

/**
 *
 * @author ANDRES F
 */
 
import java.util.Scanner;
public class CalcularTotalFactura {
    //clase principal
    public static void main(String[] args) {
        //declarar variables 
        double precioFactura;
        double iva;
        double total;
       //se crea el objeto teclado de la libreria Scanner para poder ingresar valores por teclado
        Scanner teclado = new Scanner(System.in);
        //imprimir mensaje en consola
        System.out.println("ingrese precio de la factura");
        /*del objeto teclado se llama el metodo nexDouble para poder guardar el valor ingresado por teclado
        en la variable precioFactura*/
         precioFactura = teclado.nextDouble();
         
         iva = (19.0/100.0)*precioFactura;
         System.out.println(iva);
         total = precioFactura + iva;
         
         System.out.println("precio sin iva  "+precioFactura);
         System.out.println("iva del 19%  "+iva);
         System.out.println("total  "+total);
         
         
        
                
       
       
       
    }
}
