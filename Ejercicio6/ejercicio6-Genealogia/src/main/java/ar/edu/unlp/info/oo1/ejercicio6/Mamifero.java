package ar.edu.unlp.info.oo1.ejercicio6;

import java.time.LocalDate;

public class Mamifero {
	private String id;
	private String especie;
	private LocalDate fechaNac;
	private Mamifero padre = null;
	private Mamifero madre = null;
	
	public Mamifero() {
		
	}
	
	public Mamifero(String id) {
		this.id = id;
	}
	
	// ATRIBUTOS  --------------------------
	public String getIdentificador() {
		return this.id;
	}
	
	public void setIdentificador(String id) {
		this.id = id;
	}
	
	public String getEspecie() {
		return this.especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public LocalDate getFechaNacimiento() {
		return this.fechaNac;
	}
	
	public void setFechaNacimiento(LocalDate fecha) {
		this.fechaNac = fecha;
	}
	
	// PADRES --------------------------
	public boolean tienePadre() { // es necesario?
		return this.padre != null;
	}

	public Mamifero getPadre() {
		return this.padre;
	}
	
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}

	public boolean tieneMadre() { // es necesario?
		return this.madre != null;
	}

	public Mamifero getMadre() {
		return this.madre;
	}
	
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}

	// ABUELOS --------------------------  estan mal
	public Mamifero getAbueloMaterno() {
		return this.madre.getPadre();
	}
	
	public Mamifero getAbuelaMaterna() {
		return this.madre.getMadre();
	}
	
	
	public Mamifero getAbueloPaterno() {
		return this.padre.getPadre();
	}
	
	public Mamifero getAbuelaPaterna() {
		return this.padre.getMadre();
	}
	
	// ANCESTROS  -------------------------- esta mal
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
	    // Verifica si el mamifero actual es el mismo que el traido por parametro
	    if (this.equals(unMamifero)) {
	        return true;
	    }

	    // Verifica por el padre y sus ancestros
	    if (this.padre != null && this.padre.tieneComoAncestroA(unMamifero)) {
	        return true;
	    }

	    // Verifica por la madre y sus ancestros
	    if (this.madre != null && this.madre.tieneComoAncestroA(unMamifero)) {
	        return true;
	    }

	    // El ancestro no existe (esta bien asumir que puede no existir? dado que la conigna no me asegura que exista)
	    return false;
	}
	
}
