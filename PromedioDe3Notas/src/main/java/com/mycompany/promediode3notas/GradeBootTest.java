/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.promediode3notas;
  import java.util.Scanner;
/**
 *
 * @author ANDRES F
 */
public class GradeBootTest {

    /**
     * @param args the command line arguments
     */
    // metodo principal
    public static void main(String[] args) {
        //metodo constructor
        Scanner teclado = new Scanner(System.in);
        
       
        /*tipo objeto(nombre de la clase)+nombre del objeto(como quiero llamar al objeto)+
        metodo constructor(metodo que se llama desde la clase)
        */
        /*se esta creando un objeto llamado "planillaNotasCurso1",este objeto es del tipo "GradeBook"(clase GradeBook)
        y se crea utilizando el metodo constructor "GradeBook()"*/ 
        GradeBook planillaNotasCurso1 = new GradeBook(); 
        System.out.println("ingrese nombre del curso 1");
        String pNombreCurso = teclado.nextLine();
        planillaNotasCurso1.setNombreCurso(pNombreCurso);
        
        GradeBook planillaNotasCurso2 = new GradeBook("curso 2"); 
         
        GradeBook planillaNotasCurso3 = new GradeBook("curso 3", 20);
        
       
        planillaNotasCurso1.displayMessage();
		
	planillaNotasCurso2.displayMessage();
		
	planillaNotasCurso3.displayMessage();
		
	System.out.println("Numero de estudiantes del curso: "+ planillaNotasCurso3.getNombreCurso() + " Aforo: " +planillaNotasCurso3.getAforo());
        
        
        
        
        // System.out.println("escriba el nombre del curso 3");
        // String NombreCurso3 = teclado.nextLine();
         //planillaNotasCurso3.setNombreCurso(NombreCurso3);
         
         //System.out.println("escriba el numero de aforo");
         //int aforo3 = teclado.nextInt();
         //planillaNotasCurso3.setAforo(aforo3);
         
        // String NombreCurso3="programacion";
        // int aforo3=3;
         
         //GradeBook planillaNotasCurso3 = new GradeBook(NombreCurso3, aforo3);
         
        // System.out.println("Numero de estudiantes del curso: "+ planillaNotasCurso3.getNombreCurso());
         
         
         
         
         
        
         
         
        
        
        
        
        
        
        
        
    }
    
}
