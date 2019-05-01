package app;

import java.util.ArrayList;

public class Cartera {

	// Atributos
	private ArrayList<Cliente> listaClientes;

	// Constructor
	public Cartera() {
		listaClientes = new ArrayList<Cliente>();
	}

	// Metodos de la cartera
	public boolean chequearClienteCodigo(int codigo) { // Devuelve true si el codigo se encuentra ingresado, false si no
		boolean flag = false;
		for (Cliente c : listaClientes) {
			if (!flag && c.getCodigo() == codigo) {
				flag = true;
			}
		}
		return flag;
	}

	public void agregarCliente(Cliente cliente) {
		if (!chequearClienteCodigo(cliente.getCodigo())) {
			listaClientes.add(cliente);
		} else {
			System.out.println("El codigo del cliente se encuentra utilizado");
		}
	}

	public void listarClientes() {
		for (Cliente c : listaClientes) {
			System.out.println(c.toString());
		}
	}

	public Cliente retornarClienteXCodigo(int codigo) {
		Cliente aux = null;
		for(Cliente c : listaClientes) {
			if(c.getCodigo() == codigo) {
				aux = c;
			}
		}
		return aux;
	}
}
