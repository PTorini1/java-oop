
public class Endereco {
	// Sobrescrevendo o toString a fim de mostrar na tela futuramente os dados do endereco
	@Override
	public String toString() {
		return "Endereco rua=" + rua + "- numero=" + numero + "- bairro=" + bairro;
	}
	
	// criando os atributos da classe
	private String rua;
	private int numero;
	private String bairro;

	//Construtor vazio
	public Endereco() {

	}

	// Construtor que recebe como parametro uma variavel linha
	public Endereco(String linha) {
		// essa variavel e usada para dar um split onde tiver um hifen (foi usado hifen, pois com outros sinais estava dando erro)
		// O split e um metodo que funciona apenas com strings e que basicamente quebra a string a partir de um caractere que voce escolher
		// Nesse caso a string sera quebrada no hifen
		String[] ArrayTeste1 = linha.split("-");
		// Aqui sera 'quebrada' no igual
		String[] ArrayTeste2 = ArrayTeste1[0].split("=");
		// Ja o metodo trim, tambem so se aplica a String e serve para remover espacos em branco no inicio ou no final do texto
		this.rua = ArrayTeste2[1].trim();

		String[] ArrayTeste3 = ArrayTeste1[1].split("=");
		this.numero = Integer.parseInt(ArrayTeste3[1].trim());
		
		// Aqui foram instanciados 4 objetos do tipo Array que vao receber uma linha e quebra-las de acordo com os caracteres passados
		// No caso foram 4 vezes, pois uma foi quebrar na virgula e as outras duas para quebrar apos receber o resultado das variaveis
		String[] ArrayTeste4 = ArrayTeste1[2].split("=");
		this.bairro = ArrayTeste4[1].trim();

	}

	//Getters e Setters dos atributos da classe
	public String getRua() {
		return rua;
	}

	public int getNumero() {
		return numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

}
