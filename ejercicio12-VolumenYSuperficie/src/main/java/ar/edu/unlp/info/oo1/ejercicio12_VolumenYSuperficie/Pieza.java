package ar.edu.unlp.info.oo1.ejercicio12_VolumenYSuperficie;

public abstract class Pieza {
	private String material;
	private String color;
	
	
	public String getMaterial() {
		return this.material;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public abstract double getVolumen(String nombreDeMaterial);
	
	public abstract double getSuperficie(String unNombreDeColor);
}
