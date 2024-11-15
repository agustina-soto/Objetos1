package ar.edu.unlp.info.oo1.ejercicio23_MercadoObjetos;

public class Producto {
	private String nombre;
	private String categoria;
	private double precio;
	private int cant_disponibles;
	
	public Producto(String nombre, String categoria, double precio, int cant_disponibles) {
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.cant_disponibles = cant_disponibles;
	}
	
	public boolean hayStock(int cant) {
		return this.cant_disponibles > cant;
	}

	public void disminuirStock(int cant) {
		this.cant_disponibles = this.cant_disponibles - cant;
	}
	
	public String getCategoria() {
		return this.categoria;
	}
	
	public double getPrecio() {
		return this.precio;
	}
}
