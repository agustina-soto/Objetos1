package ar.edu.unlp.info.oo1.ejercicio12_VolumenYSuperficie;

public class PrismaRectangular extends Pieza {
	private int altura;
	private int ladoMayor;
	private int ladoMenor;
	
	public int getAltura() {
		return this.altura;
	}
	
	public int getLadoMayor() {
		return this.ladoMayor;
	}

	public int getLadoMenor() {
		return this.ladoMenor;
	}
	
	// Recibe como parámetro un nombre de material y retorna la suma de los volúmenes de todas las piezas hechas en ese material
	public double getVolumen(String nombreDeMaterial) {
		return (this.ladoMayor * this.ladoMenor * this.altura);
	}

	// Recibe como parámetro un color y retorna la suma de las superficies externas de todas las piezas pintadas con ese color
	public double getSuperficie(String unNombreDeColor) {	
		return 2*(this.ladoMayor * this.ladoMenor + this.ladoMayor * this.altura + this.ladoMenor * this.altura);
	}

}
