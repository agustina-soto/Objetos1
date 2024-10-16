package ar.edu.unlp.info.oo1.ejercicio13_ClienteDeCorreo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class ClienteDeCorreoTest {
	ClienteDeCorreo cliente, clienteVacio;
	Carpeta c1, c2;
	Email e1, e2, e3;

	@BeforeEach
	void setUp() throws Exception {		
		// Crea archivos e emails y agrega los archivos en los emails
		e1 = new Email("Envio de imagen", "Enviando imagen 1");
		e2 = new Email("Envio de imagen", "Enviando imagen 2");
		e3 = new Email("Envio de imagen", "Re-envio imagen 2"); // 15 + 17 = 32

		e1.agregarAdjunto(new Archivo("imagen1.png"));
		e1.agregarAdjunto(new Archivo("imagen2.png"));
		e1.agregarAdjunto(new Archivo("imagen3.png"));
		e2.agregarAdjunto(new Archivo("imagen4.png")); // 11

		// Crea carpetas y agrega los emails en las carpetas
		c1 = new Carpeta("Carpeta de fotos 1"); // 18
		c2 = new Carpeta("Carpeta de fotos 2");

		c1.agregarEmail(e1);
		c2.agregarEmail(e2);
		c2.agregarEmail(e3);

		// Crea clientes y agrega carpetas en cliente
		cliente = new ClienteDeCorreo();
		clienteVacio = new ClienteDeCorreo();

		cliente.agregarCarpeta(c1);
		cliente.agregarCarpeta(c2);
	}

	@Test
	void testRecibir() {
		assertFalse(clienteVacio.getInbox().getEmails().contains(e3));
		clienteVacio.getInbox().agregarEmail(e3);
		assertTrue(clienteVacio.getInbox().getEmails().contains(e3));
	}
	
	@Test
	void testBuscar() {
		assertEquals(e3, cliente.buscar("Re"));
		assertEquals(e1, cliente.buscar("imagen")); // no entiendo bien como funciona esto de cual agarra primero (es literal por cual agrego antes a la lista?) CHEQUEAR!!
	}
	
	@Test
	void testEspacioOcupado() {
		assertEquals(140, cliente.espacioOcupado());
		assertEquals(0, clienteVacio.espacioOcupado());
	}
}
