// A classe veiculo vai ser a classe pai de outras classes pois ela tem metodos e atributos que se aplicam a todos
public class Veiculo {
	// Criando atributos
	private String nome;
	protected String marca; // protected permite que a classe filha veja esse atributo
	protected String modelo;
	protected int ano;
	
	// Metodo buzinar
	public void Buzinar() {
		System.out.println("BI BI");
	}
	
	// Metodo imprimir as informacoes
	public void Imprimir() {
		System.out.println("Marca:" + marca);
		System.out.println("Modelo:" + modelo);
		System.out.println("Ano:" + ano);
	}
	
	// getters e setters para que outras classes possam visualizar seus atributos
	public String getNome() {
		return nome;
	}
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public int getAno() {
		return ano;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
}
