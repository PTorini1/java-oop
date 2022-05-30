// Nessa caso foi necessario extender duas interfaces, pois a classe Ferrari possui metodos que serao usados das duas
public class Ferrari implements Automovel, ItemCaro{

	// O metodo da classe automovel foi sobrescrito para se adequar a Ferrari, isso aconteceu com os metodos virarEsquerda, virarDireita e acelerar
	@Override
	public void virarEsquerda() {
		System.out.println("Ferrari virou a esquerda");
		
	}

	@Override
	public void virarDireita() {
		System.out.println("Ferrari virou a direita");
		
	}

	@Override
	public void acelerar() {
		System.out.println("Ferrari acelerou");
		
	}
	
	// Aqui o metodo getPreco da classe ItemCaro foi sobrescrito
	@Override
	public double getPreco() {
		return 1000000;
	}
	
}
