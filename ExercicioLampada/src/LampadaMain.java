import java.util.Scanner;

public class LampadaMain {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		// 	criando variaveis
		int criar = 0;
		int estado = 0;

		// Interacao com o cliente
		System.out.println("Olá seja bem-vindo ao nosso sistema de criação de lâmpadas \n");
		System.out.println("Pressione 1 para criar uma lâmpada");
		criar = entrada.nextInt();
		// Se quiser ele digitar algo nada a ver o sistema encerra
		if (criar != 1) {
			System.out.println("Obrigado por usar nosso sistema");

		} else {
			// Instanciando o objeto do tipo lampada e passando como para parametro sua booloean como true
			Lampada lampada = new Lampada(true);

			System.out.println("Quando a lâmpada é criada, ela já vem acesa");
			System.out.println("Deseja mudar o estado da lâmpada? 1- Sim  2-Não\n");
			estado = entrada.nextInt();
			// if para imprimir o estado da lampada ou desligar de acordo com o que o usuario quiser
			if (estado != 1) {
				lampada.imprimir();
			} else {
				lampada.desligar();
				lampada.imprimir();
			}
		}
	}
}
