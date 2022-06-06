// Aqui foi usado o extends foi a classe ContaInvestimento herda os metodos de conta bancaria
public class ContaInvestimento extends ContaBancaria{
	// Atributo privado do saldo da conta
	// E privado pois outras classes nao podem interagir com essa informaca
		private double saldo = 0;
		
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

		// Aqui o metodo calcular saldo foi sobrescrito pois a conta corrente da um desconto de 5% no final
		@Override
		public double CalcularSaldo() {
			return saldo+(saldo*0.05);
		}
}
