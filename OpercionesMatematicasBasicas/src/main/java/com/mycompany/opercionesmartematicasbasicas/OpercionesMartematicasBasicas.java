/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
                  /*Escribe un programa en el que se declaren las
                   variables enteras numeroA y numeroB. Asignales los
                   valores 89 y 323. Mostrar por consola el valor de cada
                   variable, la suma, la resta, la división y la
                   multiplicación.*/
package com.mycompany.opercionesmartematicasbasicas;

/**
 *
 * @author ANDRES F
 */
//(clase principal)
public class OpercionesMartematicasBasicas {

    //(metodo principal)ejecutar los metodos 
    public static void main(String[] args) {
        suma();
        resta();
        multiplicacion();
        division();
    }
    //(metodo)sumar 2 numeros, luego imprimir resultado
    public static void suma(){
        int numeroA = 89, numeroB = 323,resultado;
        resultado = numeroA + numeroB;
        System.out.println(numeroA+"+"+numeroB+"="+resultado);
    }
    //(metodo)restar 2 numeros, luego imprimir resultado
    public static void resta(){
        int numeroA = 89,numeroB = 323,resultado;
        resultado = numeroA - numeroB;
        System.out.println(numeroA+"-"+numeroB+"="+resultado);
    }
    //(metodo)multiplicar 2 numeros, luego imprimirnresultado
    public static void multiplicacion(){
        int numeroA = 89,numeroB = 323,resultado;
        resultado = numeroA * numeroB;
        System.out.println(numeroA+"x"+numeroB+"="+resultado);
    }
    
    //(metodo)dividir 2 numreos luego imprimir resultado
    public static void division(){
        double numeroA = 89,numeroB = 323,resultado;
        resultado = numeroA / numeroB;
        System.out.println(numeroA+"/"+numeroB+"="+resultado);
    }
    }

