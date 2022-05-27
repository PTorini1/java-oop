// Importanto classe Scanner
import java.util.Scanner;

public class Venda2 {

	public static void main(String[] args) {
			// Projeto Loja 2
			// A classe Scanner e usada para interagir com o usuario e permitir que ele possa colocar suas proprias respostas no console ao inves
			// de so pegar respostas pre-determinadas. Aqui foi instanciada a variavel valor do tipo Scanner
			Scanner valor = new Scanner(System.in);
			
			// Criacao de atributos 
			String nomeProduto;
			String nomeProduto2;
			int p1;
			int p2;
			double v1;
			double v2;
			double total;
			double desconto;
			int continua=1;
			
			// Comando while que serve para indicar que enquanto a variavel continua for igual a 1, ele vai repetir esse comando ate que a variavel
			// continua seja diferente de 1
			while(continua==1) {
			nomeProduto="";
			nomeProduto2="";
			System.out.println("\nRoupas Boladas");
			System.out.println("Escolha a roupa desejada");
			System.out.println("1- Camisa  ");
			System.out.println("2- Camiseta");
			System.out.println("3- Calça   ");
			System.out.println("4- Tênis   ");
			
			// Escolha do primeiro produto
			System.out.println("\n Escolha o produto 1");
			p1=valor.nextInt();
			
			// Condicao if para permitir que o usuario digite apenas as opcoes disponiveis
			if(p1 != 1 && p1 != 2 && p1 != 3 && p1 != 4) {
				System.out.println("O produto escolhido não está disponível em nossa loja");
			}
			
			// Escolha do segundo produto
			System.out.println("Escolha o produto 2");
			p2=valor.nextInt();
			
			// Condicao if para permitir que o usuario digite apenas as opcoes disponiveis
			if(p2 != 1 && p2 != 2 && p2 != 3 && p2 != 4) {
				System.out.println("O produto escolhido não está disponível em nossa loja\n");
			}
			
			// Condicao para atribuir nome ao produto de acordo com o que o usuario digitar
			if(p1 ==1) {
				nomeProduto="Camisa";
			} else if(p1 == 2) {
				nomeProduto="Camiseta";
			} else if(p1 == 3) {
				nomeProduto="Calça";
			} else if(p1 == 4) {
				nomeProduto="Tênis";
			}
			
			// Condicao para atribuir nome ao produto de acordo com o que o usuario digitar
			if(p2 ==1) {
				nomeProduto2="Camisa";
			} else if(p2 == 2) {
				nomeProduto2="Camiseta";
			} else if(p2 == 3) {
				nomeProduto2="Calça";
			} else if(p2 == 4) {
				nomeProduto2="Tênis";
			}
			
			// Escolher o valor do produto 1
			System.out.println("Digite o valor do produto 1");
			v1 = valor.nextDouble();
			
			// Escolher o valor do produto 2
			System.out.println("Digite o valor do produto 2 ");
			v2 = valor.nextDouble();
			
			// Calculo do total
			total=v1+v2;
			// Calculo de desconto
			desconto=v1+v2;
			
			// Condicao de desconto caso o produto escolhido seja calca
			if(p1 == 3 || p2==3) {
				desconto=total*0.85;
				System.out.println("Como você escolheu calça como um dos produtos você terá um desconto de 15% \n");
			}
			
			// Mensagem Final	
			System.out.println("O valor total dos produtos "+nomeProduto+" e "+nomeProduto2+ " é: " + desconto);
			
			// Validacao para saber se o usuario gostaria de continuar comprando
			System.out.println("\n Deseja fazer uma nova compra? 1- Sim 2-Não\n");
			continua=valor.nextInt();
			
			// Caso o usuario queira, a variavel continua fica igual a 1 e volta para o inicio do codigo por conta do laco de repeticao while
			if(continua != 1){
				System.out.println("Obrigado pela preferência!");
			}
			}
	}

}
