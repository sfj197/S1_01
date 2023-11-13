package n1ejercicio2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//El atributo potencia se define en la instanciazion del objeto coche1;
		//ya que la inicializamos en el constructor de la clase.Ademas al ser 
		//final no podremos cambiarlo.
		
		Coche coche1 = new Coche(2000);
	
		System.out.println(coche1);
		
		//El parametro marca es static , es un parametro de la  clase Coche;
		//todos los objetos coche tendran la misma copia la que se inicializa 
		// en el bloque static.Obtenemos informacion con el static getMarca().
		
		Coche.getMarca();
		
		//El parametro modelo tambien es static , pertenece a la clase Coche;
		//todas las instanciaciones usaran la misma copia, la que se inicializa 
		//en el bloque static.En consecuencia obtenemos informacion con static getModelo.
		
		Coche.getModelo();
		
		//El método frenar es statico pertenece a la clase coche todos los 
		//objetos instanciados tienen la misma copia.
		
		
		System.out.println(Coche.frenar());
		
		//El método acelerar no es statico, no es un método de clase, cada
		//instanciazion tendra su propia copia.
		
		System.out.println(coche1.acelerar());
		
		

	}

}