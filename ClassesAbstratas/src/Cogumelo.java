// A classe cogumelo extende de Item, ou seja, possui os mesmos metodos que ela
public class Cogumelo extends Item{
	//Sobrescrevendo metodo pegar da classe abstrata item
	@Override
	public void pegar() {
		System.out.println("Pegou Cogumelo");
	}
	
}
