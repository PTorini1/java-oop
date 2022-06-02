// Aqui foram importados classes do java que serao utilizadas
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	// As classes chamadas no final do metodo main servem para tratar excecoes, pois como vamos tratar arquivos e bom ter esse cuidado e o proprio Java
	// te obriga a chamar essas classes
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// O try vai tentar ler o arquivo por meio do BufferedReader
		// E bom usar o try, pois caso de problema ele volta sem danificar o arquivo
		try(BufferedReader reader = new BufferedReader(new FileReader("entrada.txt"))){
			// A string line foi definida para receber uma linha no arquivo txt
			// A line vai receber um texto e mostrar na tela
			String line;
			// Essa string aqui vai receber o conteudo da line dar um \n para separar o conteudo e nao misturar tudo
			String string="";
			
			// Aqui tem um while para mostrar que enquanto estiver com conteudo, a line vai receber um valor de texto
			while((line = reader.readLine()) != null) {
				string += line + "\n";
			}
			
			//Aqui mostra na tela o que ela obteve
			System.out.println(string);
			
		}
	// Aqui foi instanciado um objeto sabonete1 com os atributos dentro dele	
	Sabonete sabonete1 = new Sabonete("Azedo","Verde");
	// Aqui foi chamado o toString
	String s = sabonete1.toString();
		//Aqui foi chamada uma String que recebe os atributos do sabonete
		String teste = "Sabonete: cheiro=Azedo, cor=Verde";
		// Aqui foi instanciado um sabonete2 que vai receber como parametro a variavel teste que criamos
		Sabonete sabonete2 = new Sabonete(teste);
		// Aqui serve para mostrar na tela que o codigo acima funciona
		System.out.println(sabonete2);
	}

}
