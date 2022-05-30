
public class Aplicacao {

	public static void main(String[] args) {
		// Classe principal para mostrar o que esta nas classes criadas, aqui so foram instanciados objetos para visualizacao dos conceitos de interface
		Rota rota = new Rota();
		Ferrari ferrari = new Ferrari();
		Fusca fusca = new Fusca();
		//Aqui foi chamado a variavel o metodo ir da classe rota que passa como parametro uma variavel do tipo ferrari
		rota.ir(ferrari);
		//Aqui foi chamado a variavel o metodo ir da classe rota que passa como parametro uma variavel do tipo fusca
		rota.ir(fusca);
		System.out.println("---------------------");
		Automovel automovel = new Automovel();
		
		// Aqui nao foi necessario estanciar outra variavel automovel
		// Como a classe Ferrari tambem implementa automovel, posso implementar ela direto
		Automovel automovel = new Ferrari();
		rota.ir(automovel);
		automovel = new Fusca();
		rota.ir(automovel);
		System.out.println("---------------------");
		
		// Instanciando objetos
		Vendedor vendedor = new Vendedor();
		Apartamento apartamento = new Apartamento();
		
		vendedor.mostrarPreco(apartamento);
		vendedor.mostrarPreco(ferrari);
	}

}
