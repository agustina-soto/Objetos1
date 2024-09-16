package ar.edu.unlp.info.oo1.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Balanza {
	private List<Producto> productos;
	// Balanza deberia tener tambien la cantidad de prodcutos y el peso y precio total??
	
	public Balanza() {
		this.ponerEnCero();
	}

	public void ponerEnCero() {
		this.productos = new ArrayList<Producto>();
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
