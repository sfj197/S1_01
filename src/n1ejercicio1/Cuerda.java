package n1ejercicio1;

public class Cuerda extends Instrumento{
	
	public Cuerda(String nombre,int precio) {
		super(nombre,precio);
	}
	
	public String tocar() {
		return "Se esta tocando un instrumento de cuerda.\n";
	}
	
	public String toString() {
		
		return "Hola soy un instrumento de cuerda, de nombre " + super.getNombre()
		+ " y tengo un precio de " + super.getPrecio() + " euros.";
	}

}
