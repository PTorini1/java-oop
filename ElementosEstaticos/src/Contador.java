
public class Contador {
	private static int valor;
	
//	public Contador() {
//		this.valor = 10;
//	}
	
	// Aqui foi definido que a variavel vai possui um valor definido que e 1
	static {
		valor = 1;	
	}

	// Aqui foi definida uma variavel estatica que vai sempre somar 1, ao valor
	public static void incrementar() {
		valor ++;
	}

	// Abaixo esta o getter que vai pegar o valor da variavel valor 
	public static int getValor() {
		return valor;
	}

}
