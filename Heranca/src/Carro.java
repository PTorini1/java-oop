
public class Carro extends Veiculo { //Extends coloca a classe como filha
	private boolean quatroPortas;

	@Override
	public void Imprimir() {
		super.Imprimir();
		System.out.println("Tem quatro portas? " + quatroPortas);
	}

	public boolean isQuatroPortas() {
		return quatroPortas;
	}

	public void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas = quatroPortas;
	}
	
	
}
