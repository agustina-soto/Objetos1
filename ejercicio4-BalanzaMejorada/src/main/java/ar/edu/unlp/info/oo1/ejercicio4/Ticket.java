package ar.edu.unlp.info.oo1.ejercicio4;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ticket {
	private LocalDate fecha;
	private List<Producto> productos;

	public Ticket(List<Producto> productos) {
		this.fecha = LocalDate.now();
		this.productos = new ArrayList<Producto>(productos);
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public void setFecha(LocalDate unaFecha) {
		this.fecha = unaFecha;
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
	
	public double impuesto() {
		return (getPesoTotal() * 0.21);
	}
	
	// Retorna todos los productos del ticket
		public List<Producto> getProductos() {
			return this.productos;
		}
}
