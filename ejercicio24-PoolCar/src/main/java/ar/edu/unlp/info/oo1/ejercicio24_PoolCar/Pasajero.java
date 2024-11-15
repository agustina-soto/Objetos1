package ar.edu.unlp.info.oo1.ejercicio24_PoolCar;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pasajero extends Usuario {
	private LocalDate fecha_registro;
	private List<Viaje> viajes;
	
	public Pasajero(String nombre, double saldo, LocalDate fr) {
		super(nombre, saldo);
		this.fecha_registro = fr;
		this.viajes = new ArrayList<Viaje>();
	}

	
	/*
	 * Se cobra una comisión del 10% solo si no realizó ningún viaje los últimos 30 días.
	 */
	public void cargarSaldo(double monto) {
		Viaje viajoFrecuente = this.viajes.stream()
									.filter(v -> v.viajeHace30Dias(LocalDate.now()))
									.findFirst().orElse(null);
		if (viajoFrecuente == null) {
			monto = monto*0.9;
		}
		this.saldo += monto;
	}


	public void registrarPasajeroParaViaje(Viaje viaje) {
		 if ( this.fecha_registro.isEqual(LocalDate.now().minusDays(2)) || this.fecha_registro.isBefore(LocalDate.now().minusDays(2))
			&& (this.saldo > 0) && (viaje.hayEspacioViaje()) ) {
			 this.viajes.add(viaje);
			 viaje.agregarPasajero(this);
		 }
	}


	public void procesarViaje(double costo) {
		// si viajó en el pasado descontar 500$
		if (!this.viajes.isEmpty()) {
			costo -= 500;
		}
		this.saldo -= costo;
	}

}
