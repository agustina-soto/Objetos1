package ar.edu.unlp.info.oo1.ejercicio15_DistribuidoraElectrica;

public class CuadroTarifario {
	private double precioKwh;
	
	public CuadroTarifario(double precioKwh) {
		this.precioKwh = precioKwh;
	}
	
	public double getPrecioKwh() {
		return this.precioKwh;
	}

	public void actualizarPrecioKwh(double precioKwh) {
		this.precioKwh = precioKwh;
	}
}
