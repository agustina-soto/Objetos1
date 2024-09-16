package ar.edu.unlp.info.oo1.ejercicio5;

public class Circulo implements Figura {
	private double radio;
	private double diametro;

	public double getRadio() {
		return this.radio;
	}
	
	public void setRadio(double unRadio) {
		this.radio = unRadio;
		this.diametro = this.radio * 2;
	}
	
	public double getDiametro() {
		return this.diametro;
	}
	
	public void setDiametro(double unDiametro) {
		this.diametro = unDiametro;
		this.radio = this.diametro / 2;
	}

	public double getPerimetro() {
		return (Math.PI*this.diametro);
	}
	
	public double getArea() {
		return (Math.PI*Math.pow(radio, 2));
	}

}
