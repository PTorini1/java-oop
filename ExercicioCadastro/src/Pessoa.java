// Aqui foi criado um enum do tipo sexo
// O enum e usado quando um dado for sempre aquilo
enum Sexo {
	MASCULINO, FEMININO;
}

public class Pessoa {
	
	// Atributos da classe pessoa
	private String nome;
	private int idade;
	private Sexo sexo;
	// Aqui foi instanciado uma variavel do tipo Endereco, pois pessoa recebe endereco
	Endereco endereco;

	// Construtor vazio
	public Pessoa() {
		
	}

	// Aqui foi feita a mesma coisa que esta explicada na classe endereco
	// So vou explicar a mais o valueOf e o parseInt
	public Pessoa(String texto) {
		String[] ArrayTeste1 =texto.split(",");
		String[] ArrayTeste2 = ArrayTeste1[0].split("=");
		this.nome = ArrayTeste2[1].trim();

		String[] ArrayTeste3 = ArrayTeste1[1].split("=");
		// Como a variavel idade e um int foi necessario transforma-lo em string pois o metodo trim so da pra usar em string
		// O Integer.parseInt faz essa funcao de transformar um int em String
		// A classe Integer e propria do Java
		this.idade = Integer.parseInt(ArrayTeste3[1].trim());

		String[] ArrayTeste4 = ArrayTeste1[2].split("=");
		// O sexo e um enum e para transforma-lo em int foi feito um valuefOf que e usado para objetos de qualquer tipo e transforma em String
		this.sexo = Sexo.valueOf(ArrayTeste4[1].trim());
			
		// Para chamar os valores do endereco e mostra-los na tela ja com os splits e os trims
		// Criei um objeto endereco e passei como parametro o ArrayTeste1 que vai jogar o endereco como o proximo elemento da matriz
		Endereco endereco = new Endereco(ArrayTeste1[3]);
		this.endereco = endereco;
	}

	// Getters e setters
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
	
	// toString de pessoa
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "," + endereco + "]";
	}

}
