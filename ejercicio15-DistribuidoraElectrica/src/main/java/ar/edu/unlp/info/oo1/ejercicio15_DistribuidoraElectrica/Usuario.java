package ar.edu.unlp.info.oo1.ejercicio15_DistribuidoraElectrica;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nombre;
	private String domicilio;
	private List<Consumo> consumos;
	private Factura ultFactura;
	
	public Usuario(String nombre, String domicilio) {
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.consumos = new ArrayList<Consumo>();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getDomicilio() {
		return this.domicilio;
	}

	public Factura getUltFactura() {
		return this.ultFactura;
	}

	public List<Consumo> getConsumos() {
		return this.consumos;
	}

	public void agregarConsumo(Consumo consumo) {
		this.consumos.add(consumo);
	}

	public void emitirFactura() {
		Consumo ultConsumo = this.consumos.getLast(); // Toma el último consumo registrado
		this.ultFactura = new Factura(this, ultConsumo.bonificacion(), ultConsumo.calcularCostoConsumo());
	}

}
