package ar.edu.unlp.info.oo1.ejercicio19_ServicioEnviosPaquetes;

public class ClienteCorporativo extends Cliente {
	private String CUIT;
	
	public ClienteCorporativo(String CUIT, String nombre, String direccion) {
		super(nombre, direccion);
		this.CUIT = CUIT;
	}
}
