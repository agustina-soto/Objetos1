package ar.edu.unlp.info.oo1.ejercicio12_VolumenYSuperficie;

public class PrismaRectangular extends Pieza {
	private int altura;
	private int ladoMayor;
	private int ladoMenor;

	public PrismaRectangular(String material, String color, int altura, int ladoMayor, int ladoMenor) {
		super(material, color);
		this.altura = altura;
		this.ladoMayor = ladoMayor;
		this.ladoMenor = ladoMenor;
	}

	public int getAltura() {
		return this.altura;
	}
	
	public int getLadoMayor() {
		return this.ladoMayor;
	}

	public int getLadoMenor() {
		return this.ladoMenor;
	}
	
	public double getVolumen() {
		return (this.ladoMayor * this.ladoMenor * this.altura);
	}

	public double getSuperficie() {	
		return 2*(this.ladoMayor * this.ladoMenor + this.ladoMayor * this.altura + this.ladoMenor * this.altura);
	}

}
