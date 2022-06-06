
public class ContaCorrente extends ContaBancaria{

	private double saldo = ContaBancaria.getSaldo();

	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	@Override	
	public void depositar(double valor) {
		saldo +=valor;
	}

	@Override
	public void sacar(double valor) {
		saldo -=valor;
	}


	@Override
	public double CalcularSaldo() {
		return saldo-(saldo*0.10);
	}
}
