package ar.edu.unlp.info.oo1.ejercicio17_AlquilerDePropiedades;

public class Reserva {
	private Propiedad propiedad;
	private Usuario usuario;
	private DateLapse periodo;
	
	public Reserva(DateLapse periodo, Propiedad prop, Usuario us) {
		this.propiedad = prop;
		this.usuario = us;
		this.periodo = periodo;
	}
	
	public double calcularPrecio(double precioXNoche) {
		return precioXNoche * periodo.sizeInDays();
	}
	
	public boolean estaEnCurso(Reserva r) {
		return true;
	}
	
	public void cancelarReserva() {
		this.propiedad.cancelarReserva();
	}
}
