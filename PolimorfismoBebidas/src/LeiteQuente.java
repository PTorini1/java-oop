
public class LeiteQuente extends Bebida{
	
	// O super serve para indicar que esta sendo puxado um metodo de outra classe. Nesse caso da Main
	public LeiteQuente() {
		super("Leite Quente", true);	
	}

	// Aqui foi pego um metodo generico da classe Bebida e adicionado mais um codigo especifico da classe LeiteQuente 
	@Override
	public void preparar() {
		super.preparar();
		System.out.println("Colocando o leite no copo");
	}

	
}
