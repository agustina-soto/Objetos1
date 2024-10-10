package ar.edu.unlp.info.oo1.ejercicio11_Inversor;

import java.util.ArrayList;
import java.util.List;

public class Inversor {
	private String nombre;
	List<Inversion> inversiones;

	public Inversor() {
		this.inversiones = new ArrayList<Inversion>();
	}
	
	public Inversor(String nombre) {
		this.nombre = nombre;
		this.inversiones = new ArrayList<Inversion>();
	}

	public String getNombre() {
		return this.nombre;
	}

	public List<Inversion> getInversiones(){
		return this.inversiones;
	}

	public double valorActual() {
		return (this.inversiones.stream()
										.mapToDouble(inv -> inv.valorActual())
										.sum());
	}

	public void agregarInversion(Inversion inv) {
		this.inversiones.add(inv);
		
	}
}
