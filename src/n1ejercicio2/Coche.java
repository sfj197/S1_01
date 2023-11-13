package n1ejercicio2;

public class Coche {
	
	private static final String MARCA;
	private static String modelo;
	private final int POTENCIA;
	
	static {
		
		MARCA = "Renault";
		modelo = "Renault 5";
	}
	
	public Coche(int POTENCIA) {
		this.POTENCIA = POTENCIA;
		
	}
	public int getPotencia() {
		return this.POTENCIA;
	}
	public static String getMarca() {
		return MARCA;
	}
	public static String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		Coche.modelo = modelo;
	}
	
	public static String frenar() {
		return "El coche esta frenando.";
	}
	public String acelerar() {
		return "El coche esta acelerando.";
	}
	
	public String toString() {
		return "Soy un coche de la marca " + Coche.MARCA + " y modelo " + Coche.modelo 
		+ " con una potencia de " + this.POTENCIA + " cc.";
	}

}