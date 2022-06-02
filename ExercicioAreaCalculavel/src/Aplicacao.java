
public class Aplicacao {

	public static void main(String[] args) {
		//Aqui foi instanciado os objetos de cada tipo de classe para interagir com os metodos delas e mostrar para o usurio a area dos poligonos que ele desejar
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
