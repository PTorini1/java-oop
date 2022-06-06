// Aqui foi usado o extends foi a classe ContaCorrente herda os metodos de conta bancaria
public class ContaCorrente extends ContaBancaria{
	// Atributo privado do saldo da conta
	// E privado pois outras classes nao podem interagir com essa informacao
	private double saldo = ContaBancaria.getSaldo();

	// metodo para setar o valor do saldo
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	// Aqui foi pego o metodo depositar e sacar da classe conta bancaria
	@Override	
	public void depositar(double valor) {
		saldo +=valor;
	}

	@Override
	public void sacar(double valor) {
		saldo -=valor;
	}

	// Aqui o metodo calcular saldo foi sobrescrito pois a conta corrente da um desconto de 10% no final
	@Override
	public double CalcularSaldo() {
		return saldo-(saldo*0.10);
	}
}
