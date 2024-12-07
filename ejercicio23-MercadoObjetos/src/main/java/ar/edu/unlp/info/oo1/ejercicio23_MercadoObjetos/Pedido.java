package ar.edu.unlp.info.oo1.ejercicio23_MercadoObjetos;

public class Pedido {
	private FormaPago pago;
	private FormaEnvio envio;
	private Producto producto;
	private int cant_solicitada;
	
	public Pedido(FormaPago p, FormaEnvio e, Producto prod, int cant) {
		this.pago = p;
		this.envio = e;
		this.producto = prod;
		this.cant_solicitada = cant;
	}

	public int coincideCategoria(String categoria) {
		return this.producto.getCategoria().equals(categoria) ? this.cant_solicitada : 0;
	}
	
	// Precio final en base a la forma de pago seleccionada + costo de envío en base a la forma de envío seleccionada
	public double calcularCostoTotal() {
		return this.pago.precioFinal(this.producto.getPrecio() * this.cant_solicitada)
				+
				this.envio.costoEnvio();
	}
}
