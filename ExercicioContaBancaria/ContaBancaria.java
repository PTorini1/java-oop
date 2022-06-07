// Classe abstrata que vai servir de modelo para conta corrente e conta investimento
public abstract class ContaBancaria {
	// Atributo da classe
	protected static double saldo = 1000;

	// Metodo get e set do atributo
	public static double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		ContaBancaria.saldo = saldo;
	}

	// Metodos depositar, sacar e transferir que vao ser herdados das classes que extenderem de ContaBancaria
	public void depositar(double valor){
		saldo +=valor;
	}
	
	public void sacar(double valor){
		saldo -= valor;
	}
	
	public void transferir(double valor, ContaBancaria conta){
		saldo -= valor;
		conta.depositar(valor);
	}
	
	public abstract double CalcularSaldo();
}
