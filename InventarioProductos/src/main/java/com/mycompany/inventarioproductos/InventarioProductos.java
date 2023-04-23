/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.inventarioproductos;

import javax.swing.JOptionPane;

/**
 *
 * @author ANDRES F
 */
import java.util.Scanner;

//CLASE PRINCIPAL
public class InventarioProductos {

    //METODO PRINCIPAL
    public static void main(String[] args) {
     
        //estoy declarando objetos del tipo productos,lo anterior se hace con la plantilla que creè en "class"
        //en este caso se crean variables ya que voy a entrar valores por teclado
        int precio=0;
        int existencias=0;
        //se crea el objeto teclado de la libreria scanner para poder ingresar valores por teclado
        Scanner teclado = new Scanner(System.in);
        //imprimir mensaje
        System.out.println("ingrese precio del arroz");
       //del objeto teclado se llama el metodo nextInt para guardar el valor ingresado por teclado en la variable precio
        precio = teclado.nextInt();
       
        System.out.println("ingrese existencias");
        existencias = teclado.nextInt();
        //se crea un objeto del clese productos, se crea llamando el metodo constructor
        Productos producto1 = new Productos("arroz",precio,existencias);
        //se crea un objeto de la clese productos, se crea llamando el metodo constructor
        Productos producto2 = new Productos("panela",2500,180);
        Productos producto3 = new Productos("aceite",9500,240);
        //imprimir los valores del objeto usando el metodo calcularValorExistencias()   de la clase productos
        System.out.println("el valor en stock de "+producto1.getNombre()+ " es "+producto1.calcularValorExistencias());
        System.out.println("el valor en stock de "+producto2.getNombre()+ " es "+producto2.calcularValorExistencias());
        System.out.println("el valor en stock de "+producto3.getNombre()+ " es "+producto3.calcularValorExistencias());
       //en la variable "valorUniversal" se almacena el valor que nos retorna el metodo "totalUniversalStock"
        int valorUniversal =  totalUniversalStock(producto1.calcularValorExistencias(),producto2.calcularValorExistencias(),producto3.calcularValorExistencias());
        //imprimir mensaje
        System.out.println("valor total stock es "+ valorUniversal);
    }   
    //metodo creado para sumar los 3 valores de existencias
    public static int totalUniversalStock(int totalStock1,int totalStock2,int totalStock3 ){
        int valorTotal = totalStock1 + totalStock2 + totalStock3;
        return valorTotal;
    
    }
    
}
