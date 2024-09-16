package ar.edu.unlp.info.oo1.ejercicio3;

public class Item {
	private String detalle;
	private int cantidad;
	private double costoUnitario;

	public Item(String unDetalle, int unaCantidad, double unCostoUnitario) {
		this.detalle = unDetalle;
		this.cantidad = unaCantidad;
		this.costoUnitario = unCostoUnitario;
	}
	
	public String getDetalle() {
		return this.detalle;
	}
	
	public void setDetalle(String unDetalle) {
		this.detalle = unDetalle;
	}
	
	public int getCantidad() {
		return this.cantidad;
	}
	
	public void setCantidad(int unaCantidad) {
		this.cantidad = unaCantidad;
	}
	
	public double getCostoUnitario() {
		return this.costoUnitario;
	}
	
	public void setCostoUnitario(double unCostoUnitario) {
		this.costoUnitario = unCostoUnitario;
	}
	
	public double costo() {
		return this.costoUnitario*this.cantidad;
	}
}
