package n2ejercicio1;

public class Smartphone extends Telefono implements Camara, Reloj {

	public Smartphone(String marca, String modelo) {
		super(marca, modelo);
	}

	public String fotografiar() {
		return "Se esta haciendo una foto.";
	}

	public String alarma() {
		return "Esta sonando la alarma.";
	}

	public String toString() {
		return "Soy un smartphone de la marca " + super.getMarca() + " y modelo " + super.getModelo();
	}

}