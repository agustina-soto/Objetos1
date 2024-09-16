package ar.edu.unlp.info.oo1.ejercicio4;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ticket {
	private LocalDate fecha;
	private int cantidadDeproductos;
	private double precioTotal;
	private double pesoTotal;
	private List<Producto> productos;

	public Ticket(List<Producto> productos) {
		this.fecha = LocalDate.now();
		this.cantidadDeproductos = productos.size(); // size: posiciones + 1 
		this.precioTotal = productos.stream().mapToDouble(prod -> prod.getPrecio()).sum();
		this.pesoTotal = productos.stream().mapToDouble(prod -> prod.getPeso()).sum();
		this.productos = new ArrayList<Producto>(productos);
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public void setFecha(LocalDate unaFecha) {
		this.fecha = unaFecha;
	}

	public int getCantidadDeProductos() {
		return this.cantidadDeproductos;
	}
	
	public void setCantidadDeProductos(int unaCantidad) {
		this.cantidadDeproductos = unaCantidad;
	}
	
	public double getPrecioTotal() {
		return this.precioTotal;
	}
	
	public void setPrecioTotal(double unPrecioTotal) {
		this.precioTotal = unPrecioTotal;
	}
	
	public double getPesoTotal() {
		return this.pesoTotal;
	}

	public void getPesoTotal(double unPesoTotal) {
		this.pesoTotal = unPesoTotal;
	}
	
	public double impuesto() {
		return (this.precioTotal*0.21);
	}
}
