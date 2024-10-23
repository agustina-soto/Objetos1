package ar.edu.unlp.info.oo1.ejercicio15_DistribuidoraElectrica;

public class Consumo {
	private double energia_activa;
	private double energia_reactiva;
	private CuadroTarifario tarifa;

	public Consumo(double energia_activa, double energia_reactiva, CuadroTarifario tarifa) {
		this.energia_activa = energia_activa;
		this.energia_reactiva = energia_reactiva;
		this.tarifa = tarifa;
	}

	public double getEnergiaActiva() {
		return this.energia_activa;
	}
	
	public double getEnergiaReactiva() {
		return this.energia_reactiva;
	}
	
	public double calcularCostoConsumo() {
		return this.energia_activa * (this.tarifa.getPrecioKwh());
	}
	
	public double calcularFpe() {
		double aux1 = Math.pow (energia_activa, 2), aux2 = Math.pow (energia_reactiva, 2);
		return this.energia_activa / (Math.sqrt (aux1 + aux2) );
	}
	
	public boolean aplicaBonificacion() {
		return this.calcularFpe() > 0.8;
	}
	
	/*
	 * Retorna la bonificacion que debe descontarse al precio de consumo (segun si aplica para una bonificacion o no)
	 */
	public double bonificacion() {
		return this.aplicaBonificacion() ? (this.calcularCostoConsumo() * 0.1) : 0;
	}
}
