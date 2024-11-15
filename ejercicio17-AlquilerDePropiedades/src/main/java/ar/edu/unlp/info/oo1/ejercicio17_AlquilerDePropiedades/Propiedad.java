package ar.edu.unlp.info.oo1.ejercicio17_AlquilerDePropiedades;

import java.util.ArrayList;
import java.util.List;

public class Propiedad {

	private String direccion;
	private String nombreDescriptivo;
	private double costoPorNoche;
	private List<Reserva> reservas;
	
	public Propiedad(String direccion, String nombre, double costoPorNoche) {
		this.direccion = direccion;
		this.nombreDescriptivo = nombre;
		this.costoPorNoche = costoPorNoche;
		this.reservas =  new ArrayList<Reserva>();
	}
	
	
	/*
	 * Consultar la disponibilidad de una propiedad en un período específico: dada
una propiedad, una fecha inicial y una fecha final, se debe determinar si la propiedad
está disponible el período indicado.

	 */
	public boolean consultarDisponibilidad(DateLapse dl) {
		return true;
	}
	
	public boolean crearReserva() {
		return true;
	}
	
	public void cancelarReserva() {
		
	}
}
