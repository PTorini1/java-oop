
public class Main {

	public static void main(String[] args) {
		
		// Aqui foi criada uma variavel resultado do tipo inteiro
		// Como o metodo somar da classe matematica e estatico, nao houve a necessidade de instanciar um objeto para chama-lo
		int resultado = Matematica.somar(2, 3);
		
		System.out.println(resultado);
		
		// A mesma variavel chamou o metodo subtrair da classe matematica
		resultado = Matematica.subtrair(10, 4);
		
		System.out.println(resultado);
		
		// Aqui foi mostrado que tambem e possivel chamar os metodos usando objeto
		// Foi instanciado 3 objetos 
		Contador contador1 = new Contador();
		Contador contador2 = new Contador();
		Contador contador3 = new Contador();
		// O objeto contador1 chamou o metodo incrementar da classe 
		contador1.incrementar();
		
		// Aqui foi chamado 3 vezes o metodo getValor por meio dos objetos criados
		System.out.println(contador1.getValor());
		System.out.println(contador2.getValor());
		System.out.println(contador3.getValor());
		
		// Aqui o metodo incrementar foi chamado direto pela classe sem a necessidade e instanciar um objeto, pois e um metodo estatico 
		Contador.incrementar();
		// A mesma coisa pro getValor
		System.out.println(Contador.getValor());
		
		// Aqui foi printado a contatante Media da prova
		System.out.println(Constantes.MEDIA_DA_PROVA);
	}

}
