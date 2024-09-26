package ar.edu.unlp.info.oo1.ejercicio9_CuentaGanchos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CuentaCorrienteTest {
	
	private CuentaCorriente cuentaCorriente1, cuentaCorriente2;
	
	@BeforeEach
	void setUp() throws Exception {
		cuentaCorriente1 = new CuentaCorriente();
		cuentaCorriente2 = new CuentaCorriente();
		cuentaCorriente1.setSaldo(100);
		cuentaCorriente1.setDescubierto(1000);
		cuentaCorriente2.setSaldo(200);
		cuentaCorriente2.setDescubierto(5000);
	}
	
	@Test
	void testConstructor() {
		CuentaCorriente cuentaCorrienteAux = new CuentaCorriente();
		assertEquals(0, cuentaCorrienteAux.getDescubierto());
	}

	@Test
	void testPuedeExtraer() {
		// Puede extraer
		assertEquals(true, cuentaCorriente1.puedeExtraer(200));
		assertEquals(true, cuentaCorriente2.puedeExtraer(50));
		// No puede extraer
		assertEquals(false, cuentaCorriente1.puedeExtraer(20000));
		assertEquals(false, cuentaCorriente2.puedeExtraer(30000));
	}

}

