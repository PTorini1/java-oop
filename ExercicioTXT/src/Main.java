// Importando classes do Java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);
		String texto;
		
		System.out.println("Digite um texto aleatório");
		texto = entrada.nextLine()+"\n"; 
		System.out.println("Digite mais um texto aleatório");
		texto += entrada.nextLine(); 
		entrada.close();
		
		// O try serve para tentar executar um codigo, e usado quando o codigo pode danificar um arquivo
		// Caso de algum erro ele nao termina de executar o codigo e nada e perdido
		// O BufferedWrite e um metodo do proprio Java para escrever em arquivos de texto
		// Nesse caso foi instanciado o objeto escrever do tipo Buffered que virou um arquivo de texto
		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("texto.txt"))){
			// O arquivo recebe o texto digitado pelo usuario na variavel texto, declarada no inicio do codigo
			escrever.write(texto);
		}
		
		// Ja o BufferedReader serve para ler um arquivo de texto
		try(BufferedReader ler = new BufferedReader(new FileReader("texto.txt"))){
			// Foram declaradas duas strings para auxiliar a ler linha do arquivo
			String line;
			String string="";
			// O codigo abaixo representa que enquanto uma linha tiver conteudo ele vai ler a linha e pular um espaco para a proxima
			while((line = ler.readLine()) != null) {
				 string = string + "\n" + line;
			}
			//Exibindo o conteudo do texto na tela
			System.out.println(string);
		}
	}

}
