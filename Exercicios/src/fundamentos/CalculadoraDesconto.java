package fundamentos;
import java.util.Scanner;

public class CalculadoraDesconto {

	public static void main(String[] args) {
		String produto;
		float preco;
		
		Scanner entrada = new Scanner(System.in);
		
			System.out.println("Produtos Muito Bons LTDA");
			System.out.println("Digite o nome do produto: ");
			produto = entrada.next();
			System.out.println("Digite o valor do produto em reais: ");
			preco = entrada.nextInt();
			
			System.out.println("O produto " + produto + " custa " + preco + " ,mas com o desconto de 10% o preco final e de " + (preco*0.9));

	}

}
