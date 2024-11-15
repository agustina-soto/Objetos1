package ar.edu.unlp.info.oo1.ejercicio24_PoolCar;

public abstract class Usuario {
	protected String nombre;
	protected double saldo;
	
	public Usuario(String n, double s) {
		this.nombre = n;
		this.saldo = s;
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public abstract void cargarSaldo(double monto);

	public abstract void procesarViaje(double costo);
}
