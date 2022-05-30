// A classe fusca implementou apenas a interface carro  e nao implementou a itemCaro, pois fusca nao e um item caro
// Nao foi necessario implementar a classe automovel, pois a interface Carro ja implementa automovel, entao vem os metodos das duas
public class Fusca implements Carro {

	// Os metodos virarEsquerda, direira, acelerar e abrirPorta foram sobrescritos
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
