package ar.edu.unlp.info.oo1.ejercicio19_ServicioEnviosPaquetes;

import java.time.LocalDate;

public class EnvioLocal extends Envio {
	private boolean entregaRapida;
	
	public EnvioLocal(boolean entregaRapida, LocalDate fecha, String direccionOrigen, String direccionDestino, double peso, Cliente cliente) {
		super(fecha, direccionOrigen, direccionDestino, peso, cliente);
		this.entregaRapida = entregaRapida;
	}

	/*
	 * Los envíos locales tienen un costo fijo de $1000 para las entregas estándar y $500 adicional por entrega rápida .
	 */
	public double calcularMontoEnvio(LocalDate fechaInicio, LocalDate fechaFin) {
		return this.entregaRapida ? 1500 : 1000;
	}
}
