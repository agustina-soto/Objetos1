package ar.edu.unlp.info.oo1.ejercicio14_IntervaloDeTiempo;

import java.time.LocalDate;
import java.time.Period;

public class Investigacion3 {

	public static void main(String[] args) {
		LocalDate fechaInicio = LocalDate.of(1972, 9, 15);
		LocalDate fechaFin = LocalDate.now(); // Fecha de hoy como fecha final
	
        // Calcula el numero de días entre las dos fechas
        int dias = fechaInicio.until(fechaFin).getDays();
        System.out.println("Número de días entre 15/09/1972 y hoy: " + dias);

        // Calcula el numero de meses entre las dos fechas
        int meses = fechaInicio.until(fechaFin).getMonths();
        System.out.println("Número de meses entre 15/09/1972 y hoy: " + meses);

        // Calcula el numero de años entre las dos fechas
        int años = fechaInicio.until(fechaFin).getYears();
        System.out.println("Número de años entre 15/09/1972 y hoy: " + años);
	}
}
