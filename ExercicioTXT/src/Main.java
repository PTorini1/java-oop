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
		
		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("texto.txt"))){
			escrever.write(texto);
		}
		
		try(BufferedReader ler = new BufferedReader(new FileReader("texto.txt"))){
			String line;
			String string="";
			while((line = ler.readLine()) != null) {
				 string = string + "\n" + line;
			}
			
			System.out.println(string);
		}
	}

}
