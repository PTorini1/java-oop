
public class Main {

	public static void main(String[] args) {

		Gato gato = new Gato(); // new= instanciar  Gato()= construtor
		gato.Falar();
		System.out.println("-----------");
		
		Cachorro cachorro = new Cachorro();
		cachorro.Falar();
		cachorro.Morder();
		System.out.println("-----------");
		
		Animal animal = new Cachorro();
		animal.Falar();
		animal.Morder();
		animal = new Gato();
		animal.Falar();
		System.out.println("-----------");
	}

}
