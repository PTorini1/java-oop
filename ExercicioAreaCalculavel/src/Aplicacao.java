
public class Aplicacao {

	public static void main(String[] args) {
		Retangulo retangulo = new Retangulo();
		retangulo.x=8;
		retangulo.y=10;
		retangulo.mostrarArea();
		
		Quadrado quadrado = new Quadrado();
		quadrado.x = 5;
		quadrado.mostrarArea();
		
		Circunferencia circunferencia = new Circunferencia();
		circunferencia.r=10;
		circunferencia.mostrarArea();

		
	}

}
