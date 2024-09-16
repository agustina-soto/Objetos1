package ar.edu.unlp.info.oo1.ejercicio4;

public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	public Balanza() {
		
	}
	
	public int getCantidadDeProductos() {
		return this.cantidadDeProductos;
	}
	
	public void setCantidadDeProductos(int unaCantidad) {
		this.cantidadDeProductos = unaCantidad;
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
	
	public void setPesoTotal(double unPesoTotal) {
		this.pesoTotal = unPesoTotal;
	}

	public void ponerEnCero() {
		this.cantidadDeProductos = 0;
		this.precioTotal = 0;
		this.pesoTotal = 0;
	}
	
	public void agregarProducto(Producto producto) {
		this.cantidadDeProductos++;
		this.precioTotal += producto.getPrecio();
		this.pesoTotal += producto.getPeso();
	}
	
	public Ticket emitirTicket() {
		return new Ticket(this.cantidadDeProductos, this.precioTotal, this.pesoTotal);
	}
}
