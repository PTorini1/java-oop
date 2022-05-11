
public class Aplicacao {

	public static void main(String[] args) {
		
//		Rota rota = new Rota();
		Ferrari ferrari = new Ferrari();
//		Fusca fusca = new Fusca();
//		rota.ir(ferrari);
//		rota.ir(fusca);
//		System.out.println("---------------------");
		//Automovel automovel = new Automovel();
		
//		Automovel automovel = new Ferrari();
//		rota.ir(automovel);
//		automovel = new Fusca();
//		rota.ir(automovel);
//		System.out.println("---------------------");
	
		Vendedor vendedor = new Vendedor();
		Apartamento apartamento = new Apartamento();
		
		vendedor.mostrarPreco(apartamento);
		vendedor.mostrarPreco(ferrari);
	}

}
