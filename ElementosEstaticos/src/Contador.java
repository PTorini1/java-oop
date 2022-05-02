
public class Contador {
	private static int valor;
	
//	public Contador() {
//		this.valor = 10;
//	}
	
	static {
		valor = 1;	
	}

	public static void incrementar() {
		valor ++;
	}

	public static int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
}
