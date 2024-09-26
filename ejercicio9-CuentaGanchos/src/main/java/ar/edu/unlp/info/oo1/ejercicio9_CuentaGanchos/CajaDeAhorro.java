package ar.edu.unlp.info.oo1.ejercicio9_CuentaGanchos;

public class CajaDeAhorro extends Cuenta {
	
	public CajaDeAhorro() {
		
	}
	
	public double getCostoAdicional(double monto) {
		return monto*0.02;
	}
	
	public void depositar(double monto) {
		monto -= getCostoAdicional(monto); // El deposito se recarga con un 2%
		super.depositar(monto);
	}

	public boolean extraer(double monto) {
		monto += this.getCostoAdicional(monto); // La extraccion se recarga con un 2%
		return super.extraer(monto);
	}
	
	public boolean transferirACuenta(double monto, Cuenta cuentaDestino) {
		monto += this.getCostoAdicional(monto); // La transferencia se recarga con un 2%
		return super.transferirACuenta(monto, cuentaDestino);
	}

}
