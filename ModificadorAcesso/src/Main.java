
public class Main {

	public static void main(String[] args) {
	
		ContaBancaria conta1 = new ContaBancaria(true, 3.0); //new ContaBancaria(); = Construtor // conta1 = variável
		ContaBancaria conta2 = new ContaBancaria(true, 5.0);
		
//		conta1.ativo = true;
//		conta1.numConta = 1234;
//		conta1.saldo = 100.50;
//		
//		System.out.println(conta1.ativo);
//		System.out.println(conta1.numConta);
//		System.out.println(conta1.saldo);
		
		System.out.println("Conta 1 \n");
		conta1.receber(100.8);
		System.out.println("O saldo da conta 1 agora é de "+conta1.saldo()+" reais \n");
		conta1.transferir(30);
		System.out.println("O saldo da conta 1 agora é de "+ conta1.saldo()+" reais \n");
		
		System.out.println("Conta 2 \n");
		conta2.receber(200);
		System.out.println("O saldo da conta 2 agora é de "+conta2.saldo()+" reais \n");
		conta2.transferir(400);
		System.out.println("O saldo da conta 2 agora é de "+ conta2.saldo()+" reais \n");
	}

}
