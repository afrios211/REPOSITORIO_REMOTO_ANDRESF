/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.fintech1.businesslogic;
//importar libreria Array list para poder realizar la lista de clientes

import java.util.ArrayList;

/**
 *
 * @author ANDRES F
 */
//clase principal
public class Controlador {

 float totalComision;
    //instanciar o crear un objeto de tipo ArrayList
    ArrayList<usuario> listaUsuarios = new ArrayList<usuario>();
    ArrayList<cuenta> listaCuentas = new ArrayList<cuenta>();
   ArrayList<administrador> listaAdministradores = new ArrayList<administrador>();
    //metodo constructor vacio 
    public Controlador() {
        
                crearAdministrador("cristian", 
                "rios", "07091987", 
                "afrios211",
                "1053", 
                "callae15", 
                "calle15", 
                true);
                
                crearCliente("andres", 
                "rios", "07091987", 
                "afrios211",
                "1053781", 
                "callae15", 
                "calle15", 
                true,
                "ahorros",
                "01", 
                100000);
        
                crearCliente("cristian", 
                "rios", "07091987", 
                "afrios211",
                "1053825387", 
                "callae15", 
                "calle15", 
                true,
                "ahorros",
                "02", 
                200000);
        
        
    }
    
    //metodo crear administrador
    public void crearAdministrador(String nombre, String apellidos, String fechaNacimiento, String correoElectronico,String cedula, String direccionResidencia, String direccionCorrespondencia, boolean esActivo){
        administrador adminstrador1 = new administrador( nombre, apellidos, fechaNacimiento, correoElectronico, cedula, direccionResidencia, direccionCorrespondencia, esActivo);
        listaAdministradores.add(adminstrador1);  
    }

    //metodo actualizar administrador
    public String actualizarAdmnistrador(String cedula, String correoNuevo, String direccionResidenciaNueva, String direccionCorrespondenciaNueva, boolean esActivo ){
       
        for (int contador = 0; contador < listaAdministradores.size(); contador++) {

            administrador administradorActual = listaAdministradores.get(contador);

            if (administradorActual.getCedula().equals(cedula)) {

                administradorActual.setCorreoElectronico(correoNuevo);
                administradorActual.setDireccionCorrespondencia(direccionCorrespondenciaNueva);
                administradorActual.setDireccionResidencia(direccionResidenciaNueva);
                administradorActual.setEsActivo(esActivo);
               
                return "actualizacion exitosa";
                
                
            } 
        }    
        return "cedula inexixtente";
    }            

    //buscarAdministrador
    
    public boolean buscarAdministrador(String cedula){
        for (int contador = 0; contador < listaAdministradores.size(); contador++) {

            administrador administradorActual = listaAdministradores.get(contador);

            if (administradorActual.getCedula().equals(cedula) && administradorActual.isEsActivo() == true) {

                return true;  

            } 
        } 
    return false; 
    }
    
    
    public usuario buscarCliente(String cedula){
        for (int contador = 0; contador < listaUsuarios.size(); contador++) {

            usuario usuarioActual = listaUsuarios.get(contador);

            if (usuarioActual.getCedula().equals(cedula) ) {

                return usuarioActual ;  

            } 
        } 
    return null; 
    }
    
    public cuenta buscarCuenta(String cedula){
        for (int contador = 0; contador < listaCuentas.size(); contador++) {

            cuenta cuentaActual = listaCuentas.get(contador);

            if (cuentaActual.getCedula().equals(cedula) ) {

                return cuentaActual ;  

            } 
        } 
    return null; 
    }
    
    
    
    
//metodo para crear clientes 
    public void crearCliente(String nombre, String apellidos, String fechaNacimiento, String correoElectronico,
            String cedula, String direccionResidencia, String direccionCorrespondencia,
            boolean recibirNotificaciones, String tipoCuenta, String numeroCuenta, float saldo) {

        //instanciar objeto usuario de la clase principal usuario
        usuario usuario1 = new usuario(nombre, apellidos, fechaNacimiento,
                correoElectronico, cedula, direccionResidencia,
                direccionCorrespondencia, recibirNotificaciones);
        //utilizamos metodo agregar de la clase ArrayList
        listaUsuarios.add(usuario1);

        //instanciar objeto cuenta de la clase principal cuenta
        cuenta cuenta1 = new cuenta(cedula, tipoCuenta, numeroCuenta, saldo);
        listaCuentas.add(cuenta1);
    }

    //metodo eliminar cuenta
    public void eliminarCliente(String cedula) {
        //recorrer la lista para encontrar el usuario con la cedula respectiva que voy a borrar
        for (int contador = 0; contador < listaUsuarios.size(); contador++) {
            //
            usuario usuarioActual = listaUsuarios.get(contador);

            if (usuarioActual.getCedula().equals(cedula)) {
                listaUsuarios.remove(contador);
                break;
            }
        }
    }

