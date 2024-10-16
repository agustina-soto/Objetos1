package ar.edu.unlp.info.oo1.ejercicio13_ClienteDeCorreo;

import java.util.ArrayList;
import java.util.List;

public class ClienteDeCorreo {
	private Carpeta inbox;
	private List<Carpeta> carpetas;

	public ClienteDeCorreo() {
		this.inbox = new Carpeta("inbox");
		this.carpetas = new ArrayList<Carpeta>();
	}

	public Carpeta getInbox() {
		return this.inbox;
	}

	public List<Carpeta> getCarpetas(){
		return this.carpetas;
	}

	public void agregarCarpeta(Carpeta carpeta) {
		this.carpetas.add(carpeta);
	}

	
	/*
	 * Almacena en el inbox (una de las carpetas) el email que recibe como parámetro.
	 */
	public void recibir(Email email) {
		this.inbox.agregarEmail(email);
	}


	/*
	 * Retorna el primer email en el Cliente de Correo cuyo título o cuerpo contienen
	 * el texto indicado como parámetro. Busca en todas las carpetas.
	 */
	public Email buscar(String texto) {
		Email res = this.inbox.buscarEmail(texto); // Busca el texto en la carpeta inbox
		return ( (res != null) ? res : (this.carpetas.stream() // Hace un stream de la lista de carpetas
										.map(c -> c.buscarEmail(texto)) // Aplica la funcion a todo el stream de carpetas
										.filter(email -> email != null)) // Se queda con los email distintos a null
										.findFirst().orElse(null)
				);
	}


	/*
	 * Retorna la suma del espacio ocupado por todos los emails de todas las carpetas.
	 */
	public int espacioOcupado() {
		return this.carpetas.stream()
				.mapToInt(carpeta -> carpeta.tamañoCarpeta())
				.sum();
	}

}