import java.util.Scanner;

public class Pix {
	Scanner entrada = new Scanner (System.in);
		int cpf=0;
		int telefone=0;
		String email="";
		String chaveAl="";
		int valida=0;
		
		void transferir(String chave) {
			System.out.println("Escolha a chave para realizar a transação: ");
			System.out.println("1- CPF");
			System.out.println("2- Telefone");
			System.out.println("3- Saldo");
			System.out.println("4- chaveAl");
			valida = entrada.nextInt(); 
		if(this.valida == 1) {
			System.out.println("Digite seu CPF: ");
			int cpf= entrada.nextInt();
		}
			
		}
		
		void receber(String chave) {
			
		}
	}
