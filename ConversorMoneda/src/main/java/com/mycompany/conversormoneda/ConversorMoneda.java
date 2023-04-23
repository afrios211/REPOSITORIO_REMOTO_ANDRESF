/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
                  /*Realiza un conversor de pesos a dolar. La cantidad en
                    pesos que se quiere convertir deberá estar
                    almacenada en una variable.*/

package com.mycompany.conversormoneda;

/**
 *
 * @author ANDRES F
 */
//importar biblioteca para recibir datos por teclado
import java.util.Scanner;

//(clase principal)plantilla conversor moneda
public class ConversorMoneda {

    public static void main(String[] args) {
    
        //declaramos variables o atributos que vamos a usar
        double moneda, dolar,conversor;
        String tipoMoneda = "";
        //la variable teclado, va a recibir lo que ingresemos por el teclado 
        Scanner teclado = new Scanner(System.in);
        //imprimir mensaje
        System.out.println("que tipo de moneda es la que desea convertir a dolar");
        //la variable tipoMoneda va a almacenar lo que recibio la variable teclado
        tipoMoneda = teclado.nextLine();
       
        System.out.println("ingrese cantidad sin puntos ni comas");
        //la variable moneda va a almacenar el valor que recibio la variable teclado
        moneda = teclado.nextDouble();
        
        System.out.println("ingrese precio de 1 dolar sin puntos ni comas en "+tipoMoneda+" hoy");
       //la variable dolar almacena el valor que recibio la variable teclado
        dolar = teclado.nextDouble();
        
        conversor = moneda/dolar;
        
        System.out.println(moneda+" "+tipoMoneda+" "+" = "+conversor+" dolares");
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
