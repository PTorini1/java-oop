
public class Pessoa {

	private enum Sexo{
		MASCULINO,FEMININO;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}

	String nome;
	int idade;
	Endereco endereco;
	int sexo;
	
	public Pessoa(String nome, int idade, int sexo) {
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
	
	public void sexo() {
		if(sexo==1) {
			Sexo.MASCULINO;
		}else {
			Sexo.FEMININO;
		}
	}
}
