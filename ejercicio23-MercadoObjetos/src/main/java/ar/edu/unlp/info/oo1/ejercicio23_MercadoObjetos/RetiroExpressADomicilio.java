package ar.edu.unlp.info.oo1.ejercicio23_MercadoObjetos;

public class RetiroExpressADomicilio implements FormaEnvio {
	private String dir_vendedor;
	private String dir_cliente;

	public RetiroExpressADomicilio(String dir_vendedor, String dir_cliente) {
		this.dir_vendedor = dir_vendedor;
		this.dir_cliente = dir_cliente;
	}

	public double costoEnvio() {
		return 0.5*(CalculadoraDeDistancia.distanciaEntre(this.dir_vendedor, this.dir_cliente)); // retorna la distancia en Km entre ellas
	}
}
