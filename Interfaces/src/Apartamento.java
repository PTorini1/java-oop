
public class Apartamento implements ItemCaro {
	// A classe apartamento faz parte de item caro
	// Por isso herdou o metodo getPreco, mas possui seu valor especifico
	@Override
	public double getPreco() {
		
		return 250000;
		
	}
	
	
}
