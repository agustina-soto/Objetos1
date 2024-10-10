package ar.edu.unlp.info.oo1.ejercicio11_Inversor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class InversionesTest {	
	private InversionEnAcciones accion1;
    private InversionEnAcciones accion2;
    private PlazoFijo plazoFijo1;
    private Inversor inversor;

	@BeforeEach
	void setUp() {
		accion1 = new InversionEnAcciones("Empresa 1", 100, 50.0); // 100 acciones a $50 cada una
        accion2 = new InversionEnAcciones("Empresa 2", 200, 75.0); // 200 acciones a $75 cada una
        plazoFijo1 = new PlazoFijo(LocalDate.now().minusDays(30), 10000, 0.1); // Plazo fijo de 30 días - $10000 - con 0.1%

        inversor = new Inversor("camilo");
        inversor.agregarInversion(accion1);
        inversor.agregarInversion(accion2);
        inversor.agregarInversion(plazoFijo1);
	}
	
	@Test
    	void testValorActualInversionEnAcciones() {
        // Verifico que el valor actual de las acciones se calcule correctamente
        assertEquals(5000.0, accion1.valorActual()); // 100 * 50.0 = 5000.0
        assertEquals(15000.0, accion2.valorActual()); // 200 * 75.0 = 15000.0
    	}

	 
	 @Test
	 void testValorActualPlazoFijo() {
		 // Valor esperado del plazo fijo con interés simple (30 días, 0.1% diario)
		 double valorEsperado = 10000 + (10000 * 0.1 / 100) * 30;
	     assertEquals(valorEsperado, plazoFijo1.valorActual(), 0.01); // Verifico con margen de 0.01
	 }

	 
	 @Test
	    void testValorActualInversor() {
	     // Valor esperado de las acciones
	     double valorAcciones = 5000.0 + 15000.0; // 100 * 50 + 200 * 75
	     
	     // Valor esperado del plazo fijo después de 30 días con 0.1% de interés simple
	     double valorPlazoFijo = 10000 + (10000 * 0.1 / 100) * 30; // Interés simple

	     // Valor total esperado
	     double valorTotalEsperado = valorAcciones + valorPlazoFijo;

	     // Verifico el valor total de las inversiones del inversor
	     assertEquals(valorTotalEsperado, inversor.valorActual(), 0.01);
	 }

}