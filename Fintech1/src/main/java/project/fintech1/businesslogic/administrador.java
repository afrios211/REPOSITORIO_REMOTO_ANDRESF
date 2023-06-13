package project.fintech1.businesslogic;
//clase administrador, hereda atributos de la clase persona
public class administrador extends persona {
	
	boolean esActivo;
	
	
	public boolean isEsActivo() {
		return esActivo;
	}

	public void setEsActivo(boolean esActivo) {
		this.esActivo = esActivo;
	}





	/**
	 * @param nombre
	 * @param apellidos
	 * @param fechaNacimiento
	 * @param correoElectronico
	 * @param cedula
	 * @param direccionResidencia
	 * @param direccionCorrespondencia
	 * @param recibirNotificaciones
	 * @param esActivo
	 */
        //metodo constructor 
	public administrador(String nombre, String apellidos, String fechaNacimiento, String correoElectronico,String cedula, String direccionResidencia, String direccionCorrespondencia, boolean esActivo) {
		super(nombre, apellidos, fechaNacimiento, correoElectronico, cedula, direccionResidencia,direccionCorrespondencia);
		this.esActivo = esActivo;
	}
	
//	public administrador crearAdministrador(String nombre, String apellidos, String fechaNacimiento, String correoElectronico,
//			String cedula, String direccionResidencia, String direccionCorrespondencia, Boolean recibirNotificaciones,
//			boolean esActivo) {
//		
//		return new administrador(nombre, apellidos, fechaNacimiento, correoElectronico, cedula, direccionResidencia, direccionCorrespondencia, recibirNotificaciones, esActivo);
//	}
//	
//	public administrador ActualizarAdministrador(String cedula) {
//		
//		return new administrador();
//		
//		//TODO: Implementar metodo que busque con la cedula del admin y retorne todos los datos de este objeto
//		//return new administrador(nombre, apellidos, fechaNacimiento, correoElectronico, cedula, direccionResidencia, direccionCorrespondencia, recibirNotificaciones, esActivo);
//	}
//	
	
	
	
	

}
