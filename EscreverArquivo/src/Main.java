// Importando classes do java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);
		
		// Aqui foi instanciada uma lista do tipo String 
		List<String> listaSabonetes = new ArrayList<String>();
		// Aqui foi criada uma matriz do tipo Object 
		Object arraySabonetes[] = new Object[3];
		// O metodo for aqui foi usado para representar que a variavel sab vai receber 1 ate seu valor ser 3
		for (int sab = 0; sab < arraySabonetes.length; sab++) {
			// Menu para interagir com o usuario
			Sabonete sabonete1 = new Sabonete(null, null);
			System.out.println("Digite a cor do sabonete");
			sabonete1.setCor(entrada.next());
			System.out.println("Digite o cheiro do sabonete");
			sabonete1.setCheiro(entrada.next());
			listaSabonetes.add(sabonete1.toString());
		}

		// Aqui o try foi usado para tentar escrever um arquivo txt usando o Buffered Writer
		// O try e usado, pois se der erro no meio do processo o arqquivo nao sera corrompido
		try (BufferedWriter sabonete = new BufferedWriter(new FileWriter("sabonete.txt"))) {
			// Enhanced for para mostrar a lista de sabonetes de na tela
			for (String sab : listaSabonetes) {
				sabonete.write(sab+"\n");
			}
		}
		
		// Aqui foi criada outra lista do tipo String 
		List<String>listaSabonetes2 = new ArrayList<String>();
		
		// Dessa vez essa lista ler um arquivo
		// O metodo usado foi o BufferedReader
		try(BufferedReader reader = new BufferedReader(new FileReader("sabonete.txt"))){
			// Instanciando a variavel line do tipo String
			String line;
			
			// Aqui diz que enquanto houver uma linha a lista sera lida 
			// Para isso foi usado o metodo readLine
			while((line = reader.readLine()) != null) {
				Sabonete sabonete2 = new Sabonete(line);
				listaSabonetes2.add(sabonete2.toString());
			}	
			
			// Aqui a lista e mostrada na tela com o enhanced for
			for (String sab : listaSabonetes2) {
				System.out.println(sab);
			}
			
			
		}
		
		
		// Aqui em baixo foi outro metodo mostrado para escrever um arquivo
		
//		String s = "Texto para ser gravado \n no arquivo eeeeeee";
//		FILEWRITER aponta o arquivo no computador
//		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("saida.txt"))) {
//			escrever.write(s);
//		}
	}

}

/*Outra forma de fazer
 * 
 * Sabonete sabonete1 = new Sabonete();
 * Sabonete sabonete2 = new Sabonete();
 * Sabonete sabonete3 = new Sabonete();
 * 
 * List<Sabonete> listadeSabonetes = new ArrayList<Sabonete>();
 * 
 * listaDeSabonetes.add(sabonete1);
 * listaDeSabonetes.add(sabonete2);
 * listaDeSabonetes.add(sabonete3);
 * 
 * try(BufferedWriter escrever = new Buffered Writer(new FileWriter("saida.txt"))){
 * 		escrever.write(sabonete.toString());
 * 	}
*/