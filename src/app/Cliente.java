package app;

public class Cliente {

	// Atributos
	private int codigo;
	private int telefono;
	private String metodoPago;
	private double descuento;
	
	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getMetodoPago() {
		return metodoPago;
	}

	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}

	public int getCodigo() {
		return codigo;
	}

	public double getDescuento() {
		return descuento;
	}

	// Constructor
	public Cliente(int codigo, int telefono, String metodoPago, double descuento) {
		this.codigo = codigo;
		setTelefono(telefono);
		setMetodoPago(metodoPago);
		this.descuento = descuento;
	}
	
}
