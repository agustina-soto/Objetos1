package ar.edu.unlp.info.oo1.ejercicio13_ClienteDeCorreo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class EmailTest {
	Email email1, email2;
	Archivo adjunto1, adjunto2;
	
	@BeforeEach
	void setUp() throws Exception {
		email1 = new Email("Envio de imagen", "Enviando imagen 1 y 2"); // 15 + 21 = 36
		email2 = new Email("Envio de imagen", "Volviendo a enviar imagen 1"); // 15 + 27 = 42
		
		adjunto1 = new Archivo("imagen1.png"); // 11
		adjunto2 = new Archivo("imagen2.png");
		
		email1.agregarAdjunto(adjunto1);
		email1.agregarAdjunto(adjunto2); // email1 pesa 58
		email2.agregarAdjunto(adjunto1); // email2 pesa 53
	}

	@Test
	void testContieneTexto() {
		assertTrue(email1.contieneTexto("Envio"));
		assertFalse(email2.contieneTexto("foto"));
	}
	
	@Test
	void testTamañoEmail() {
		assertEquals(58, email1.tamañoEmail());
		assertNotEquals(0, email2.tamañoEmail()); // tiene algun sentido probar esto? no sé qué probar :(
	}
}
