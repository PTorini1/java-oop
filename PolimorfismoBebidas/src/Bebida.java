
public class Bebida {
	// Criando os atributos da bebida
	private String nome;
	private boolean aquecer;
	
	// Aqui e o metodo contrutor da classe bebida
	// O contrutor e usado para que outras classes possam acessar os atributos privados da classe atual
	public Bebida(String nome, boolean aquecer) {
		super();
		this.nome = nome;
		this.aquecer = aquecer;
	}
	
	// Metodo generico para qualquer bebida 
	public void preparar() {
		System.out.println("Pegando o copo");
	}
	
	// Getters e setters dos atributos dessa classe
	// Getters pegam o valor e setters atribuem um valor
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isAquecer() {
		return aquecer;
	}

	public void setAquecer(boolean aquecer) {
		this.aquecer = aquecer;
	}
	
	
	
}
