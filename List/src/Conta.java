
public class Conta {
	@Override
	public String toString() {
		return nome + " " + valor;
	}

	String nome;
	double valor;
	
	public Conta(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}
	
}
