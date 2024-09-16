package ar.edu.unlp.info.oo1.ejercicio5;

public class Cuadrado implements Figura {
	private double lado;
	
	public double getLado() {
		return this.lado;
	}
	
	public void setLado(double unLado) {
		this.lado = unLado;
	}
	
	public double getPerimetro() {
		return (this.lado*4);
	}
	
	public double getArea() {
		return this.lado * this.lado;
	}

}
