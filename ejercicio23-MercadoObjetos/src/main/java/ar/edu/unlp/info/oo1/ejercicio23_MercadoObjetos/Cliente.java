package ar.edu.unlp.info.oo1.ejercicio23_MercadoObjetos;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona {
	private List<Pedido> pedidos;
	
	public Cliente(String nom, String dir) {
		super(nom, dir);
		this.pedidos = new ArrayList<Pedido>();
	}
	
	public Pedido crearPedido(FormaPago fp, FormaEnvio fe, Producto p, int cantPedida) {
		if(p.hayStock(cantPedida)) {
			p.disminuirStock(cantPedida);
			Pedido nuevoP = new Pedido(this, fp, fe, p, cantPedida);
			this.pedidos.add(nuevoP);
			return nuevoP;
		}
		return null;
	}
	
	public int cantProductosPedidosDeCategoria(String categoria) {
		return this.pedidos.stream()
				.mapToInt(p -> p.coincideCategoria(categoria))
				.sum();
	}
}
