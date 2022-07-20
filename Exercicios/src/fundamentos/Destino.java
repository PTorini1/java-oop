package fundamentos;
import java.util.Scanner;

public class Destino {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		CalculaDistancia calcula = new CalculaDistancia();
		
		System.out.println("Selecione seu destino:");
		System.out.println("1 - Rio de Janeiro");
		System.out.println("2 - Salvador");
		System.out.println("3 - Orlando");
		calcula.setDestino(entrada.nextInt()); 
		
		calcula.CalcularDistancia();
		
	}

}
