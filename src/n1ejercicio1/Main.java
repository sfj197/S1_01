package n1ejercicio1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instrumento violin = new Cuerda ("violin", 500);
		System.out.println(violin);
		System.out.println(violin.tocar());
		
		Instrumento  flauta = new Viento ("flauta", 150);
		System.out.println(flauta);
		System.out.println(flauta.tocar());
		
		Instrumento bateria = new Percusion("bateria", 1200);
		System.out.println(bateria);
		System.out.println(bateria.tocar());
		
		
		

	}

}

