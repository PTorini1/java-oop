
public class Conta {
	// toString e um metodo do Java que vai retornar o valor das variaveis criadas e forma de texto
	@Override
	public String toString() {
		return nome + " " + valor;
	}

	String nome;
	double valor;
	
	// Aqui foi instanciado o construtor da classe para que a classe principal pudesse acessar os atributos dessa
	public Conta(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}
	
}
