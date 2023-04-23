/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventarioproductos;

/**
 *
 * @author ANDRES F
 */

/*crear una aplicacion de inventario para una tienda que permita llevar el registro
o inventario de los productos y valor total de los productos en inventario
 */
//CLASE: plantilla para creacion de un objeto,aqui van los atributos o variables
public class Productos {

    /*se declara este atributo como privado para que no sea modificado directamente desde fuera de la clase,
   luego se aplicara la get,set para poder modificar el archivo privado */
    private String nombre;

    //con get obtengo el valor del atributo
    public String getNombre() {
        return nombre;
    }
    //con set modifico el valor del atributo
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //a estos atributos se dejan igual ya que seran publicos
    int precio;
    int existencias;
    
    //creamos metodo constructor,para darle valor inicial a los atributos en el momento en se se crea un objeto
    //le da valor a los atributos y se llama igual que la clase
    //(String nombre, int precio, int existencias )son los parametros que van a entrar al metodo desde la "main class"
    public Productos(String nombre, int precio, int existencias ){ 
       //con this, se hace referencia a los atributos de la propia clase
        this.nombre = nombre;
        this.precio = precio;
        this.existencias = existencias;
        
    }
    //metodo
    public int calcularValorExistencias(){
        int resultado = this.precio * this.existencias;
        return resultado; 
        
    }
    

}      
