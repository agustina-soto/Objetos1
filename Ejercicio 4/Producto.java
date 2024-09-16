package ar.edu.unlp.info.oo1.ejercicio4;

public class Producto {
	private double peso; // Asumo que es en kilo (1kg, 0.5kg, etc)
	private double precioPorKilo;
	private String descripcion;
	
	public Producto(double unPeso, double unPrecioPorKilo, String unaDescripcion) {
		this.peso = unPeso;
		this.precioPorKilo = unPrecioPorKilo;
		this.descripcion = unaDescripcion;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public void setPeso(double unPeso) {
		this.peso = unPeso;
	}
	
	public double getPrecioPorKilo() {
		return this.precioPorKilo;
	}
	
	public void setPrecioPorKilo(double unPrecioPorKilo) {
		this.precioPorKilo = unPrecioPorKilo;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}
	
	public void setDescripcion(String unaDescripcion) {
		this.descripcion = unaDescripcion;
	}
	
	public double getPrecio() {
		return (this.precioPorKilo*this.peso);
	}
}
