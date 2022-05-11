
public class Fusca implements Carro {

	@Override
	public void virarEsquerda() {
		System.out.println("Fusca virou a esquerda");
	}

	@Override
	public void virarDireita() {
		System.out.println("Fusca virou a direita");
		
	}

	@Override
	public void acelerar() {
		System.out.println("Fusca acelerou");
		
	}

	@Override
	public void abrirPorta() {
		System.out.println("A porta foi aberta");
		
	}
	
}
