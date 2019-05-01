package app;

public class ConsFinal extends Cliente{

	// Atributos
	private String nombre;
	private String apellido;
	private int fechaNacimiento;
	private int dni;
	
	// Getters & Setters
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public int getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public int getDni() {
		return dni;
	}
	
	// Constructor
	public ConsFinal(int codigo, int telefono, String nombre, String apellido, int fechaNacimiento, int dni) {
		super(codigo, telefono, "Efectivo", 0.15);
		setNombre(nombre);
		setApellido(apellido);
		this.fechaNacimiento = fechaNacimiento;
		this.dni = dni;
	}

	// Método toString()
	@Override
	public String toString() {
		return "ConsFinal [nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento
				+ ", dni=" + dni + "]";
	}
	
}
