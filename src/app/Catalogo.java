package app;

import java.util.ArrayList;

public class Catalogo {

	// Atributos
	private ArrayList<Producto> catalogoProductos;
	
	// Constructor
	public Catalogo() {
		this.catalogoProductos = new ArrayList<Producto>();
	}
	
	// Metodos
	public boolean chequearProductoCodigo(int codigo) { // Devuelve true si el codigo se encuentra ingresado, false si no
		boolean flag = false;
		for(Producto p : catalogoProductos) {
			if(codigo == p.getCodigo() && !flag) {
				flag = true;
			}
		}
		return flag;
	}
	
	public void agregarProducto(Producto producto) {
		if(!chequearProductoCodigo(producto.getCodigo())) {
			catalogoProductos.add(producto);
		} else {
			System.out.println("El codigo se encuentra ingresado, intente otro");
		}
	}
	
	public void eliminarProductoXCodigo(int codigo) {
		if(chequearProductoCodigo(codigo)) {
			catalogoProductos.remove(catalogoProductos.lastIndexOf(buscarProductoXCodigo(codigo)));
		} else {
			System.out.println("El producto no se encuentra en el catalogo.");
		}
	}

	public void mostrarProductoXCodigo(int codigo) {
		for(Producto p : catalogoProductos) {
			if(p.getCodigo() == codigo) {
				System.out.println(p.toString());
			}
		}
		
	}
	
	public Producto buscarProductoXCodigo(int codigo) {
		Producto rta = null;
		for(Producto p : catalogoProductos) {
			if(p.getCodigo() == codigo) {
				rta = p;
			}
		}
		return rta;
	}
	
	public void listarProductos() {
		for(Producto p : catalogoProductos) {
			System.out.println(p.toString());
		}
	}
	
}
