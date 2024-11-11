package ar.edu.unlp.info.oo1.ejercicio19_ServicioEnviosPaquetes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
	protected String nombre;
	protected String direccion;
	protected List<Envio> envios;

	public Cliente(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.envios = new ArrayList<Envio>();
	}
	
	public void agregarEnvio(Envio envio) {
		this.envios.add(envio);
	}
	
	public double getMontoAPagar(LocalDate fechaInicio, LocalDate fechaFin) {
		return this.envios.stream()
				.filter(envio -> envio.estaIncluidoEnElPeriodo(fechaInicio, fechaFin)) // Filtra los envíos que no están en fecha
				.mapToDouble(envio -> envio.calcularMontoEnvio())
				.sum();
	}
}
