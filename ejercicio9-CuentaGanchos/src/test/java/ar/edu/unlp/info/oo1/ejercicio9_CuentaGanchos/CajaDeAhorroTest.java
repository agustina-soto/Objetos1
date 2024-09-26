package ar.edu.unlp.info.oo1.ejercicio9_CuentaGanchos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CajaDeAhorroTest {

	private CajaDeAhorro caja1, caja2;

	@BeforeEach
	void setUp() throws Exception {
		caja1 = new CajaDeAhorro();
		caja2 = new CajaDeAhorro();
		caja1.setSaldo(500);
		caja2.setSaldo(800);
	}

	@Test
	void testGetCostoAdicional() {
		assertEquals(40, caja1.getCostoAdicional(2000));
		assertEquals(3.2, caja2.getCostoAdicional(160));
	}
	
	@Test
	void testDepositar() {
		caja1.setSaldo(0);
		caja1.depositar(200);
		assertEquals(196, caja1.getSaldo());
		
		caja2.setSaldo(100);
		caja2.depositar(500);
		assertEquals(590, caja2.getSaldo());
	}
	
	@Test
	void testExtraer() {
		caja1.setSaldo(204);
		caja2.setSaldo(510);
		// Se puede extraer
		assertEquals(true, caja1.extraer(200));
		assertEquals(true, caja2.extraer(500));
		
		// No se puede extraer
		assertEquals(false, caja1.extraer(10));
		assertEquals(false, caja2.extraer(100));
	}
	
	@Test
	void testTransferirACuenta() {
		CajaDeAhorro cajaAux = new CajaDeAhorro();
		caja1.setSaldo(204);
		caja2.setSaldo(510);
		// Se puede transferir
		assertEquals(true, caja1.transferirACuenta(200, cajaAux));
		assertEquals(true, caja2.transferirACuenta(500, cajaAux));
		
		// No se puede transferir
		assertEquals(false, caja1.transferirACuenta(10, cajaAux));
		assertEquals(false, caja2.transferirACuenta(100, cajaAux));
	}

}
