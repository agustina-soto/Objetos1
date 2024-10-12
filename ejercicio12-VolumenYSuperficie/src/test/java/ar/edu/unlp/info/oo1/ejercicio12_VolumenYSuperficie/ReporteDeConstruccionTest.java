package ar.edu.unlp.info.oo1.ejercicio12_VolumenYSuperficie;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReporteDeConstruccionTest {
	private ReporteDeConstruccion reporte1, reporte2, reporteVacio;
	
	@BeforeEach
	void setUp() {
		reporteVacio = new ReporteDeConstruccion(); reporte1 = new ReporteDeConstruccion();	reporte2 = new ReporteDeConstruccion();
		
		Cilindro cilindro1 = new Cilindro("Hierro", "Azul", 3, 5);							// sup: 151 vol: 141
	    PrismaRectangular prismaRec1 = new PrismaRectangular("Hierro", "Verde", 6, 4, 8);	// sup: 206 vol: 192
	    Esfera esfera1 = new Esfera("Plomo", "Azul", 4);									// sup: 201 vol: 268

	    reporte1.agregarPieza(cilindro1);
		reporte1.agregarPieza(prismaRec1);
		reporte1.agregarPieza(esfera1);

	    reporte2.agregarPieza(prismaRec1);
	    reporte2.agregarPieza(esfera1);
	}

	@Test
	void testGetVolumenDeMaterial() {
	    assertEquals(333, reporte1.getVolumenDeMaterial("Hierro"), 0.5);		// Debería darme 141 + 192 = 333
	    assertEquals(268, reporte1.getVolumenDeMaterial("Plomo"), 0.5);		// 268
	    assertEquals(0, reporteVacio.getVolumenDeMaterial("Hierro"), 0.5);	// 0
	    assertEquals(0, reporte2.getVolumenDeMaterial("Plata"), 0.5);		// 0
	}

	@Test
	void testGetSuperficieDeColor() {
	    assertEquals(0, reporteVacio.getSuperficieDeColor("Azul"), 0.5);	// 0
	    assertEquals(352, reporte1.getSuperficieDeColor("Azul"), 0.5);	// 201 + 151 = 352
	    assertEquals(208, reporte1.getSuperficieDeColor("Verde"), 0.5);	// 208
	    assertEquals(0, reporte2.getSuperficieDeColor("Blanco"), 0.5);	// 0
	}

}
