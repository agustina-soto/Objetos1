package ar.edu.unlp.info.oo1.ejercicio12_VolumenYSuperficie;

public class Esfera extends Pieza {
	private int radio;
	
	public int getRadio() {
		return this.radio;
	}
	
	// Recibe como parámetro un nombre de material y retorna la suma de los volúmenes de todas las piezas hechas en ese material
	public double getVolumen(String nombreDeMaterial) {
		return Math.pow(this.radio, 3) * Math.PI * 4/3;
	}

	// Recibe como parámetro un color y retorna la suma de las superficies externas de todas las piezas pintadas con ese color
	public double getSuperficie(String unNombreDeColor) {
		return 4 * Math.PI * Math.pow(this.radio, 2);
	}

}
