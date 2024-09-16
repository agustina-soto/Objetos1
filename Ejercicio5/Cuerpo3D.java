package ar.edu.unlp.info.oo1.ejercicio5;

public class Cuerpo3D {
	private double altura;
	private Figura caraBasal;

	public double getAltura() {
		return this.altura;
	}
	
	public void setAltura(double unaAltura) {
		this.altura = unaAltura;
	}
	
	public void setCaraBasal(Figura unaCaraBasal) {
		this.caraBasal = unaCaraBasal;
	}
	
	public double getVolumen() {
		return (this.caraBasal.getArea() * this.altura);
	}
	
	public double getSuperficieExterior() {
		return (this.caraBasal.getArea() * 2 + 
				  this.caraBasal.getPerimetro() * this.altura);
	}
}
