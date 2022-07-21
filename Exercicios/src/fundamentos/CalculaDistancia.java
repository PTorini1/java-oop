package fundamentos;

enum Sexo{
	MASCULINO, FEMININO;
}

public class CalculaDistancia {
	private String nome;
	private int idade;
	private Sexo sexo;
	private int destino;
	private int dias;
	private int distancia;
	private int preco;
	
	public int getDestino() {
		return destino;
	}

	public void setDestino(int destino) {
		this.destino = destino;
	}
	
	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public CalculaDistancia() {
	}

	public void CalcularDistancia() {
		if(destino == 1) {
			distancia = 200;
		}else if(destino == 2) {
			distancia = 1000;
		}else {
			distancia = 3000;
		}
	}
	
	public void CalcularPreco() {
		if(destino == 1) {
			preco = dias*100;
		}else if(destino == 2) {
			preco = dias*200;
		}else {
			preco = dias*1000;
		}
	}

	@Override
	public String toString() {
		return "Dados [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", destino=" + destino
				+ ", dias=" + dias + ", distancia=" + distancia + ", preco=" + preco + "]";
	}
}