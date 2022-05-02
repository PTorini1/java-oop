
public class Main {

	public static void main(String[] args) {
	
//		ContaBancaria conta1 = new ContaBancaria(true, 3.0); //new ContaBancaria(); = Construtor // conta1 = variável
//		ContaBancaria conta2 = new ContaBancaria(true, 5.0);
//		
//		conta1.ativo = true;
//		conta1.numConta = 1234;
//		conta1.saldo = 100.50;
//		
//		System.out.println(conta1.ativo);
//		System.out.println(conta1.numConta);
//		System.out.println(conta1.saldo);
//		
//		System.out.println("Conta 1 \n");
//		conta1.receber(100.8);
//		System.out.println("O saldo da conta 1 agora é de "+conta1.saldo()+" reais \n");
//		conta1.transferir(30);
//		System.out.println("O saldo da conta 1 agora é de "+ conta1.saldo()+" reais \n");
//		
//		System.out.println("Conta 2 \n");
//		conta2.receber(200);
//		System.out.println("O saldo da conta 2 agora é de "+conta2.saldo()+" reais \n");
//		conta2.transferir(400);
//		System.out.println("O saldo da conta 2 agora é de "+ conta2.saldo()+" reais \n");
//		
		Cliente cliente = new Cliente();
		
		cliente.setNome("Pedro");
		cliente.setCpf(121);
		cliente.setNumConta(5546543);
		
		System.out.println(cliente);
		
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Pedro");
		cliente2.setCpf(121);
		cliente2.setNumConta(5546543);
		
//		cliente2 = cliente;
		System.out.println(cliente2);	
		
//		if(cliente.getNome() == cliente2.getNome()) {
//			System.out.println("O nome é igual \n");
//		} else {
//			System.out.println("O nome é diferente \n");
//		}
//		
		if(cliente.equals(cliente2)) {
			System.out.println("Os dados são iguais");
		}else {
			System.out.println("Os dados são diferentes");
		}
		
//		if(cliente == cliente2) {
//			System.out.println("Os objetos são iguais");
//		} else {
//			System.out.println("Os objetos são diferentes");
//		}

	}

}
