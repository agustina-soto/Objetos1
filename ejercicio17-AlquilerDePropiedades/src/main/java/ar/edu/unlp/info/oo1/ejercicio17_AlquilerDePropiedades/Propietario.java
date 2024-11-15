package ar.edu.unlp.info.oo1.ejercicio17_AlquilerDePropiedades;

public class Propietario extends Usuario {

	public Propietario(String nombre, String direccion, int DNI) {
		super(nombre, direccion, DNI);
	}
	
	public double calcularIngresos(DateLapse periodo, double precio) {
		return periodo.sizeInDays() * precio;
	}

}
