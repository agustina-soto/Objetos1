package ar.edu.unlp.info.oo1.ejercicio19_ServicioEnviosPaquetes;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.*;

public class EnvioTest { // Para calcular el monto no tiene en cuenta si es persona fisica o empresa, eso se testea en otro lado
	private EnvioLocal envioLocal;
	private EnvioInterurbano envioInterurbano;
	private EnvioInternacional envioInternacional;
	private Cliente clientePersona;
	private Cliente clienteEmpresa;

	@BeforeEach
	void setUp() {
		this.clientePersona = new PersonaFisica("42941724", "Agus", "direccion");
		this.clienteEmpresa = new ClienteCorporativo("--CUIT--", "EmpresaPepa", "Direccion de empresa");
		this.envioLocal = new EnvioLocal(true, LocalDate.of(2023, 4, 12), "direccion origen", "direccion destino", 99, this.clientePersona); // Entrega Rapida
		this.envioInterurbano = new EnvioInterurbano(200, LocalDate.of(2022, 9, 22), "direccion origen", "direccion destino", 100, this.clienteEmpresa); // Distancia en km
		this.envioInternacional = new EnvioInternacional(LocalDate.of(2024, 11, 02), "direccion origen", "direccion destino", 101, this.clientePersona);
	}

	@Test
	void testEnvioLocal() {
		assertTrue(this.envioLocal.tieneEntregaRapida());
	}
	
	@Test
	void testEnvioInterurbano() {
		assertEquals(this.envioInterurbano.getDistancia(), 200);
	}

	/*
	 * Los envíos locales tienen un costo fijo de $1000 para las entregas estándar y $500 adicional por entrega rápida .
	 */
	@Test
	void testCalcularMontoEnvioLocal() {
		this.envioLocal.setEntregaRapida(false);
		assertEquals(this.envioLocal.calcularMontoEnvio(), 1000);
		this.envioLocal.setEntregaRapida(true);
		assertEquals(this.envioLocal.calcularMontoEnvio(), 1500);
	}


	/*
	 * Los envíos interurbanos tienen un costo que depende de la distancia entre el origen y el destino
	(utilice $20 para menos de 100 km por cada gramo de peso, $25 para distancias entre 100 km y
	500 km por gramo de peso, y $30 para distancias de más de 500 km por gramo de peso).
	 */
	@Test
	void testCalcularMontoEnvioInterurbano() {
		this.envioInterurbano.setPeso(10);
		this.envioInterurbano.setDistancia(99);
		assertEquals(this.envioInterurbano.calcularMontoEnvio(), 20 * 10, 0.1); // 20 * this.envioInterurbano.getPeso() --> 20 * 10
		this.envioInterurbano.setDistancia(100);
		assertEquals(this.envioInterurbano.calcularMontoEnvio(), 25 * 10, 0.1); // 25 * this.envioInterurbano.getPeso() --> 25 * 10
		this.envioInterurbano.setDistancia(501);
		assertEquals(this.envioInterurbano.calcularMontoEnvio(), 30 * 10, 0.1); // 30 * this.envioInterurbano.getPeso() --> 30 * 10
	}


	/*
	 * Los envíos internacionales tienen un costo que depende del país destino y del peso del paquete.
	 * Por ahora, utilice $5000 para cualquier destino y $10 por gramo de peso para envíos de hasta
	 * 1 kg y $12 para envíos de más de 1 kg.
	 */
	@Test
	void testCalcularMontoEnvioInternacional() {
		this.envioInternacional.setPeso(1000); // Setea 1 kg
		assertEquals(this.envioInternacional.calcularMontoEnvio(), 5000 + (10 * 1000), 0.1);
		this.envioInternacional.setPeso(1001); // Setea más de 1 kg
		assertEquals(this.envioInternacional.calcularMontoEnvio(), 5000 + (12 * 1001), 0.1);
	}
	
	@Test
	void testEstaIncluidoEnElPeriodo() {
		LocalDate from = LocalDate.of(2023, 3, 22); LocalDate to = LocalDate.of(2024, 11, 02);
		assertTrue(this.envioLocal.estaIncluidoEnElPeriodo(from, to));
		assertFalse(this.envioInterurbano.estaIncluidoEnElPeriodo(from, to));
		assertTrue(this.envioInternacional.estaIncluidoEnElPeriodo(from, to));
	}

}
