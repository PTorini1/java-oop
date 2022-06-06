enum Sexo {
	MASCULINO, FEMININO;
}

public class Pessoa {
	
	private String nome;
	private int idade;
	private Sexo sexo;
	Endereco endereco;

	public Pessoa() {
		
	}

	public Pessoa(String texto) {
		String[] ArrayTeste1 =texto.split(",");
		String[] ArrayTeste2 = ArrayTeste1[0].split("=");
		this.nome = ArrayTeste2[1].trim();

		String[] ArrayTeste3 = ArrayTeste1[1].split("=");
		this.idade = Integer.parseInt(ArrayTeste3[1].trim());

		String[] ArrayTeste4 = ArrayTeste1[2].split("=");
		this.sexo = Sexo.valueOf(ArrayTeste4[1].trim());
				
		Endereco endereco = new Endereco(ArrayTeste1[3]);
		this.endereco = endereco;
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
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "," + endereco + "]";
	}

}
