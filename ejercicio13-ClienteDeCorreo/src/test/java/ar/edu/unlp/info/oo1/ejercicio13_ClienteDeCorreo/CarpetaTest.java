package ar.edu.unlp.info.oo1.ejercicio13_ClienteDeCorreo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class CarpetaTest {
	Carpeta carpeta, carpetaDestino;
	Email email1, email2, email3;

	@BeforeEach
	void setUp() throws Exception {
		carpeta = new Carpeta("Envio de imagenes");
		carpetaDestino = new Carpeta("Carpeta Destino");
		
		email1 = new Email("Envio de imagen", "Enviando imagen 1");
		email2 = new Email("Envio de imagen", "Enviando imagen 2");
		email3 = new Email("Envio de imagen", "Enviando imagen 3"); // 15 + 17 = 32

		email1.agregarAdjunto(new Archivo("imagen1.png")); // 11
		email1.agregarAdjunto(new Archivo("imagen2.png"));
		email2.agregarAdjunto(new Archivo("imagen3.png"));
		
		
		carpeta.agregarEmail(email3); // email3 pesa 32
		carpeta.agregarEmail(email2); // email2 pesa 43
		carpeta.agregarEmail(email1); // email1 pesa 54
	}

	@Test
	void testMover() {
		// Comprueba que "carpeta" tiene "email1"
		assertTrue(carpeta.getEmails().contains(email1));
		// Mueve el email a otra carpeta
		carpeta.mover(email1, carpetaDestino);
		// Comprueba que "carpeta" ya no tiene "email1"
		assertFalse(carpeta.getEmails().contains(email1));
		// Comprueba que "carpetaDestino" tiene "email1"
		assertTrue(carpetaDestino.getEmails().contains(email1));
	}

	@Test
	void testBuscarEmail() {
		assertEquals(email3, carpeta.buscarEmail("imagen")); // email3 es el primer email que tiene el string
		assertNotEquals(email2, carpeta.buscarEmail("imagen")); // No deberia ser equals porque no es el primero en la lista
		assertEquals(null, carpeta.buscarEmail("imagenes")); // No existe un email con ese string 
		assertEquals(null, carpetaDestino.buscarEmail("algo")); // La carpeta está vacía
	}
	
	@Test
	void testTamañoCarpeta() {
		assertEquals(0, carpetaDestino.tamañoCarpeta());
		assertEquals(129, carpeta.tamañoCarpeta());
	}
}
