package ar.edu.unlp.info.oo1.ejercicio23_MercadoObjetos;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Persona {
	private List<Producto> productos;
	
	public Vendedor(String nom, String dir) {
		super(nom, dir);
		this.productos = new ArrayList<Producto>();
	}
}
