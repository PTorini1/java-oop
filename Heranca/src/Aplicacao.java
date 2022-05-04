
public class Aplicacao {

	public static void main(String[] args) {
		Veiculo veiculo = new Veiculo();
		
		veiculo.setMarca("Chelovrete");
		veiculo.setModelo("Celta");
		veiculo.setAno(2012);
		veiculo.Imprimir();
		veiculo.Buzinar();
		System.out.println("-------------------");
		
		Carro carro = new Carro();
		
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
