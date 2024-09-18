package ar.edu.unlp.info.oo1.ejercicio4;
import java.util.ArrayList;
import java.util.List;

public class Balanza {
	private List<Producto> productos;
	
	public Balanza() {
		this.productos = new ArrayList<Producto>();
		this.ponerEnCero();
	}

	public int getCantidadDeProductos() {
		return this.productos.size();
	}
	
	public double getPrecioTotal() {
		return this.productos.stream()
				.mapToDouble(prod -> prod.getPrecio())
				.sum();
	}
	
	public double getPesoTotal() {
		return this.productos.stream()
				.mapToDouble(prod -> prod.getPeso())
				.sum();
	}

	public void ponerEnCero() {
		this.productos.clear();
	}
	
	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}
	
	public Ticket emitirTicket() {
		return new Ticket(this.productos);
	}
	
	// Retorna todos los productos ingresados a la balanza -> desde la última vez que se puso en 0
	public List<Producto> getProductos() {
		return this.productos;
	}
	
	
}
