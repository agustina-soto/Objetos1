package ar.edu.unlp.info.oo1.ejercicio16_FilteredSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EvenNumberSet implements Set<Integer>{
	// HashSet interno para almacenar los elementos
    private Set<Integer> setInterno;
	
	/*
	 * El HashSet no permite añadir elementos que ya estan asi que es la mejor opcion para este ejercicio.
	 * Es rápida en términos de rendimiento para operaciones  de búsqueda, inserción y eliminación.
	 */

	public EvenNumberSet() {
    	this.setInterno = new HashSet<>();
    }

	// Se sobreescribe el método 'add' para que solo permita números pares
	public boolean add(Integer num) {
        return (num != null && num % 2 == 0) ? this.setInterno.add(num) : false;
        // Verifica si no es null (Integer es primitivo), verifica si es par, delega la inserción al HashSet; si el número no es par, no se agrega
	}

	@Override
	public int size() {
		return this.setInterno.size();
	}

	@Override
	public boolean isEmpty() {
		return this.setInterno.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		return this.setInterno.contains(o);
	}

	@Override
	public Iterator<Integer> iterator() {
		return this.setInterno.iterator();
	}

	@Override
	public Object[] toArray() {
		return this.setInterno.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return this.setInterno.toArray(a);
	}

	@Override
	public boolean remove(Object o) {
		return this.setInterno.remove(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return this.setInterno.containsAll(c);
	}

	@Override
	public boolean addAll(Collection<? extends Integer> c) {
		boolean modificado = false;
	    for (Integer number : c) {
	        if (number != null && number % 2 == 0) {
	        	modificado |= this.setInterno.add(number); // El operador |= verifica si al menos uno de los valores es true
	        }
	    }
	    return modificado;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return this.setInterno.retainAll(c);
	}
	
	@Override
	public boolean removeAll(Collection<?> c) {
		return this.setInterno.removeAll(c);
	}

	@Override
	public void clear() {
		this.setInterno.clear();
	}
}