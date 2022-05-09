
public class LeiteQuente extends Bebida{
	
	public LeiteQuente() {
		super("Leite Quente", true);	
	}

	@Override
	public void preparar() {
		super.preparar();
		System.out.println("Colocando o leite no copo");
	}

	
}
