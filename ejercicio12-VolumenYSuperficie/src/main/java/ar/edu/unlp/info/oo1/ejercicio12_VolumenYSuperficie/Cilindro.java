package ar.edu.unlp.info.oo1.ejercicio12_VolumenYSuperficie;

public class Cilindro extends Pieza {
	private int radio;
	private int altura;

	public int getRadio() {
		return this.radio;
	}
	
	public int getAltura() {
		return this.altura;
	}

	// Recibe como parámetro un nombre de material y retorna la suma de los volúmenes de todas las piezas hechas en ese material
	public double getVolumen(String nombreDeMaterial) {
		return Math.pow(this.radio, 2) * Math.PI * this.altura;
	}

	// Recibe como parámetro un color y retorna la suma de las superficies externas de todas las piezas pintadas con ese color
	public double getSuperficie(String unNombreDeColor) {
		return 2 * Math.PI * this.radio * this.altura + 2 * Math.PI * Math.pow(this.radio, 2);
	}
	
}
