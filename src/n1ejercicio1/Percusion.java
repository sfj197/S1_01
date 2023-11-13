package n1ejercicio1;

public class Percusion extends Instrumento {

	public Percusion(String nombre,int precio) {
		super(nombre,precio);
	}
	
	public String tocar() {
		return "Se esta tocando un instrumento de percusion.\n";
	}
	
	public String toString() {
		
		return "Hola soy un instrumento de percusión, de nombre " + super.getNombre()
		+ " y tengo un precio de " + super.getPrecio() + " euros.";
	}
}
