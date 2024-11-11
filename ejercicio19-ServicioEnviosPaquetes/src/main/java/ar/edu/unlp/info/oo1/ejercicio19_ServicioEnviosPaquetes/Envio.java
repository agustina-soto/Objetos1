package ar.edu.unlp.info.oo1.ejercicio19_ServicioEnviosPaquetes;

import java.time.LocalDate;

public abstract class Envio {
	protected LocalDate fecha;
	protected String direccionOrigen;
	protected String direccionDestino;
	protected double peso;
	protected Cliente cliente;

	public Envio(LocalDate fecha, String direccionOrigen, String direccionDestino, double peso, Cliente cliente) {
		this.fecha = fecha;
		this.direccionOrigen = direccionOrigen;
		this.direccionDestino = direccionDestino;
		this.peso = peso;
		this.cliente = cliente;
	}

	public boolean estaIncluidoEnElPeriodo(LocalDate fechaInicio, LocalDate fechaFin) {
		return (this.fecha.isEqual(fechaInicio) || this.fecha.isAfter(fechaInicio) )
				&&
				(this.fecha.isBefore(fechaFin) || this.fecha.isEqual(fechaFin) );
	}

	public abstract double calcularMontoEnvio();

	public double getPeso() {
		return this.peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
}
