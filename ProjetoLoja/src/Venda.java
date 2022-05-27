//Aqui foi importada a classe Scanner
import java.util.Scanner;

public class Venda {

	public static void main(String[] args) {
		// Aqui foi instancia a variavel valor do tipo Scanner. A classe Scanner serve para permitir que o usuario interaja com o console
		Scanner valor = new Scanner(System.in);
		
		// Criacao dos atributos da classe
		String p1;
		String p2;
		double v1;
		double v2;
		double total;
		double desconto;
		
		// Interagindo com o usuario por meio da classe scanner
		System.out.println("Escolha o produto desejado ");
		// O comando next() é da classe Scanner e aceita uma String como resposta
		p1 = valor.next();
		
		System.out.println("Escolha o produto desejado ");
		p2 = valor.next();
		
		System.out.println("Digite o valor do produto 1 ");
		// O comando double() é da classe Scanner e aceita uma String como resposta
		v1 = valor.nextDouble();
		
		System.out.println("Digite o valor do produto 2 ");
		v2 = valor.nextDouble();
		
		// Calculo do valor que o usuario inseriu
		total=v1+v2;
		// Calculo de desconto de 15%
		desconto=total*0.85;
		
		// Mensagem Final
		System.out.println("O valor total dos produtos com o desconto de 15% é: " + desconto);
	}

}
