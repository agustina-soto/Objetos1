package ar.edu.unlp.info.oo1.ejercicio24_PoolCar;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Viaje {
	private String origen;
	private String destino;
	private double costoTotal; // entre el dueño del vehiculo y los pasajeros
	private Vehiculo vehiculo;
	private LocalDate fecha_viaje;
	private List<Usuario> pasajeros;

	public Viaje(String origen, String destino, double costoTotal, Vehiculo vehiculo, LocalDate fecha_viaje) {
		this.origen = origen;
		this.destino = destino;
		this.costoTotal = costoTotal;
		this.fecha_viaje = fecha_viaje;
		
		this.vehiculo = vehiculo;
		this.pasajeros = new ArrayList<Usuario>();
		this.pasajeros.add(vehiculo.getconductor());
	}


	/*
	 * Devuelve si la fecha recibida es igual o anterior a los 30 dias
	 */
	public boolean viajeHace30Dias(LocalDate fecha) {
		return fecha.isEqual(LocalDate.now().minusDays(30)) || fecha.isAfter(LocalDate.now().minusDays(30));
	}

	
	public boolean hayEspacioViaje() {
		return this.vehiculo.hayEspacioVehiculo(this.pasajeros.size()); 
	}
	
	
	public void agregarPasajero(Pasajero p) {
		this.pasajeros.add(p);
	}
}
