package ar.edu.unlp.info.oo1.ejercicio13_ClienteDeCorreo;

import java.util.ArrayList;
import java.util.List;

public class Email {
	private String titulo;
	private String cuerpo;
	private List<Archivo> adjuntos;

	public Email(String titulo, String cuerpo) {
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.adjuntos = new ArrayList<Archivo>();
	}

	public String getTitulo() {
		return this.titulo;
	}

	public String getCuerpo() {
		return this.cuerpo;
	}

	public List<Archivo> adjuntos(){
		return this.adjuntos;
	}

	public void agregarAdjunto(Archivo adjunto) {
		this.adjuntos.add(adjunto);
	}


	/*
	 * Devuelve true si el texto enviado como parametro está contenido en el titulo o el cuerpo
	 * del correo actual.
	 */
	public boolean contieneTexto(String texto) {
		return (this.titulo.contains(texto) || this.cuerpo.contains(texto)) ? true : false ;
	}


	/*
	 * Devuelve el tamaño del mail; esto es: la suma del largo del nombre, del largo del cuerpo
	 * y el tamaño de los archivos adjuntos.
	 */
	public int tamañoEmail() {
		return this.titulo.length()
				+ this.cuerpo.length()
				 + this.adjuntos.stream() // Acumula el tamaño de todos los adjuntos
				  .mapToInt(adj -> adj.tamañoArchivo())
				  .sum();
	}
}
