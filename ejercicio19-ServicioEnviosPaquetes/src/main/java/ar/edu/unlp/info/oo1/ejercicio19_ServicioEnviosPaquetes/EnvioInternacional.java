package ar.edu.unlp.info.oo1.ejercicio19_ServicioEnviosPaquetes;

import java.time.LocalDate;

public class EnvioInternacional extends Envio {
	public EnvioInternacional( LocalDate fecha, String direccionOrigen, String direccionDestino, double peso, Cliente cliente) {
		super(fecha, direccionOrigen, direccionDestino, peso, cliente);
	}


	/*
	 * Los envíos internacionales tienen un costo que depende del país destino y del peso del paquete.
	 * Por ahora, utilice $5000 para cualquier destino y $10 por gramo de peso para envíos de hasta
	 * 1 kg y $12 para envíos de más de 1 kg.
	 */
	public double calcularMontoEnvio(LocalDate fechaInicio, LocalDate fechaFin) {
		double costo_por_gramo = this.peso <= 1000 ? 10 : 12;
		return 5000 * costo_por_gramo * this.peso;
	}
}
