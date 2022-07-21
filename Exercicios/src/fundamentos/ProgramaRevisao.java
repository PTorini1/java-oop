package fundamentos;
import java.util.Scanner;

public class ProgramaRevisao {

	public static void main(String[] args) {
		String nome;
		String nome2;
		int cpf;
		int cpf2;
		float salario;
		float salario2;
		
		Scanner entrada = new Scanner(System.in);

			System.out.println("Alimentos Gostosos e Muito Bons LTDA");
			System.out.println("Digite seu nome: ");
			nome = entrada.next();
			System.out.println("Digite seu CPF");
			cpf = entrada.nextInt();
			System.out.println("Digite seu salario");
			salario = entrada.nextFloat();
			
			System.out.println("Alimentos Gostosos e Muito Bons LTDA");
			System.out.println("Digite seu nome: ");
			nome2 = entrada.next();
			System.out.println("Digite seu CPF");
			cpf2 = entrada.nextInt();
			System.out.println("Digite seu salario");
			salario2 = entrada.nextFloat();
			
			System.out.println("A diferença de salario entre " + nome + " e " + nome2 + " e igual a: " + (salario-salario2));
		
	}

}
