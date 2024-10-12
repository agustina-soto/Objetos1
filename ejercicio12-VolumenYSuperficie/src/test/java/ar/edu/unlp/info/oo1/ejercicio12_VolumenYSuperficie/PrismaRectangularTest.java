package ar.edu.unlp.info.oo1.ejercicio12_VolumenYSuperficie;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PrismaRectangularTest {
	private PrismaRectangular prismaRec1, prismaRec2;
	
	
	@BeforeEach
	void setUp() {
		prismaRec1 = new PrismaRectangular("Plomo", "Azul", 6, 4, 8);
		prismaRec2 = new PrismaRectangular("Hierro", "Verde", 5, 3, 9);
	}
	
	@Test
	void testGetVolumen() {
		assertEquals(192, prismaRec1.getVolumen(), 0.5);
		assertEquals(135, prismaRec2.getVolumen(), 0.5);
	}
	
	@Test
	void testGetSuperficie() {
		assertEquals(208, prismaRec1.getSuperficie(), 0.5);
		assertEquals(174, prismaRec2.getSuperficie(), 0.5);
	}
}
