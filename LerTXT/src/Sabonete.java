
public class Sabonete {
	// Instanciando atributos da classe
	String cheiro;
	String cor;
	
	// Aqui e um override no metodo toString() para mostrar os atributos cheiro e cor
	@Override
	public String toString() {
		return "Sabonete: cheiro=" + cheiro + ", cor=" + cor;
	}
	
	// Construtor da classe sabonete que vai permitir que essa classe seja instanciada na main podendo acessar seus metodos
	public Sabonete(String cheiro, String cor) {
		this.cheiro = cheiro;
		this.cor = cor;
	}
	
	// Aqui foi criado um metodo sabonete que tem como parametro uma string texto que vai ajudar no processo abaixo
	public Sabonete (String texto) {
		// O split e um metodo que funciona apenas com strings e que basicamente quebra a string a partir de um caractere que voce escolher
		// Nesse caso a string sera quebrada na virgula
		String[]ArrayTeste1 = texto.split(",");
		// Aqui sera 'quebrada' no igual
		String[]ArrayTeste2 = ArrayTeste1[0].split("=");
		// Ja o metodo trim, tambem so se aplica a String e serve para remover espacos em branco no inicio ou no final do texto
		this.cheiro = ArrayTeste2[1].trim();
		
		// Aqui foram instanciados 3 objetos do tipo Array que vao receber uma linha e quebra-las de acordo com os caracteres passados
		// No caso foram 3 vezes, pois uma foi quebrar na virgula e as outras duas para quebrar apos receber o resultado das variaveis
		String[] ArrayTeste3 = ArrayTeste1[1].split("=");
		this.cor = ArrayTeste3[1].trim();
	}

	
}
