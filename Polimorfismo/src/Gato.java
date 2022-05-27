// Esse extends indica que a classe Gato tambem extende da classe animal
public class Gato extends Animal{
	
	// O metodo falar do gato possui suas proprias caracteristicas que sao diferentes do cachorro
	/* O cachorra fala com au au e gato com miau. Mesmo sendo o metodo com o mesmo nome e derivado da mesma classe, possui caracteristica propria pelo fato 
	de o metodo da classe animal ser generico */ 
	@Override
	public void Falar() {
		super.Falar();
		System.out.println("Miau");
	}
	
	
	
}
