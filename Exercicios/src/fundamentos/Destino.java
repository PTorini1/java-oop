package fundamentos;
import java.util.Scanner;

public class Destino {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		CalculaDistancia calcula = new CalculaDistancia();
		
		System.out.println("Digite seu nome:");
		calcula.setNome(entrada.next());
		
		System.out.println("Digite sua idade");
		calcula.setIdade(entrada.nextInt());
		
		System.out.println("Escolha seu sexo:");
		
		int opcao = 0;
		do {
			System.out.println("Digite seu sexo: 1-Masculino  2-Feminino");
			opcao = entrada.nextInt();

			if (opcao == 2) {
				calcula.setSexo(Sexo.FEMININO);
			} else if (opcao == 1) {
				calcula.setSexo(Sexo.MASCULINO);
			}

		} while (opcao != 1 && opcao != 2);
		
		System.out.println("Selecione seu destino:");
		System.out.println("1 - Rio de Janeiro");
		System.out.println("2 - Salvador");
		System.out.println("3 - Orlando");
		calcula.setDestino(entrada.nextInt());
		calcula.CalcularDistancia();
		
		System.out.println("Escolha quantos dias deseja ficar:");
		calcula.setDias(entrada.nextInt());
		calcula.CalcularPreco();
		
		System.out.println(calcula.toString());
	}

}
