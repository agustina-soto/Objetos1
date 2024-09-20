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
	public boolean tieneComoAncestroA(Mamifero actual, Mamifero unMamifero) {
	    // Verifica que el actual no es null
		if(actual == null) {
			return false;
		}
		else {		
			// Verifica si el mamifero actual es el mismo que el traido por parametro
		    if (this.equals(unMamifero)) {
		        return true;
		    }
	
		    // Si el actual tiene padre distinto de null, llamo recursivamente
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
	
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
	    if (this.equals(unMamifero)) {
	        return false;
	    }
	    else return (tieneComoAncestroA(this.getPadre(), unMamifero)) || (tieneComoAncestroA(this.getMadre(), unMamifero));
	    // como hago para no chequear el otro lado de la familia si ya encontre al ancestro?
	}
	
	
/// metodo ancestros arreglado :)

	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		boolean tiene = false;
		
		if (this.equals(unMamifero)) {
	        return tiene = true;
	    }
	    else {
	    	if(this.tienePadre()) {
	    		tiene = this.tieneComoAncestroA(this.getPadre(), unMamifero);
	    	}
		    if(!tiene && this.tieneMadre()) {
	    		tiene = this.tieneComoAncestroA(this.getMadre(), unMamifero);
		    }
	    }
		return tiene;
	}







	
	/*	 lu
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
	    //pregunto al padre si es el ancestro, o si tiene ese ancestro
	    if (this.getPadre() != null && (this.getPadre().equals(unMamifero) || 
	    		this.getPadre().tieneComoAncestroA(unMamifero))) {
	        return true;
	    }
	    //pregunto a mi madre si es el ancestro, o si tiene ese ancestro
	    if (this.getMadre() != null && (this.getMadre().equals(unMamifero) || 
	    		this.getMadre().tieneComoAncestroA(unMamifero))) {
	        return true;
	    }
	    //retorno false en caso de que no se haya podido ingresar en los ifs
	    return false;
	}
	 */
}
