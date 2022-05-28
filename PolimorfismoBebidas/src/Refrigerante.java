
public class Refrigerante extends Bebida{
	
	// Metodo para chamar o refrigerante da classe principal e herdar os atributos de bebida
	public Refrigerante(String nome, boolean aquecer) {
		super(nome, aquecer);
	}

	// Metodo Generico herdado da classe bebida com caracteristicas a mais adionadas apenas para o refrigerante
	@Override
	public void preparar() {
		super.preparar();
		System.out.println("Colocando gelo no copo");
		System.out.println("Colocando o refrigerante no copo");
		
	}
	
}
