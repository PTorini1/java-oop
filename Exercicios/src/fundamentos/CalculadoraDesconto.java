package fundamentos;
import java.util.Scanner;

public class CalculadoraDesconto {

	public static void main(String[] args) {
		int produto;
		float preco;
		float desconto;
		String showDesconto;
		String nomeProduto="";
		
		Scanner entrada = new Scanner(System.in);
		do {
			System.out.println("Produtos Muito Bons LTDA");
			System.out.println("Escolha o produto desejado: ");
			System.out.println("1 - Mochila ");
			System.out.println("2 - Camisa ");
			System.out.println("3 - Blusa ");
			System.out.println("4 - Calca");
			produto = entrada.nextInt();
		} while (produto != 1 && produto != 2 && produto != 3 && produto != 4);	
			System.out.println("Digite o valor do produto em reais: ");
			preco = entrada.nextFloat();
			
			switch (produto) {
			case 1:
				desconto = (float) 0.9;
				showDesconto = "10%";
				nomeProduto = "Mochila";
				break;
			case 2:
				desconto = (float) 0.95;
				showDesconto = "5%";
				nomeProduto = "Camisa";
				break;
			case 3:
				desconto = (float) 0.85;
				showDesconto = "15%";
				nomeProduto = "Blusa";
				break;
			case 4:
				desconto = (float) 0.93;
				showDesconto = "7%";
				nomeProduto = "Calca";
				break;
			default:
				desconto = 0;
				showDesconto = "Produto inexistente";
			}
			System.out.println("O produto " + nomeProduto + " custa " + preco + ", mas com o desconto de " + showDesconto + " o preco final e de " + (preco*desconto));

	}

}
