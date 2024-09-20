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
	public void tieneComoAncestroA(Mamifero actual, Mamifero unMamifero, boolean found) {	
		// Verifica si el mamifero actual es el mismo que el traido por parametro
	    if (this.equals(unMamifero)) {
	        found = true;
	    }

	    // Si el actual tiene padre distinto de null, llamo recursivamente con esa rama
	    if (this.tienePadre()) {
	    	this.padre.tieneComoAncestroA(this.padre, unMamifero, found);
	    }

	    // Si el actual tiene madre distinto de null, llamo recursivamente con esa rama
	    if (this.tieneMadre()) {
	    	this.madre.tieneComoAncestroA(this.madre, unMamifero, found);
	    }
	}
		
	

	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		boolean found = false;
		
		// Si this no es el mamifero buscado, busco en sus antecesores
		if (!this.equals(unMamifero)) {
	    	if(this.tienePadre()) {
	    		this.tieneComoAncestroA(this.getPadre(), unMamifero, found);
	    	}
		    if(!found && this.tieneMadre()) {
	    		this.tieneComoAncestroA(this.getMadre(), unMamifero, found);
		    }
	    } // Si this es el mamifero buscado, tiene queda en false
		return found;
	}
}
