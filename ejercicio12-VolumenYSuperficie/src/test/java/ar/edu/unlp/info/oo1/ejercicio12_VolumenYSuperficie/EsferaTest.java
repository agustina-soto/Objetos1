package ar.edu.unlp.info.oo1.ejercicio12_VolumenYSuperficie;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EsferaTest {
	private Esfera esfera1, esfera2;
	
	@BeforeEach
	void setUp() throws Exception {
		esfera1 = new Esfera("Plomo", "Azul", 4);
		esfera2 = new Esfera("Hierro", "Blanco", 6);
	}

	@Test
	void testGetVolumen() {
		assertEquals(268, esfera1.getVolumen(), 0.5);
		assertEquals(905, esfera2.getVolumen(), 0.5);
	}
 
	@Test
	void testGetSuperficie() {
		assertEquals(201, esfera1.getSuperficie(), 0.5);
		assertEquals(452, esfera2.getSuperficie(), 0.5);
	}
}
