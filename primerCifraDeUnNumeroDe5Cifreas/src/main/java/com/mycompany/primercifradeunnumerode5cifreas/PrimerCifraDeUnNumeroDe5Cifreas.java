/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
                 /*Escribe un programa que diga cuál es la primercifra
                 de un número entero introducido por teclado. Se
                 permiten números de hasta 5 cifras.*/

package com.mycompany.primercifradeunnumerode5cifreas;

/**
 *
 * @author ANDRES F
 */
import java.util.Scanner;

public class PrimerCifraDeUnNumeroDe5Cifreas {

    public static void main(String[] args) {
        
        int numero;
        int primerCifra = 0 ;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("ingreso numero maximo de 5 cifras");
        numero = teclado.nextInt();
        
        if (numero < 10){
            primerCifra = numero;
        }
        
        else if (numero >= 10 && numero < 100){
            primerCifra = numero / 10;
        }
        
        else if (numero >= 100 && numero < 1000){
            primerCifra = numero / 100;
        }
        
        else if (numero >= 1000 && numero < 10000){
            primerCifra = numero / 1000;
        }
        
        else if (numero >= 10000 && numero < 100000){
            primerCifra = numero / 10000;
        }
        
        System.out.println("la primer cifra del numero ingresado es "+ primerCifra);
        
   
    }
}
