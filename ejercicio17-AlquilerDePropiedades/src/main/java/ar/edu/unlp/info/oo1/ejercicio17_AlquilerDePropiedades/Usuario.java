package ar.edu.unlp.info.oo1.ejercicio17_AlquilerDePropiedades;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nombre;
	private String direccion;
	private int DNI;
	private List<Reserva> reservas;
	
	public Usuario(String nombre, String direccion, int DNI) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.DNI = DNI;
		this.reservas = new ArrayList<Reserva>();
	}

	public boolean realizarReserva(DateLapse periodo, Propiedad propiedad) {
		if (propiedad.consultarDisponibilidad(periodo)) { // Revisa si la propiedad esta disponible durante el período
			Reserva r = new Reserva(periodo, propiedad, this);
			propiedad.crearReserva(r);
			this.reservas.add(r);
		}
		return false;
	}

	public void cancelarReserva(Reserva reserva) {
		if(!reserva.estaEnCurso(reserva)) {
			this.reservas.remove(reserva);
			//...propiedad?
		}
	}
}