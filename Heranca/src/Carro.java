
public class Carro extends Veiculo { //Extends coloca a classe como filha
	// Variavel 
	private boolean quatroPortas;
	
	// Aqui sobrescrevemos o metodo Imprimir, pois o carro possui uma variavel a mais que os outros nao vao ter
	@Override
	public void Imprimir() {
		// super herda todo o codigo que esta dentro do metodo imprimir 
		super.Imprimir();
		// aqui foi adicionado algo a mais que no caso e a definicao se o carro tem ou nao quatro portas
		System.out.println("Tem quatro portas? " + quatroPortas);
	}

	//getter e setter do boolean quatroPortas
	public boolean isQuatroPortas() {
		return quatroPortas;
	}

	public void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas = quatroPortas;
	}
	
	
}
