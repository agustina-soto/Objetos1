package ar.edu.unlp.info.oo1.ejercicio19_ServicioEnviosPaquetes;

import java.time.LocalDate;

public class PersonaFisica extends Cliente {
	private String DNI;
	
	public PersonaFisica(String DNI, String nombre, String direccion) {
		super(nombre, direccion);
		this.DNI = DNI;
	}

	public double getMontoAPagar(LocalDate fechaInicio, LocalDate fechaFin) {
		return super.getMontoAPagar(fechaInicio, fechaFin) * 0.1; // Se le resta el 10%
	}
}
