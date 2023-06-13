package project.fintech1.businesslogic;
//clase principal
public class persona {
	//atributos de la clase principal
	private String cedula;
	private String nombre;
	private String apellidos;
	private String fechaNacimiento;
	private String correoElectronico;
	private String direccionResidencia;
	private String direccionCorrespondencia;
	private Boolean recibirNotificaciones;


	public String getNombre() {
		return nombre;
	}

	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public String getApellidos() {
		return apellidos;
	}

	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	
	public String getCorreoElectronico() {
		return correoElectronico;
	}

	
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getCedula() {
		return cedula;
	}

	
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	
	public String getDireccionResidencia() {
		return direccionResidencia;
	}

	
	public void setDireccionResidencia(String direccionResidencia) {
		this.direccionResidencia = direccionResidencia;
	}

	
	public String getDireccionCorrespondencia() {
		return direccionCorrespondencia;
	}

	
	public void setDireccionCorrespondencia(String direccionCorrespondencia) {
		this.direccionCorrespondencia = direccionCorrespondencia;
	}

	public Boolean getRecibirNotificaciones() {
		return recibirNotificaciones;
	}

	public void setRecibirNotificaciones(Boolean recibirNotificaciones) {
		this.recibirNotificaciones = recibirNotificaciones;
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
	 */
        //metodo costructor de la clase principal persona
	public persona(String nombre, String apellidos, String fechaNacimiento, String correoElectronico, String cedula,
			String direccionResidencia, String direccionCorrespondencia, Boolean recibirNotificaciones) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.correoElectronico = correoElectronico;
		this.cedula = cedula;
		this.direccionResidencia = direccionResidencia;
		this.direccionCorrespondencia = direccionCorrespondencia;
		this.recibirNotificaciones = recibirNotificaciones;
	}
        
         //metodo costructor de la clase principal persona
	public persona(String nombre, String apellidos, String fechaNacimiento, String correoElectronico, String cedula,
			String direccionResidencia, String direccionCorrespondencia) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.correoElectronico = correoElectronico;
		this.cedula = cedula;
		this.direccionResidencia = direccionResidencia;
		this.direccionCorrespondencia = direccionCorrespondencia;
                this.recibirNotificaciones = false;
        }	
        


}
