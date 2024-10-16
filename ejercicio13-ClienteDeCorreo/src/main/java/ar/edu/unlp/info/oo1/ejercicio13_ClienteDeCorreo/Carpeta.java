package ar.edu.unlp.info.oo1.ejercicio13_ClienteDeCorreo;

import java.util.ArrayList;
import java.util.List;

public class Carpeta {
	private String nombre;
	private List<Email> emails;
	
	public Carpeta(String nombre) {
		this.nombre = nombre;
		this.emails = new ArrayList<Email>();
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public List<Email> getEmails() {
		return this.emails;
	}

	public void agregarEmail(Email email) {
		this.emails.add(email);
	}


	/*
	 *  Mueve un email desde una carpeta de origen a una carpeta destino
	 *  (asuma que el email está en la carpeta origen cuando se recibe este mensaje).
	 */
	public void mover(Email email, Carpeta destino) { // deberia verificar que destino sea != null no?
		this.emails.remove(email); // Borra el email de la carpeta actual
		destino.agregarEmail(email); // Copia el email en la carpeta destino
	}


	/*
	 * Devuelve el primer email de la lista de emails que contenga el texto recibido (o null si no lo hay).
	 */
	public Email buscarEmail(String texto) {
		return (this.emails.stream()
				.filter(e -> e.contieneTexto(texto))
				.findFirst().orElse(null));
	}


	/*
	 * Devuelve la suma del espacio ocupado por todos los emails de la carpeta
	 */
	public int tamañoCarpeta() {
		return this.emails.stream()
				.mapToInt(email -> email.tamañoEmail())
				.sum();
	}
}
