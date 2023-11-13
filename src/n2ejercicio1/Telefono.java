package n2ejercicio1;

public class Telefono {

	private String marca;
	private String modelo;

	public Telefono(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMarca() {
		return this.marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String llamar(String numTelefono) {
		return "Se esta llamando al número " + numTelefono;
	}

	public String toString() {
		return "Soy un telefono.";
	}

}