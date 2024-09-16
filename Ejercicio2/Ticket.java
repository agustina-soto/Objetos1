package ar.edu.unlp.info.oo1.ejercicio4;
import java.time.LocalDate;

public class Ticket {
	private LocalDate fecha;
	private int cantidadDeproductos;
	private double precioTotal;
	private double pesoTotal;
	
	public Ticket() {
		this.fecha = LocalDate.now();
	}

	public Ticket(int unaCantidadDeProductos, double unPrecioTotal, double unPesoTotal) {
		this.fecha = LocalDate.now();
		this.cantidadDeproductos = unaCantidadDeProductos;
		this.precioTotal = unPrecioTotal;
		this.pesoTotal = unPesoTotal;
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
		return (this.precioTotal*0.21); // esto es lo que me pide devolver??
	}
}
