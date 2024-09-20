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
	public boolean tienePadre() {
		return this.padre != null;
	}

	public Mamifero getPadre() {
		return this.padre;
	}
	
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}

	public boolean tieneMadre() {
		return this.madre != null;
	}

	public Mamifero getMadre() {
		return this.madre;
	}
	
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}

	// ABUELOS -------------------------- 
	public Mamifero getAbueloMaterno() {
		if(this.tieneMadre()) {
			return this.madre.getPadre();
		}
		else return null;
	}
	
	public Mamifero getAbuelaMaterna() {
		if(this.tieneMadre()) {
			return this.madre.getMadre();
		}
		else return null;
	}
	
	
	public Mamifero getAbueloPaterno() {
		if(this.tienePadre()) {
			return this.padre.getPadre();			
		}
		else return null;
	}
	
	public Mamifero getAbuelaPaterna() {
		if(this.tienePadre()) {
			return this.padre.getMadre();			
		}
		else return null;
	}
	
	// ANCESTROS  --------------------------

	
	// Método principal que busca si un mamífero tiene como ancestro a otro
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
	    // Si soy el mismo mamífero, devuelve false
	    if (this.equals(unMamifero)) {
	        return false; // No puedo ser mi propio ancestro
	    }
	    
	    // Llama al método auxiliar para verificar en padres
	    return tieneComoAncestroA(this.getPadre(), unMamifero) || tieneComoAncestroA(this.getMadre(), unMamifero);
	}

	// Método auxiliar recursivo
	private boolean tieneComoAncestroA(Mamifero actual, Mamifero unMamifero) {
	    // Si el actual es null, devuelve false (no hay ancestro)
	    if (actual == null) {
	        return false;
	    }

	    // Verifica si el actual es el mamífero buscado
	    if (actual.equals(unMamifero)) {
	        return true; // Encontrado
	    }

	    // Busca recursivamente en los padres
	    return (actual.tienePadre() && tieneComoAncestroA(actual.getPadre(), unMamifero)) ||
	           (actual.tieneMadre() && tieneComoAncestroA(actual.getMadre(), unMamifero));
	}

	
	
	
	/*
	
	OPCION 2: ME TIRA 2 FAILURES, NO ENTIENDO POR QUÉ. CONSULTAR QUÉ ES LO QUE FALLA
	
	
	public boolean tieneComoAncestroA(Mamifero unMamifero) {		
		// Si this es el Mamifero buscado, devuelve false (no puedo ser mi propio ancestro)
		if (this.equals(unMamifero)) {
			return false;
		}
		// Si this no es el Mamifero buscado,
		// Llamo al método auxiliar recursivo para verificar en los padres
	    return this.tienePadre() && this.getPadre().tieneComoAncestroA(unMamifero) ||
	            this.tieneMadre() && this.getMadre().tieneComoAncestroA(unMamifero);
	}
	
	// Método auxiliar recursivo
	public boolean tieneComoAncestroA(Mamifero actual, Mamifero unMamifero) {
	    // Verifica si el actual es el mismo que el traído por parámetro
	    if (actual.equals(unMamifero)) {
	        return true;
	    }

	    // Si no lo es, busca recursivamente en sus padres
	    boolean encontradoEnPadre = false;
	    boolean encontradoEnMadre = false;

	    if (actual.tienePadre()) {
	        encontradoEnPadre = actual.tieneComoAncestroA(actual.getPadre(), unMamifero);
	    }

	    if (!encontradoEnPadre && actual.tieneMadre()) {
	        encontradoEnMadre = actual.tieneComoAncestroA(actual.getMadre(), unMamifero);
	    }

	    return encontradoEnPadre || encontradoEnMadre;
	}

*/

}