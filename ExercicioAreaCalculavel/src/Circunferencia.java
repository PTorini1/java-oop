
public class Circunferencia implements AreaCalculavel{
	double r;
	
	@Override
	public double calcularArea() {
		return r*r*Math.PI;
	}

	public void mostrarArea() {
		System.out.println("A área da Cinfurerência é " + calcularArea() + " m2");
	}

}
