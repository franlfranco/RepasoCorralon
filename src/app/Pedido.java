package app;

import java.util.ArrayList;

public class Pedido {

	// Atributos
	private ArrayList<Producto> listaProductos;
	private Cliente cliente;
	private int fecha;
	private boolean listoCobrar;

	// Getters & Setters
	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public int getFecha() {
		return fecha;
	}

	// Constructor
	public Pedido(Cliente cliente, int fecha) {
		listaProductos = new ArrayList<Producto>();
		this.cliente = cliente;
		this.fecha = fecha;
		this.listoCobrar = false;

	}

	// Metodo toString()
	@Override
	public String toString() {
		return "Pedido [listaProductos=" + listaProductos + ", cliente=" + cliente + ", fecha=" + fecha
				+ ", listoCobrar=" + listoCobrar + "]";
	}

	public void agregarProductoPedido(Producto producto) {
		if (producto.getStock() > 0) {
			listaProductos.add(producto);
			producto.setStock(producto.getStock() - 1);
		}
	}

	public double calcularTotalBruto() {
		double total = 0;
		for (Producto p : listaProductos) {
			total += p.getPrecio();
		}
		return total;
	}

	public void asignarPago(String medioPago) {
		if (!listoCobrar && !(cliente instanceof ConsFinal)) {
			cliente.setMetodoPago(medioPago);
		} else {
			System.out.println("El medio de pago no se puede modificar para este pedido");
		}
	}

	public double calcularTotalNeto() {
		return calcularTotalBruto() * (1 - cliente.getDescuento());
	}

	public void cobrar() {
		this.listoCobrar = true;
	}
}
