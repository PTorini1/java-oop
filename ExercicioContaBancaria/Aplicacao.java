
public class Aplicacao {

	public static void main(String[] args) {

		// Aqui foram instanciados os objetos do tipo ContaCorrente e ContaBancaria
		// Os objetos servem para poderermos interagir com as outras classes
		ContaBancaria ContaCorrente = new ContaCorrente();
		ContaBancaria ContaInvestimento = new ContaInvestimento();
		
		// Interagindo com o cliente
		System.out.printf("O saldo na conta corrente � equivalente a: R$%.2f%n", ContaCorrente.CalcularSaldo());
		System.out.printf("O saldo na conta investimento � equivalente a: R$%.2f%n%n", ContaInvestimento.CalcularSaldo());
		
		// Atribuindo valores para ele depositar
		ContaCorrente.depositar(200);
		ContaInvestimento.depositar(200);
		System.out.printf("O saldo na conta corrente � equivalente a: R$%.2f%n", ContaCorrente.CalcularSaldo());
		System.out.printf("O saldo na conta investimento � equivalente a: R$%.2f%n%n", ContaInvestimento.CalcularSaldo());
		
		// Atribuindo valores para o cliente sacar
		ContaCorrente.sacar(100);
		ContaInvestimento.sacar(100);
		System.out.printf("O saldo na conta corrente � equivalente a: R$%.2f%n", ContaCorrente.CalcularSaldo());
		System.out.printf("O saldo na conta investimento � equivalente a: R$%.2f%n%n", ContaInvestimento.CalcularSaldo());
		
		// Atribuindo valor para transferir e atribuindo parametro ContaCorrente a fim de realizar transferencia
		ContaInvestimento.transferir(200, ContaCorrente);
		System.out.printf("O saldo na conta corrente � equivalente a: R$%.2f%n", ContaCorrente.CalcularSaldo());
		System.out.printf("O saldo na conta investimento � equivalente a: R$%.2f%n%n", ContaInvestimento.CalcularSaldo());
	}

}
