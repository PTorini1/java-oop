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

		List<String> listaSabonetes = new ArrayList<String>();
		Object arraySabonetes[] = new Object[3];
		for (int sab = 0; sab < arraySabonetes.length; sab++) {
			Sabonete sabonete1 = new Sabonete(null, null);
			System.out.println("Digite a cor do sabonete");
			sabonete1.setCor(entrada.next());
			System.out.println("Digite o cheiro do sabonete");
			sabonete1.setCheiro(entrada.next());
			listaSabonetes.add(sabonete1.toString());
		}

		try (BufferedWriter sabonete = new BufferedWriter(new FileWriter("sabonete.txt"))) {
			for (String sab : listaSabonetes) {
				sabonete.write(sab+"\n");
			}
		}
		
		List<String>listaSabonetes2 = new ArrayList<String>();
		
		try(BufferedReader reader = new BufferedReader(new FileReader("sabonete.txt"))){
			String line;
			
			while((line = reader.readLine()) != null) {
				Sabonete sabonete2 = new Sabonete(line);
				listaSabonetes2.add(sabonete2.toString());
			}	
			
			for (String sab : listaSabonetes2) {
				System.out.println(sab);
			}
			
			
		}
		
		
		
		
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