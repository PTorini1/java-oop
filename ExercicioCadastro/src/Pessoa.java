enum Sexo{
		MASCULINO,FEMININO;
	}

public class Pessoa {


	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}
	

	private String nome;
	private int idade;
	private Sexo sexo;
	Endereco endereco;
	
	public Pessoa(String nome, int idade, Sexo sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
		
	public Endereco getEndereco() {
		return endereco;		
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public Sexo getSexo() {
		return sexo;
	}
	
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

}



