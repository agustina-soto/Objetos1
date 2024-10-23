package ar.edu.unlp.info.oo1.ejercicio15_DistribuidoraElectrica;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class UsuarioTest {
	private CuadroTarifario tarifa1;
	private Consumo consumo1, consumo2;
	private Usuario usuario1, usuario2;	
	
	@BeforeEach
	void setUp() throws Exception {
		tarifa1 = new CuadroTarifario(200);
		consumo1 = new Consumo(100, 20, tarifa1); consumo2 = new Consumo(0, 0, tarifa1);

		usuario1 = new Usuario("Juli", "LP"); usuario2 = new Usuario("Agus", "CB");

		usuario1.agregarConsumo(consumo1);
		usuario2.agregarConsumo(consumo2);
	}

	@Test
	void testEmitirFactura() {
		Factura facturaAux1, facturaAux2;
		
		facturaAux1 = new Factura(usuario1, 2000, 20000);
		usuario1.emitirFactura(); // Se actualiza la ultima factura (deberia coincidir con los datos de la factura que se creo en facturaAux1

		facturaAux2 = new Factura(usuario2, 0, 0);
		usuario2.emitirFactura(); // Se actualiza la ultima factura (deberia coincidir con los datos de la factura que se creo en facturaAux2

		assertEquals(facturaAux1.getBonificacio(), usuario1.getUltFactura().getBonificacio());
		assertEquals(facturaAux1.getMontoFinal(), usuario1.getUltFactura().getMontoFinal());
		
		assertEquals(facturaAux2.getBonificacio(), usuario2.getUltFactura().getBonificacio());
		assertEquals(facturaAux2.getMontoFinal(), usuario2.getUltFactura().getMontoFinal());
	}
}
