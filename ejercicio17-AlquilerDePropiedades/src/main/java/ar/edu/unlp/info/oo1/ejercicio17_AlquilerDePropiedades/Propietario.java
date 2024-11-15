package ar.edu.unlp.info.oo1.ejercicio17_AlquilerDePropiedades;

import java.util.ArrayList;
import java.util.List;

public class Propietario extends Usuario {
	private List<Propiedad> propiedades;

	public Propietario(String nombre, String direccion, int DNI) {
		super(nombre, direccion, DNI);
		this.propiedades = new ArrayList<Propiedad>();
	}
	
	public double calcularIngresos(DateLapse periodo, double precio) {
		return periodo.sizeInDays() * precio;
	}
	
	public void agregarPropiedad(Propiedad p) {
		this.propiedades.add(p);
	}

}
