enum Sexo{
		MASCULINO,FEMININO;
	}

public class Pessoa {

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo +  " " + endereco + "]";
	}

	private String nome;
	private int idade;
	private Sexo sexo;
	Endereco endereco;
	private int sex;
	
	public Pessoa(String nome, int idade, Sexo sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	public Pessoa(String texto) {
		String[]ArrayTeste1 = ((String) texto).split(",");
		String[]ArrayTeste2 =  ArrayTeste1[0].split("=");
		this.nome = ArrayTeste2[1].trim();
		
		String.valueOf(idade);
		String[] ArrayTeste3 = ArrayTeste1[1].split("=");
		this.idade = ArrayTeste3[1].trim();
		
		String[] ArrayTeste4 = ((String) ArrayTeste1[2]).split("=");
		this.sexo = ((String) ArrayTeste5[2]).trim();
		
		Object[] ArrayTeste5 = ((String) ArrayTeste1[3]).split("=");
		this.endereco = ArrayTeste5[3].trim();
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
	
	public void sex(int sex ) {
		if(sex==1) {
			sexo = sexo.MASCULINO;
		}else {
			sexo  = sexo.FEMININO;
		}
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}
	
}



