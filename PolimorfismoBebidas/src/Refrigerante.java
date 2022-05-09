
public class Refrigerante extends Bebida{

	public Refrigerante(String nome, boolean aquecer) {
		super(nome, aquecer);
	}

	@Override
	public void preparar() {
		super.preparar();
		System.out.println("Colocando gelo no copo");
		System.out.println("Colocando o refrigerante no copo");
		
	}
	
}
