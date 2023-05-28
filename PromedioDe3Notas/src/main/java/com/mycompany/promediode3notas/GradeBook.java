/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.promediode3notas;
/**
 *
 * @author ANDRES F
 */

import java.util.Scanner;
//CLASE: plantilla para creacion de un objeto,aqui van los atributos o variables
public class GradeBook {

    /**
     * @return the NombreCurso
     */
    
    /*se declara este atributo como privado para que no sea modificado directamente desde fuera de la clase,
    luego se aplicara el get,set para poder modificar el archivo privado */ 
    private  String NombreCurso;
    private int Aforo;

   //metodo,con get obtengo el valor del atributo
    public String getNombreCurso() {
        return NombreCurso;
    }
  
    
    //metodo,con set modifico el valor del atributo     p=parametro
    public void setNombreCurso(String pNombreCurso) {
        this.NombreCurso = pNombreCurso ;
    }
  
    /**
     * @return the aforo
     */
    public int getAforo() {
        return Aforo;
    }

    /**
     * @param pAforo
     */
    // p = parametro
    public void setAforo(int pAforo) {
        this.Aforo = pAforo;
    }
    
    /**
     *
     */
    public GradeBook() {
    }
    //metodo
    public GradeBook(String pNombreCurso,int pAforo){
        this.NombreCurso = pNombreCurso; 
        this.Aforo = pAforo;
    }
    //metodo
    public GradeBook(String pNombreCurso){
        this.NombreCurso = pNombreCurso;
    }
    
    
    //metodo,no retorna 
     public void displayMessage() {
		System.out.println("Bienvenido al sistema de Notas : "+ getNombreCurso());
    }
     
     public void determineClassAverage(){
         Scanner teclado = new Scanner(System.in);
         
         int total;
		int gradeCounter;
		int grade;
		int average;
		
		total = 0 ;
		gradeCounter = 1;
		
		while (gradeCounter <= 8) {
			System.out.println("Ingrese la nota");
			grade = teclado.nextInt();
			total = total + grade;
			gradeCounter = gradeCounter +1;
		}
		
		average = total /8;
		System.out.println("Total de las notas Sumatoria: " + total);
		System.out.println("Promedio: " + average );	
         
     }
}