    //metodo editar cliente
    public void actualizarCliente(String cedula, String correoNuevo,
            String direccionCorrespondenciaNueva, String direccionResidenciaNueva,
            boolean recibirNotificacionesNuevo) {
        //recorrer la lista para encontrar el usuario con la cedula que voy a ingresar
        for (int contador = 0; contador < listaUsuarios.size(); contador++) {

            usuario usuarioActual = listaUsuarios.get(contador);

            if (usuarioActual.getCedula().equals(cedula)) {

                usuarioActual.setCorreoElectronico(correoNuevo);
                usuarioActual.setDireccionCorrespondencia(direccionCorrespondenciaNueva);
                usuarioActual.setDireccionResidencia(direccionResidenciaNueva);
                usuarioActual.setRecibirNotificaciones(recibirNotificacionesNuevo);
                break;
            }
        }
    }
    //metodo mostrar todos los clientes en una lista
    public void mostrarClientes() {
        for (int i = 0; i < listaUsuarios.size(); i++) {
            usuario usuarioActual = listaUsuarios.get(i);
            cuenta cuentaActual = listaCuentas.get(i);
            String nombre = usuarioActual.getNombre();
            String apellido = usuarioActual.getApellidos();
            String cedula = usuarioActual.getCedula();
            float saldo = cuentaActual.getSaldo();

            System.out.println(nombre + " " + apellido + " " + cedula + "     " + saldo);

        }
    }
    
    //metodo cobrar comision
     public void cobrarComision(float valorTransaccion, cuenta cuentaEmisor){
        float comision = valorTransaccion * 0.0005f;
        float nuevoSaldo = cuentaEmisor.getSaldo() - comision;
        cuentaEmisor.setSaldo(nuevoSaldo);
        totalComision = comision + totalComision;   
    }
    
    //metodo transferir
    public String transferir(String numeroCuentaEmisor, float valorTransferencia, String numeroCuentaReceptor) {
        //recorrer lista de cuentas
        for (int contador = 0; contador < listaCuentas.size(); contador++) {
            //encontrar cuenta emisor
            cuenta cuentaActual = listaCuentas.get(contador);
            if (cuentaActual.getNumeroCuenta().equals(numeroCuentaEmisor)) {
                float comision = valorTransferencia * 0.0005f;
                float comisionMasConsignacion = valorTransferencia + comision;
                if(cuentaActual.getSaldo()>= comisionMasConsignacion){
                
                    float nuevoSaldo = cuentaActual.getSaldo() - valorTransferencia;
                    cuentaActual.setSaldo(nuevoSaldo);

                    cobrarComision(valorTransferencia, cuentaActual);
                    cuentaActual.agregarMovimientos("Movimiento: Transferencia - Destinatario: "+ numeroCuentaReceptor+ " - Valor: "+valorTransferencia);
                    break;
                }
                else {
                return "fondos insuficientes";
                }
                
            }
            else{
                if(contador == listaCuentas.size()-1 ){
                    return "numero de cuenta emisor inexistente" ;
                }
            } 
        }
   
        //recorrer la lista de cuentas
        for (int contador = 0; contador < listaCuentas.size(); contador++) {
            //encontrar cuenta receptor
            cuenta cuentaActual = listaCuentas.get(contador);
            if (cuentaActual.getNumeroCuenta().equals(numeroCuentaReceptor)) {
                float nuevoSaldo = cuentaActual.getSaldo() + valorTransferencia;
                cuentaActual.setSaldo(nuevoSaldo);
                break;
            }
            
         else{
                if(contador == listaCuentas.size()-1 ){
                    return "numero de cuenta receptor inexistente" ;
                }
            } 

        
        
        }
        
        
        return "tranferencia exitosa";
    }
    //metodo retirar 
    public String retirar(String numeroCuentaCliente,float valorRetiro){
     //recorrer lista de cuentas
        for (int contador = 0; contador < listaCuentas.size(); contador++) {
            //encontrar cuenta emisor
            cuenta cuentaActual = listaCuentas.get(contador);
            if (cuentaActual.getNumeroCuenta().equals(numeroCuentaCliente)) {
                float comision = valorRetiro * 0.0005f;  
                float comisionMasRetiro = valorRetiro + comision;
                
                if(cuentaActual.getSaldo()>= comisionMasRetiro ){
                    float nuevoSaldo = cuentaActual.getSaldo() - valorRetiro;
                    cuentaActual.setSaldo(nuevoSaldo);
                    cobrarComision(valorRetiro, cuentaActual);
                     cuentaActual.agregarMovimientos("Movimiento: retiro - Valor: "+valorRetiro);
                    break;
                }
                else{
                    return "saldo insuficiente";
                }
                
            }  
             else{
                if(contador == listaCuentas.size()-1 ){
                    return "numero de cuenta emisor inexistente" ;
                }
            } 
        }
        return "retiro exitoso";
    }
    //metodo consignar
    public String consignar(String numeroCuentaClente, float valorConsignacion){
        for (int contador = 0; contador < listaCuentas.size(); contador++) {
                //encontrar cuenta emisor
                cuenta cuentaActual = listaCuentas.get(contador);
                if (cuentaActual.getNumeroCuenta().equals(numeroCuentaClente)) {

                    float nuevoSaldo = cuentaActual.getSaldo() + valorConsignacion;
                    cuentaActual.setSaldo(nuevoSaldo);

                    cobrarComision(valorConsignacion, cuentaActual);
                    cuentaActual.agregarMovimientos("Movimiento: consignacion - Valor: "+valorConsignacion);
                    break;

                }
                else{
                    if(contador == listaCuentas.size()-1 ){
                        return "numero de cuenta emisor inexistente" ;
                    }
                } 
        }
        return "consignacion exitosa";
    }
    
    
}
