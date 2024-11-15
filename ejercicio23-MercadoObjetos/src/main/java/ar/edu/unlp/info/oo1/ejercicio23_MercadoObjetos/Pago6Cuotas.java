package ar.edu.unlp.info.oo1.ejercicio23_MercadoObjetos;

public class Pago6Cuotas implements FormaPago {

	public double precioFinal(double precio) {
		return precio*1.2; // Se incrementa el precio en un 20%
	}
}
