import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Importa Biblioteca
		Scanner entrada = new Scanner(System.in);

		// Declara a variável valor para fazer a transação do pix
		float valor = 0;

		// Chama as classes
		Cliente cliente = new Cliente();
		Pix pix = new Pix();

		// Execução do programa
		System.out.println("Insira a quantia que você deseja dar: ");
		valor = entrada.nextFloat();

	}

}
