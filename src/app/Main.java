package app;

public class Main {

	public static void main(String[] args) {

		Catalogo catalogo = new Catalogo();
		Cartera cartera = new Cartera();
		
		//Agregar 10 productos
		catalogo.agregarProducto(new Producto(1, "iPhone XR", "Apple", 800, 10));
		catalogo.agregarProducto(new Producto(2, "iPhone XS", "Apple", 1000, 5));
		catalogo.agregarProducto(new Producto(3, "iPhone X", "Apple", 800, 15));
		catalogo.agregarProducto(new Producto(4, "iMac", "Apple", 2800, 3));
		catalogo.agregarProducto(new Producto(5, "MacBook", "Apple", 1200, 10));
		catalogo.agregarProducto(new Producto(6, "Telefono malo", "Samsung", 400, 20));
		catalogo.agregarProducto(new Producto(7, "Telefono mas malo", "Huaweii", 300, 30));
		catalogo.agregarProducto(new Producto(8, "Computadora decente", "DELL", 1800, 10));
		catalogo.agregarProducto(new Producto(9, "UnDrone", "Alguna", 1800, 10));
		catalogo.agregarProducto(new Producto(10, "iPad", "Apple", 800, 7));
		
		// Agregar 4 clientes
		cartera.agregarCliente(new Empresa(1,1234, "monos s.a", 123456, "Monotributo"));
		cartera.agregarCliente(new ConsFinal(2,4321, "matias", "cerrano", 6543321, 1243254));
		cartera.agregarCliente(new Empresa(3,1111, "gatos s.a.u.", 78956, "IVA Exento"));
		cartera.agregarCliente(new ConsFinal(4,2222, "elmer", "molocho", 123456, 7645));
		
		//Prueba funcion agregar
		catalogo.agregarProducto(new Producto(1, "Prueba", "Motorola", 800, 10));
		
		// Mostrar por pantalla
		catalogo.listarProductos();
		cartera.listarClientes();
		
		Pedido pedido1 = new Pedido(cartera.retornarClienteXCodigo(1), 1811);
		pedido1.agregarProductoPedido(catalogo.buscarProductoXCodigo(3));
		pedido1.agregarProductoPedido(catalogo.buscarProductoXCodigo(5));
		pedido1.agregarProductoPedido(catalogo.buscarProductoXCodigo(8));
		
		System.out.println(pedido1.calcularTotalBruto());
		
	}

}
