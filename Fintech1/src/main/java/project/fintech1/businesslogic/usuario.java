package project.fintech1.businesslogic;

import java.util.ArrayList;
//clase usuario, hereda atributos de la clase principal persona
public class usuario extends persona {

	/**
	 * @param nombre
	 * @param apellidos
	 * @param fechaNacimiento
	 * @param correoElectronico
	 * @param cedula
	 * @param direccionResidencia
	 * @param direccionCorrespondencia
	 * @param recibirNotificaciones
	 */
        //metodo constructor de la clase usuarios heredada de la clase principal personas(se llama igual que la clase)
	public usuario(String nombre, String apellidos, String fechaNacimiento, String correoElectronico, String cedula,
			String direccionResidencia, String direccionCorrespondencia, Boolean recibirNotificaciones) {
		super(nombre, apellidos, fechaNacimiento, correoElectronico, cedula, direccionResidencia, direccionCorrespondencia,
				recibirNotificaciones);
		// TODO Auto-generated constructor stub
	}
	
	
//	public String eliminarCliente(String cedula) {
//		
//		//TODO: Implementar un metodo que busque el cliente con la cedula y elimine el registro 
//		//p.ej:
//		//ArrayList<String> demo = new ArrayList<String>();
//		//demo.remove(0)
//		
//		boolean fueEliminado = false;
//		
//		if (fueEliminado) {
//			return "El cliente fue eliminado correctamente";
//			
//		}else
//		{
//			return "El cliente fue no encontrado correctamente";
//			
//		}
//			
//	}
//	
//	public usuario consultarCliente(String cedula) {
//		//TODO: 1. Implemente un metodo que busque con el # cedula
//		//p.ej:
//		ArrayList<usuario> demo = new ArrayList<usuario>();
//		usuario user1 = demo.get(0);
//		
//		return new usuario();
//	}
////	
//	
//	public usuario editarCliente(String cedula){
//		
//		//TODO: 1. Implemente un metodo que busque con el # cedula ver consultarCliente
//		//p.ej:
//		ArrayList<usuario> demo = new ArrayList<usuario>();
//		usuario user1 = demo.get(0);
//	
//		
//		//TODO: 2. asignar al cliente el dato que quiero modificar
//		user1.setCorreoElectronico(cedula);
//		
//		
//		//TODO: 3.agregar el usuario modificado a la lista.
//		demo.add(user1);
//		
//
//		return new usuario();
//	}
//	
//	
//	public String agregarSaldo(float nuevoSaldo) {
//		String resultadoOperacion = "";
//		
//		//cuenta nuevaCuenta = new cuenta("0001", 2000);
//		
//		//nuevaCuenta.setSaldo(nuevaCuenta.getSaldo() + nuevoSaldo); 
//		
//		resultadoOperacion = "Saldo consignado Satisfactoriamente";
//		
//		return resultadoOperacion;
//	}
//        
//        public String prueba(String apellido,  ArrayList<usuario> listadoUsuarios) {
//		String resultadoOperacion = "";
//                listadoUsuarios.get(0).setApellidos(apellido);
//		
//		resultadoOperacion = "Saldo consignado Satisfactoriamente";
//		
//		return resultadoOperacion;
//	}

}
