/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
                        /*Escribe un programa que ordene tres números
                         enteros introducidos por teclado. Que los muestre sin
                         ordenar y despues ordenados por consola*/

package com.mycompany.ordenar3numerosenterosporteclado;

/**
 *
 * @author ANDRES F
 */

//importar libreria para recibir datos por teclado
import java.util.Scanner;

//clase principal
public class Ordenar3NumerosEnterosPorTeclado {
    
    //metodo principal
    public static void main(String[] args) {
        
        //declarar variables donde se almaceran los datos ingresados por teclado
        int n1;
        int n2;
        int n3;
        
        //se crea un objeto teclado de libreria Scanner, para poder ingresas vaores por teclado
        Scanner teclado = new Scanner(System.in);
        
        //imprimir mensaje
        System.out.println("ingrese primer numero");
        /*del objeto teclado, sellama el metodo nextInt para guardar el valor ingresado por teclado
        en la variable n1*/
        n1 = teclado.nextInt();
        
        //imprimir mensaje
        System.out.println("ingrese segundo numero");
        n2 = teclado.nextInt();
        
        System.out.println("ingrese tercer numero");
        n3 = teclado.nextInt();
        
        //if else, se utiliza para tomar desiciones sobre un valor preexistente (condicional)
        if (n1 < n2 && n2 < n3){
            System.out.println("los numeros ingresados son");
            System.out.println(n1+" "+n2+" "+n3);
            System.out.println("ordenados de menor a mayor");
            System.out.println(n1+" "+n2+" "+n3);
        }
        
        else if (n1 < n3 && n3 < n2){
            System.out.println("los numeros ingresados son");
            System.out.println(n1+" "+n2+" "+n3);
            System.out.println("ordenados de menor a mayor");
            System.out.println(n1+" "+n3+" "+n2);
        }
        
        else if (n2 < n1 && n1 < n3) {
            System.out.println("los numeros ingresados son");
            System.out.println(n1+" "+n2+" "+n3);
            System.out.println("ordenados de menor a mayor");
            System.out.println(n2+" "+n1+" "+n3);
        }
        
        else if (n2 < n3 && n3 < n1) {
            System.out.println("los numeros ingresados son");
            System.out.println(n1+" "+n2+" "+n3);
            System.out.println("ordenados de menor a mayor");
            System.out.println(n2+" "+n3+" "+n1);
        }
        
        else if (n3 < n1 && n1 < n2) {
            System.out.println("los numeros ingresados son");
            System.out.println(n1+" "+n2+" "+n3);
            System.out.println("ordenados de menor a mayor");
            System.out.println(n3+" "+n1+" "+n2);
        }
        
        else if (n3 < n2 && n2 < n1) {
            System.out.println("los numeros ingresados son");
            System.out.println(n1+" "+n2+" "+n3);
            System.out.println("ordenados de menor a mayor");
            System.out.println(n3+" "+n2+" "+n1);
        }
        
    }
}
