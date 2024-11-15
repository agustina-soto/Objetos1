package ar.edu.unlp.info.oo1.ejercicio24_PoolCar;

import java.time.LocalDate;

public class Vehiculo {
	private Conductor conductor;
	private String descripcion;
	private int capacidad; // contando al conductor
	private LocalDate fecha_fabricacion;
	private double valor_mercado;
	
	public Vehiculo(Conductor cond, String d, int cap, LocalDate f, double vm) {
		this.conductor = cond;
		this.descripcion = d;
		this.capacidad = cap;
		this.fecha_fabricacion = f;
		this.valor_mercado = vm;
	}

	public int antiguedad() {
		return (LocalDate.now().getYear() - this.fecha_fabricacion.getYear());
	}
	
	public Conductor getconductor() {
		return this.conductor;
	}
	
	public boolean hayEspacioVehiculo(int cantPasajeros) {
		return this.capacidad > cantPasajeros + 1;
	}
	
	public double get1PercentValorMercado() {
		return this.valor_mercado*0.9;
	}
}
