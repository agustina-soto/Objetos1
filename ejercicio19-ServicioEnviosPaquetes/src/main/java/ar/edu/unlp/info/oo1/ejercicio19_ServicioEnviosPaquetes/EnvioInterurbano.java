package ar.edu.unlp.info.oo1.ejercicio19_ServicioEnviosPaquetes;

import java.time.LocalDate;

public class EnvioInterurbano extends Envio {
	private double distancia_km;
	
	public EnvioInterurbano(double distancia_km, LocalDate fecha, String direccionOrigen, String direccionDestino, double peso, Cliente cliente) {
		super(fecha, direccionOrigen, direccionDestino, peso, cliente);
		this.distancia_km = distancia_km;
	}


	/*
	 * Los envíos interurbanos tienen un costo que depende de la distancia entre el origen y el destino
	(utilice $20 para menos de 100 km por cada gramo de peso, $25 para distancias entre 100 km y
	500 km por gramo de peso, y $30 para distancias de más de 500 km por gramo de peso).
	 */
	public double calcularMontoEnvio() {
		double monto = this.distancia_km < 100 ? 20 : this.distancia_km < 500 ? 25 : 30;
		return this.peso * monto;
	}

	public double getDistancia() {
		return this.distancia_km;
	}

	public void setDistancia(double unaDistancia) {
		this.distancia_km = unaDistancia;
	}
}
