import java.util.Scanner;

public class Venda {

	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);
		
		String p1;
		String p2;
		double v1;
		double v2;
		double total;
		double desconto;
		
		
		System.out.println("Escolha o produto desejado ");
		p1 = valor.next();
		
		System.out.println("Escolha o produto desejado ");
		p2 = valor.next();
		
		System.out.println("Digite o valor do produto 1 ");
		v1 = valor.nextDouble();
		
		System.out.println("Digite o valor do produto 2 ");
		v2 = valor.nextDouble();
		
		total=v1+v2;
		desconto=total*0.85;
		
		System.out.println("O valor total dos produtos com o desconto de 15% é: " + desconto);
	}

}
