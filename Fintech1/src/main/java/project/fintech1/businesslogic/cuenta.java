package project.fintech1.businesslogic;
//clase principal cuenta

import java.util.ArrayList;

public class cuenta {
        //atributos de la clase principal
	private String cedula = "";
	private String tipoCuenta = ""; //Ahorros, Corriente, Credito
	private String numeroCuenta = "";
	private float saldo = 0;
	ArrayList<String> listaMovimientos = new ArrayList<String>();
       
        
	public String getNumeroCuenta() {
		return numeroCuenta;
	}


	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}


	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}


	public float getSaldo() {
		return saldo;
	}


	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
        
        
        //metodo constructor de la clase principal cuenta
       public cuenta(String cedula, String tipoCuenta, String numeroCuenta, float saldo) {
		this.cedula = cedula;
		this.tipoCuenta = tipoCuenta;
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}
       
       //movimientos
       public void agregarMovimientos(String mensaje){
           listaMovimientos.add(mensaje);
           
       }

	
      
//	public void consignar() {
//		
//	}
//	
//	public void retirar() {
//		
//	}
//	
//	public void depositar() {
//		
//	}
//	 
//	public void verMovimientos() {
//		
//	}
//	
//	public void cobrarComision() {
//		
//	}
//	
	

}
