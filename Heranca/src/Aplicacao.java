
public class Aplicacao {

	public static void main(String[] args) {
		// Aqui foi instanciado um novo objeto veiculo
		// Com esse objeto eu consigo setar os atributos criados na classe veiculo
		Veiculo veiculo = new Veiculo();
		
		veiculo.setMarca("Chelovrete");
		veiculo.setModelo("Celta");
		veiculo.setAno(2012);
		veiculo.Imprimir();
		veiculo.Buzinar();
		System.out.println("-------------------");
		
		// Aqui foi instanciado um novo objeto carro
		Carro carro = new Carro();
		// Como carro tambem e um veiculo, nao ha necessidade de instanciar outro objeto do tipo veiculo pois como ele herda de veiculo, herda tambem seus m
		// metodos e atributos. A mesma coisa vale para a moto e o caminhao
		carro.setMarca("Hyundai");
		carro.setModelo("Gol");
		carro.setAno(2030);
		carro.setQuatroPortas(true);
		carro.Imprimir();
		carro.Buzinar();
		System.out.println("-------------------");
		
		Caminhao caminhao = new Caminhao();
		caminhao.setMarca("Scania");
		caminhao.setModelo("Grandão");
		caminhao.setAno(2009);
		caminhao.Imprimir();
		caminhao.Buzinar();
		System.out.println("-------------------");
		
		Moto moto = new Moto();
		moto.setMarca("Kawasaki");
		moto.setModelo("Ninja");
		moto.setAno(2015);
		moto.Imprimir();
		moto.empinar();
		System.out.println("-------------------");
		
		
	}

}
