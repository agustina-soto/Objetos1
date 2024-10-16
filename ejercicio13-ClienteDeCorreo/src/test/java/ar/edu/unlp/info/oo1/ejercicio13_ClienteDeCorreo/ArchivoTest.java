package ar.edu.unlp.info.oo1.ejercicio13_ClienteDeCorreo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class ArchivoTest {
	Archivo adjunto1, adjunto2;

	@BeforeEach
	void setUp() throws Exception {
		adjunto1 = new Archivo("imagen1.png");
		adjunto2 = new Archivo("imagen2.png");
	}

	@Test
	void testTamañoArchivo() {
		assertEquals(11, adjunto1.tamañoArchivo());
		assertNotEquals(20, adjunto2.tamañoArchivo());
	}
}
