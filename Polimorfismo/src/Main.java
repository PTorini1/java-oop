
public class Main {

	public static void main(String[] args) {

//		Gato gato = new Gato(); // new= instanciar  Gato()= construtor
//		gato.Falar();
//		System.out.println("-----------");
//		
//		Cachorro cachorro = new Cachorro();
//		cachorro.Falar();
//		cachorro.Morder();
//		System.out.println("-----------");
//		
//		Animal animal = new Cachorro();
//		animal.Falar();
//		animal = new Gato();
//		animal.Falar();
//		System.out.println("-----------");
		
		Gato gato = new Gato(); // Aqui eu instanciei um objeto gato
		Cachorro cachorro = new Cachorro(); // Aqui eu instanciei um objeto cachorro
		falar(gato); // aqui eu chamo o método falar que vem do objeto criado ('gato')
		falar(cachorro); // aqui eu chamo o método falar que vem do objeto criado ('cachorro')
	}
	
	public static void falar(Animal a) { // 
		a.Falar(); // chamei o método falar
		
		if(a instanceof Cachorro) { //insctanceof verifica se o objeto pertence a classe que eu estou comparando
			Cachorro c = (Cachorro) a; //casting explicito / no caso eu forcei o objeto cachorro a morder, 
			c.Morder(); // chamei o método morder
			
			((Cachorro) a).Morder(); //metodo mais simples que o Java sugeriu (função lambda)
		}
	}

}
