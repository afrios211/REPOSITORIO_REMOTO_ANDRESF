/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.promediode3notas;

/**
 *
 * @author ANDRES F
 */
public class GradeBook {

    /**
     * @return the NombreCurso
     */
    public String getNombreCurso() {
        return NombreCurso;
    }

    /**
     * @param NombreCurso the NombreCurso to set
     */
    public void setNombreCurso(String NombreCurso) {
        this.NombreCurso = NombreCurso;
    }
    
  private  String NombreCurso; //privado para que no pueda ser modificado
     public void displayMessage() {
		System.out.println("Bienvenido al sistema de Notas");
	}
    
}
