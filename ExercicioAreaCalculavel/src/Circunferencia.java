// A classe circunferencia implementa AreaCalculavel, pois os metodos dela se aplicam a essa
public class Circunferencia implements AreaCalculavel{
	double r;
	
	// O metodo calcularArea foi sobrescrito a fim de passar um calculo que se aplica apenas a classe cincunferencia
	@Override
	public double calcularArea() {
		return r*r*Math.PI;
	}

	public void mostrarArea() {
		System.out.println("A área da Cinfureręncia é " + calcularArea() + " m2");
	}

}
