
public class ContaBancaria {
	
	private int numConta;
	private boolean ativo;
	private double saldo;
	
//	public ContaBancaria() {
//		ativo = true;
//		saldo = 1.0;
//		numConta = 1234;
//	}
	
	public ContaBancaria(boolean ativo, double saldo) { //Overflow ou Sobrecarga de métodos
		this.ativo = ativo;
		this.saldo = saldo;
	}



	public void receber(double valor) {	
		System.out.println("Você acaba de receber "+ valor);
		saldo += valor;	
	}
	
	public void transferir(double valor) {
		if (valor > saldo) {
			System.out.println("Você não pode realizar a transferência de "+ valor +" reais por falta de saldo");
		}else {
			saldo -= valor;
			System.out.println("Você acaba de tranferir " + valor+" reais");
		}	
	}
	
	public double saldo() {
		return saldo; 		
	}
}
