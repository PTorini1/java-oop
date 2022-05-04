
public class Veiculo {
	private String nome;
	protected String marca; // protected permite que a classe filha veja esse atributo
	protected String modelo;
	protected int ano;
	
	public void Buzinar() {
		System.out.println("BI BI");
	}
	
	public void Imprimir() {
		System.out.println("Marca:" + marca);
		System.out.println("Modelo:" + modelo);
		System.out.println("Ano:" + ano);
	}
	
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
