package ar.edu.unlp.info.oo1.ejercicio15_DistribuidoraElectrica;

import java.time.LocalDate;

public class Factura {
	private Usuario usuario;
	private LocalDate fecha_emision;
	private double bonificacion;
	private double monto_final;

	public Factura(Usuario usuario, double bonificacion, double monto) {
		this.usuario = usuario;
		this.fecha_emision = LocalDate.now();
		this.bonificacion = bonificacion;
		this.monto_final = monto - bonificacion;
	}

	public String getUsuario() {
		return "Nombre de usuario: " + this.usuario.getNombre() + ", domicilio: " + this.usuario.getDomicilio();
	}
	
	public LocalDate getFechaEmision() {
		return this.fecha_emision;
	}
	
	public double getBonificacio() {
		return this.bonificacion;
	}

	public double getMontoFinal() {
		return this.monto_final;
	}

	@Override
	public String toString() {
		return "Factura [fecha = " + this.fecha_emision + ", montoFinal = " + this.monto_final + ", descuentoAplicado = "
				+ this.bonificacion + "]";
	}
}
