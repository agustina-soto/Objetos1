package ar.edu.unlp.info.oo1.ejercicio24_PoolCar;

import java.time.LocalDate;

public class Conductor extends Usuario {
	private Vehiculo vehiculo;

	public Conductor(String n, double s, Vehiculo v) {
		super(n, s);
		this.vehiculo = v;
	}

	public void cargarSaldo(double monto) {
		// Si el auto tiene menos de 5 años, se le cobra el 1%, sino el 10%
		this.saldo += (this.vehiculo.antiguedad() < 5) ? monto*0.99 : monto*0.9;
	}

	public Viaje darDeAltaViaje(String origen, String destino, double costo, LocalDate fecha) {
		return new Viaje(origen, destino, costo, this.vehiculo, fecha);
	}

	public void procesarViaje(double monto) {
		// se le bonifica el 0.1% del valor del vehiculo
		monto -= this.vehiculo.get1PercentValorMercado();
		super.procesarViaje(monto);
	}
	
}
