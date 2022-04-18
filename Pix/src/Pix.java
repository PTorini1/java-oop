import java.util.Scanner;

public class Pix {
	Scanner entrada = new Scanner(System.in);
	Cliente cliente = new Cliente();
	Main main = new Main();
	int valida = 0;

	void validar(String chave) {
		System.out.println("Escolha a chave para realizar a transação: ");
		System.out.println("1- CPF");
		System.out.println("2- Telefone");
		System.out.println("3- Email");
		System.out.println("4- chaveAl");

		valida = entrada.nextInt();

		if (this.valida == 1) {
			System.out.println("Digite seu CPF: ");
			String cpf = entrada.toString();
			if (cpf != cliente.cpf) {
				System.out.println("Seu CPF está errado favor digitar novamente");
			}
		} else if (this.valida == 2) {
			System.out.println("Digite seu Telefone: ");
			String telefone = entrada.toString();
			if (telefone != cliente.telefone) {
				System.out.println("Seu telefone está errado favor digitar novamente");
			}
		} else if (this.valida == 3) {
			System.out.println("Digite seu Email: ");
			String email = entrada.toString();
			if (email != cliente.email) {
				System.out.println("Seu telefone está errado favor digitar novamente");
			}
		} else if (this.valida == 4) {
			System.out.println("Digite sua Chave Aleatória: ");
			String chaveAl = entrada.toString();
			if (chaveAl != cliente.chaveAl) {
				System.out.println("Seu telefone está errado favor digitar novamente");
			}
		} else {
			System.out.println("Favor inserir um valor válido");
		}
	}

	void transferir() {
		cliente.saldo=;
	}

	void receber() {

	}
}
