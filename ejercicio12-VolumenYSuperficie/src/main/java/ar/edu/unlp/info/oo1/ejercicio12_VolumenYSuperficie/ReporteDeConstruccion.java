package ar.edu.unlp.info.oo1.ejercicio12_VolumenYSuperficie;

import java.util.List;
import java.util.ArrayList;

public class ReporteDeConstruccion {
	private List<Pieza> piezas;

	public ReporteDeConstruccion() {
		this.piezas = new ArrayList<Pieza>();
	}

	public List<Pieza> getPiezas(){
		return this.piezas;
	}

	public void agregarPieza(Pieza p) {
		this.piezas.add(p);
	}

	public double getVolumenDeMaterial(String material) {
		return this.piezas.stream() // Convierte la lista en stream
				.filter(p -> p.getMaterial().equals(material)) // Stream con todas las piezas del material pedido
				.mapToDouble(p -> p.getVolumen(material)) // Obtiene el volumen de cada pieza filtrada
				.sum();
	}

	public double getSuperficieDeColor(String color) {
		return this.piezas.stream() // Convierte la lista en stream
				.filter(p -> p.getColor().equals(color)) // Stream con todas las piezas del color pedido
				.mapToDouble(p -> p.getSuperficie(color)) // Obtiene la superficie de cada pieza filtrada
				.sum();
	}

}
