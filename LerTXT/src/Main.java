import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		try(BufferedReader reader = new BufferedReader(new FileReader("entrada.txt"))){
			String line;
			String string="";
			
			while((line = reader.readLine()) != null) {
				string += line + "\n";
			}
			
			System.out.println(string);
			
		}
		
	Sabonete sabonete1 = new Sabonete("Azedo","Verde");
	String s = sabonete1.toString();
		
		String teste = "Sabonete: cheiro=Azedo, cor=Verde";
		Sabonete sabonete2 = new Sabonete(teste);
		
		System.out.println(sabonete2);
	}

}
