package app;

public class Empresa extends Cliente{

	// Atributos
	private String razonSocial;
	private int cuit;
	private String condIVA;
	
	// Getters & Setters
	public String getCondIVA() {
		return condIVA;
	}
	
	public void setCondIVA(String condIVA) {
		this.condIVA = condIVA;
	}
	
	public String getRazonSocial() {
		return razonSocial;
	}
	
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	
	public int getCuit() {
		return cuit;
	}
	
	// Constructor
	public Empresa(int codigo, int telefono, String razonSocial, int cuit, String condIVA) {
		super(codigo, telefono, "Tarjeta", 0.10);
		setRazonSocial(razonSocial);
		this.cuit = cuit;
		setCondIVA(condIVA);
	}

	@Override
	public String toString() {
		return "Empresa [razonSocial=" + razonSocial + ", cuit=" + cuit + ", condIVA=" + condIVA + "]";
	}
	
}
