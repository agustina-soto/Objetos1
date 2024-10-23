package ar.edu.unlp.info.oo1.ejercicio15_DistribuidoraElectrica;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class ConsumoTest {
	private CuadroTarifario tarifa1, tarifa2;
	private Consumo consumo1, consumo2, consumo3;

	@BeforeEach
	void setUp()throws Exception {
		tarifa1 = new CuadroTarifario(200); tarifa2 = new CuadroTarifario(3000);
		consumo1 = new Consumo(100, 20, tarifa1); consumo2 = new Consumo(600, 90, tarifa2); consumo3 = new Consumo(0, 50, tarifa1);
	}

	@Test
	void testCalcularCostoConsumo() {
		assertEquals(20000, (consumo1.calcularCostoConsumo()) );
		assertEquals(1800000, (consumo2.calcularCostoConsumo()) );
		assertEquals(0, consumo3.calcularCostoConsumo());
	}

	@Test
	void testCalcularFpe() {
		assertEquals(0.98, consumo1.calcularFpe(), 0.1); // margen de error de 0.1
		assertEquals(0.98, consumo2.calcularFpe(), 0.1);
		assertEquals(0, consumo3.calcularFpe());
	}

	@Test
	void testAplicaBonificacion() {
		assertTrue(consumo1.aplicaBonificacion());
		assertTrue(consumo2.aplicaBonificacion());
		assertFalse(consumo3.aplicaBonificacion());
	}
	
	@Test
	void Bonificacion() {
		assertEquals(2000, consumo1.bonificacion());
		assertEquals(180000, consumo2.bonificacion());
		assertEquals(0, consumo3.bonificacion());
	}
	
}
