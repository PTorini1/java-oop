// A classe quadrado implementa AreaCalculavel, pois os metodos dela se aplicam a essa
public class Retangulo implements AreaCalculavel{
	// Declarando variaveis
	double x;
	double y;
	
	// O metodo calcularArea foi sobrescrito a fim de passar um calculo que se aplica apenas a classe quadrado
	@Override
	public double calcularArea() {
		return x*y;
	}

	
	// Aqui e um metodo para imprimir a area na tela
	public void mostrarArea() {
		System.out.println("A área do Retângulo é " + calcularArea() + " m2");
	}

}
