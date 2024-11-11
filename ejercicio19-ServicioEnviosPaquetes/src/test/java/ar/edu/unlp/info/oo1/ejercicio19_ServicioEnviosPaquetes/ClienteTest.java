package ar.edu.unlp.info.oo1.ejercicio19_ServicioEnviosPaquetes;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.*;

public class ClienteTest {
	private Cliente clientePersona;
	private Cliente clienteEmpresa;
	private Envio envioLocal;
	private Envio envioInterU;
	private Envio envioInternacional;

	@BeforeEach
	void setUp() {
		clientePersona = new PersonaFisica("42941724", "Agus", "direccion");
		clienteEmpresa = new ClienteCorporativo("19688", "Empresa Pepa", "direccion pepa");
		envioLocal = new EnvioLocal(true, LocalDate.of(2023, 10, 13), "direccion origen", "direccion destino", 10, clientePersona);
		envioInterU = new EnvioInterurbano(501, LocalDate.of(2022, 5, 27), "direccion origen", "direccion destino", 10, clientePersona);
		envioInternacional = new EnvioInternacional(LocalDate.of(2021, 6, 4), "direccion origen", "direccion destino", 10, clientePersona);
	
		this.clientePersona.agregarEnvio(envioLocal); // 1500
		this.clientePersona.agregarEnvio(envioInterU); // 300
		this.clientePersona.agregarEnvio(envioInternacional); // 5100
		
		this.clienteEmpresa.agregarEnvio(envioLocal);
		this.clienteEmpresa.agregarEnvio(envioInterU);
		this.clienteEmpresa.agregarEnvio(envioInternacional);
	}

	@Test
	void testMontoAPagarPersona() {
		LocalDate from = LocalDate.of(2021, 6, 4); LocalDate to = LocalDate.of(2023, 10, 13);
		assertEquals(this.clientePersona.getMontoAPagar(from, to), 6900 * 0.1); // 1500 + (30*10) + 5000 + 100
	}

	@Test
	void testMontoAPagarEmpresa() {
		LocalDate from = LocalDate.of(2021, 6, 4); LocalDate to = LocalDate.of(2023, 10, 13);
		assertEquals(this.clienteEmpresa.getMontoAPagar(from, to), 6900);
	}
}
