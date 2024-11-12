package ar.edu.unlp.info.oo1.ejercicio17_AlquilerDePropiedades;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse {
	private LocalDate from;
	private int sizeInDays;


	/*
	 * Este constructor está porque no sé cómo implementar esto manteniendo el constructor del ejercicio original :/
	 * Es para que no me tire error.
	 */
	public DateLapse(LocalDate from, LocalDate to) {
		this.from = from;
		this.sizeInDays = (int) ChronoUnit.DAYS.between(from, to); 
	}

	public DateLapse(LocalDate from, int sizeInDays) {
		this.from = from;
		this.sizeInDays = sizeInDays;
	}

	// Retorna la fecha de inicio del rango
	public LocalDate getFrom() {
		return this.from;
	}

	// Retorna la cantidad de días entre la fecha 'from' y la fecha 'to'
	public int sizeInDays() {
		return this.sizeInDays;
	}

	// Retorna la fecha de fin del rango
	public LocalDate getTo() {
			return this.from.plusDays(sizeInDays);
	}

	// Recibe un objeto LocalDate y retorna true si la fecha está entre el from y el fin
	 public boolean includesDate(LocalDate other) {
		 return (
				  ( this.from.isBefore(other) || this.from.isEqual(other) )
				  &&
				  ( getTo().isAfter(other) || getTo().isEqual(other))
				);
	 }

}
