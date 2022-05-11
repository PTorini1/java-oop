
public class Quadrado implements AreaCalculavel{
	double x;
	
	@Override
	public double calcularArea() {
		return x *= x;
	}

	public void mostrarArea() {
		System.out.println("A área do quadrado é " + calcularArea() + " m2");
	}
	
}
