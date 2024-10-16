package ar.edu.unlp.info.oo1.ejercicio14_IntervaloDeTiempo;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.*;

public class DateLapseTest {
	DateLapse dl1, dl2;
	
	@BeforeEach
	void setUp() throws Exception {
		LocalDate fechaInicio = LocalDate.of(2000, 9, 23);
		LocalDate fechaFin = LocalDate.now(); // Fecha de hoy como fecha final
		
		dl1 = new DateLapse(fechaInicio, fechaFin);
		
		fechaInicio = LocalDate.of(2024, 10, 16);
		fechaFin = LocalDate.of(2024, 10, 16);
		
		dl2 = new DateLapse(fechaInicio, fechaFin);
	}
	
	@Test
	void testSizeInDays() {
		assertEquals(8789, dl1.sizeInDays());
		assertEquals(0, dl2.sizeInDays());
	}
	
	@Test
	void testIncludesDate() {
		LocalDate fechaEntre1 = LocalDate.of(2021, 12, 9);
		LocalDate fechaEntre2 = LocalDate.of(2025, 2, 13);
		
		assertTrue(dl1.includesDate(fechaEntre1));
		assertFalse(dl1.includesDate(fechaEntre2));
		assertFalse(dl2.includesDate(fechaEntre2));
	}
}
