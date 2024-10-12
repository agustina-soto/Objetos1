package ar.edu.unlp.info.oo1.ejercicio12_VolumenYSuperficie;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CilindroTest {

	private Cilindro cilindro1, cilindro2; // ES NECESARIO TESTEAR 2?? NO ALCANZA CON PROBAR CON UNA? :(
	
	@BeforeEach
	void setUp() throws Exception {
		cilindro1 = new Cilindro("hierro", "blanco", 3, 5);
		cilindro2 = new Cilindro("plomo", "gris", 7, 10);
	}
	
	@Test
	void testGetVolumen() {
		assertEquals(141, cilindro1.getVolumen(), 0.5);
		assertEquals(1539, cilindro2.getVolumen(), 0.5);
	}

	@Test
	void testGetSuperficie() {
		assertEquals(151, cilindro1.getSuperficie(), 0.5);
		assertEquals(748, cilindro2.getSuperficie(), 0.5);
	}
}
