package ar.edu.unlp.info.oo1.ejercicio14_IntervaloDeTiempo;

import java.time.LocalDate;

public class Investigacion2 {

	public static void main(String[] args) {
        LocalDate fechaInicio = LocalDate.of(1972, 12, 15);
        LocalDate fechaFin = LocalDate.of(2032, 12, 15);
        LocalDate fechaHoy = LocalDate.now();

        // Verificar si la fecha de hoy esta entre fechaInicio y fechaFin
        boolean estaEnRango = (fechaHoy.isAfter(fechaInicio) || fechaHoy.isEqual(fechaInicio)) &&
                              (fechaHoy.isBefore(fechaFin) || fechaHoy.isEqual(fechaFin));

        System.out.println("¿La fecha de hoy está entre el 15/12/1972 y el 15/12/2032? " + estaEnRango);
    }

}