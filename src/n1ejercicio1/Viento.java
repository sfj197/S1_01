package n1ejercicio1;

public class Viento extends Instrumento{
	
	public Viento(String nombre,int precio) {
		super(nombre,precio);
	}
	
	public String tocar() {
		return "Se esta tocando un instrumento de viento.\n";
	}
	
	public String toString() {
		
		return "Hola soy un instrumento de viento, de nombre " + super.getNombre()
		+ " y tengo un precio de " + super.getPrecio() + "euros.";
	}

}
