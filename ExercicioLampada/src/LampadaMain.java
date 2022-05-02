import java.util.Scanner;

public class LampadaMain {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int criar = 0;
		int estado = 0;

		System.out.println("Olá seja bem-vindo ao nosso sistema de criação de lâmpadas \n");
		System.out.println("Pressione 1 para criar uma lâmpada");
		criar = entrada.nextInt();
		if (criar != 1) {
			System.out.println("Obrigado por usar nosso sistema");

		} else {

			Lampada lampada = new Lampada(true);

			System.out.println("Quando a lâmpada é criada, ela já vem acesa");
			System.out.println("Deseja mudar o estado da lâmpada? 1- Sim  2-Não\n");
			estado = entrada.nextInt();
			if (estado != 1) {
				lampada.imprimir();
			} else {
				lampada.desligar();
				lampada.imprimir();
			}
		}
	}
}
