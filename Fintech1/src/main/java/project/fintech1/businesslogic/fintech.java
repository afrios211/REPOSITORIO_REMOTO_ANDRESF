/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project.fintech1.businesslogic;

/**
 *
 * @author ANDRES F
 */
public class fintech {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
        Controlador controlador1 = new Controlador();
        //llamar el metodo crear cliente del objeto controlador1
        controlador1.crearCliente("andres", 
                "rios", "07091987", 
                "afrios211",
                "1053781", 
                "callae15", 
                "calle15", 
                true,
                "ahorros",
                "01", 
                100000);
        
        controlador1.crearCliente("cristian", 
                "rios", "07091987", 
                "afrios211",
                "1053825387", 
                "callae15", 
                "calle15", 
                true,
                "ahorros",
                "02", 
                200000);
        
        
        controlador1.mostrarClientes(); 
          
       // controlador1.eliminarCliente("1053781");
        System.out.println(controlador1.transferir("01", 50000, "02"));
        
       
       
        System.out.println("-------");
        controlador1.mostrarClientes();
        
        
        
//        System.out.println("inicio");
//        for(usuario listadoUsuario : controlador1.listaUsuarios) {
//            System.out.println(listadoUsuario.getCedula());
//        }
//        System.out.println("fin");
    }
    
}
