package ar.edu.unlp.info.oo1.ejercicio16_FilteredSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class EvenNumberSetTest {
    private EvenNumberSet evenSet;

    @BeforeEach
    void setUp() {
        evenSet = new EvenNumberSet();
    }

    @Test
    void testAddEvenNumber() {
        assertTrue(evenSet.add(2));  // Se debe agregar
        assertTrue(evenSet.contains(2));  // Debe contener el número agregado
    }

    @Test
    void testAddOddNumber() {
        assertFalse(evenSet.add(3));  // No se debe agregar un número impar
        assertFalse(evenSet.contains(3));  // No debe contener el número impar
    }

    @Test
    void testAddDuplicateEvenNumber() {
        assertTrue(evenSet.add(4));  // Agregamos un número par
        assertFalse(evenSet.add(4)); // Intentamos agregarlo de nuevo (no debe agregarse)
    }

    @Test
    void testAddAllWithEvenAndOddNumbers() {
        Set<Integer> numbers = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        boolean result = evenSet.addAll(numbers);  // Solo los pares deben agregarse

        assertTrue(result);  // Al menos uno se debe agregar
        assertTrue(evenSet.contains(2));
        assertTrue(evenSet.contains(4));
        assertTrue(evenSet.contains(6));

        assertFalse(evenSet.contains(1));  // Impares no deben estar
        assertFalse(evenSet.contains(3));
        assertFalse(evenSet.contains(5));
    }

    @Test
    void testIsEmpty() {
        assertTrue(evenSet.isEmpty());  // Inicialmente debe estar vacío

        evenSet.add(2);
        assertFalse(evenSet.isEmpty());  // Luego de agregar debe dejar de estar vacío
    }

    @Test
    void testSize() {
        assertEquals(0, evenSet.size());  // Al principio, tamaño debe ser 0

        evenSet.add(2);
        evenSet.add(4);
        evenSet.add(4);  // Elemento duplicado no debería cambiar el tamaño

        assertEquals(2, evenSet.size());  // Solo hay 2 elementos
    }

    @Test
    void testClear() {
        evenSet.add(2);
        evenSet.add(4);

        evenSet.clear();  // Limpiamos el set
        assertTrue(evenSet.isEmpty());  // Ahora debe estar vacío
        assertEquals(0, evenSet.size());  // Tamaño debe ser 0
    }
}
