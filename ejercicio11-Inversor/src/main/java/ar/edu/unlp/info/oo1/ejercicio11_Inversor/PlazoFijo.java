package ar.edu.unlp.info.oo1.ejercicio11_Inversor;

import java.time.LocalDate;

public class PlazoFijo implements Inversion {
	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDeInteresDiario;

	public PlazoFijo(LocalDate fechaDeConstitucion, double montoDepositado, double porcentajeDeInteresDiario) {
		this.fechaDeConstitucion = fechaDeConstitucion;
		this.montoDepositado = montoDepositado;
		this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
	}

	public LocalDate getFechaConstitucion() {
		return this.fechaDeConstitucion;
	}

	public double getMontoDepositado() {
		return this.montoDepositado;
	}

	public double getPorcentajeDeInteresDiario() {
		return this.porcentajeDeInteresDiario;
	}

	public double valorActual() {
		int diasInvertidos = this.fechaDeConstitucion.compareTo(LocalDate.now());
		return (this.montoDepositado + ( ((this.montoDepositado*this.porcentajeDeInteresDiario)/100)*diasInvertidos) );
	}

	
}