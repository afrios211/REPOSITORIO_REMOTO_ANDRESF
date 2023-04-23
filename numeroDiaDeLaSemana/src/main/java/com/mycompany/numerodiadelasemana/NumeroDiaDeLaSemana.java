/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
                 /*Escribe un programa en que dado un número del 1 a
                 7 escriba el correspondiente nombre del día de la
                 semana y lo muestre por consola*/
package com.mycompany.numerodiadelasemana;

/**
 *
 * @author ANDRES F
 */
import java.util.Scanner;
public class NumeroDiaDeLaSemana {

    public static void main(String[] args) {
        int dia = 9;
        
        Scanner teclado = new Scanner(System.in);
        
             while(dia !=0){
                System.out.println("");
                System.out.println("ingrese un numero del 1 al 7, este le mostrara el dia de la semana correspondiente al numero");
                System.out.println("");
                System.out.println("ingrese numero 0 para salir del sistema");
                System.out.println("");
                System.out.println("ingrese numero aqui");
                dia = teclado.nextInt();
                switch(dia){
                    case 0: dia = 0;
                    break;
                    case 1:
                    System.out.println("lunes");
                    break;
                    case 2:
                    System.out.println("martes");
                    break;
                    case 3:
                    System.out.println("miercoles");
                    break;
                    case 4:
                    System.out.println("jueves");
                    break;
                    case 5:
                    System.out.println("viernes");
                    break;
                    case 6:
                    System.out.println("sabado");
                    break;
                    case 7:
                    System.out.println("domingo");
                    break;
                    default:
                    System.out.println("ERROR, NUMERO INCORRECTO");
                }
            }
       
    }
}
