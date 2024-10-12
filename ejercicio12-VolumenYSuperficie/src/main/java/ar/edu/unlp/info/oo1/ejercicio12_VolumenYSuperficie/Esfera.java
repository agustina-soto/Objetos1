package ar.edu.unlp.info.oo1.ejercicio12_VolumenYSuperficie;

public class Esfera extends Pieza {
	private int radio;
	
	public Esfera(String material, String color, int radio) {
		super(material, color);
		this.radio = radio;
	}
	
	public int getRadio() {
		return this.radio;
	}
	
	public double getVolumen() {
	    return Math.pow(this.radio, 3) * Math.PI * (4.0 / 3.0);
	}

	public double getSuperficie() {
		return 4 * Math.PI * Math.pow(this.radio, 2);
	}

}
