package n1ejercicio1;

public abstract class Instrumento {
	
	private String nombre;
	private int precio;
	
	public Instrumento(String nombre,int precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	// bloque estatico.
	
	static {
		System.out.println("Solo carga una vez\n");
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public int getPrecio() {
		return this.precio;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public abstract String tocar();
	
	public String toString() {
		return "Hola soy un instrumento";
	}

}
