package ar.edu.unlp.info.oo1.ejercicio7_RedAlumbrado;

import java.util.ArrayList;
import java.util.List;

public class Farola {
	private boolean encendida;
	private List<Farola> vecinas;
	
	
	public Farola() {
		this.encendida = false;
		this.vecinas = new ArrayList<Farola>();
	}

	/*
	* Crea la relación de vecinos entre las farolas. La relación de vecinos entre las farolas es recíproca, es decir el receptor del mensaje será vecino de otraFarola, al igual que otraFarola también se convertirá en vecina del receptor del mensaje
	*/
	public void pairWithNeighbor(Farola otraFarola) {
		if (!this.vecinas.contains(otraFarola)) {
			this.vecinas.add(otraFarola);
			otraFarola.pairWithNeighbor(this);
		}
	}

	
	/*
	* Retorna sus farolas vecinas
	*/
	public List<Farola> getNeighbors() {
		return this.vecinas;
	}


	/*
	* Si la farola no está encendida, la enciende y propaga la acción.
	*/
	public void turnOn() {
		if (this.isOff()) {
			this.encendida = true;
			this.vecinas.forEach(vecina -> vecina.encendida = true);
		}
	}

	/*
	* Si la farola no está apagada, la apaga y propaga la acción.
	*/
	public void turnOff() {
		if (this.isOn()) {
			this.encendida = false;
			this.vecinas.forEach(vecina -> vecina.encendida = false);
		}
	}
	
	/*
	* Retorna true si la farola está encendida.
	*/
	public boolean isOn() {
		return this.encendida==true;
	}

	/*
	* Retorna true si la farola está apagada.
	*/
	public boolean isOff() {
		return this.encendida==false;
	}	
	
}
