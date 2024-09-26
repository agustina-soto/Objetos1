package ar.edu.unlp.info.oo1.ejercicio9_CuentaGanchos;

public class CuentaCorriente extends Cuenta {
	private double limiteDescubierto;
	
	public CuentaCorriente() {
		this.limiteDescubierto = 0;
	}

	public double getDescubierto() {
		return this.limiteDescubierto;
	}

	public void setDescubierto(double descubierto) {
		this.limiteDescubierto = descubierto;
	}

	protected boolean puedeExtraer(double monto) {
		return (super.getSaldo() + this.limiteDescubierto >= monto); // Si el monto a restar es igual o menor al limite+saldo devuelve true 
	}
}
