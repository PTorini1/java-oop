// A classe fusca implementou apenas a interface carro  e nao implementou a itemCaro, pois fusca nao e um item caro
public class Fusca implements Carro {

	// Os metodos virarEsquerda, direira e acelerar foram sobrescritos
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
