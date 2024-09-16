package ar.edu.unlp.info.oo1.ejercicio3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private List<Item> items;
	
	public Presupuesto(String unCliente) {
		this.fecha = LocalDate.now();
		this.cliente = unCliente;
		this.items = new ArrayList<Item>();
	}

	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public void setFecha(LocalDate unaFecha) {
		this.fecha = unaFecha;
	}
	
	public String getCliente() {
		return this.cliente;
	}
	
	public void setCliente(String unCliente) {
		this.cliente = unCliente;
	}
	
	public void agregarItem(Item unItem) {
		items.add(unItem);
	}
	
	public double calcularTotal() {
		return items.stream().mapToDouble(item -> item.costo()).sum();
	}
}
