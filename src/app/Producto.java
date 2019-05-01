package app;

public class Producto {

	// Atributos
	private int codigo;
	private String nombre;
	private String marca;
	private double precio;
	private int stock;
	
	
	//Getters & Setters
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public int getStock() {
		return stock;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getMarca() {
		return marca;
	}
	
	// Constructor
	public Producto(int codigo, String nombre, String marca, double precio, int stock) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.marca = marca;
		setPrecio(precio);
		setStock(stock);
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", marca=" + marca + ", precio=" + precio
				+ ", stock=" + stock + "]";
	}
	
	
}
