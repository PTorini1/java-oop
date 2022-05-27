import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		// O metodo Scanner e usado para interagir com o usuario e permitir que ele possa colocar suas proprias respostas no console ao inves de so pegar
		// respostas pre-determinadas
		Scanner valor = new Scanner(System.in);
		// Aqui foi instanciada a variavel matematica do tipo Matematica para poder ter acesso ao metodos da classe Matematica
		Matematica matematica = new Matematica();
		
		
		System.out.println("Área dos polígonos");
		System.out.println("Digite a altura do polígono");
		// O comando nextInt() e do metodo Scanner e permite que o usuario digite um valor e ele interprete como int
		int x = valor.nextInt();
		System.out.println("Digite a largura do polígono");
		int y = valor.nextInt();
		
		// Aqui foram chamados os metodos da classe Matematica
		int areaQ = matematica.area(x,y);
		
		double areaT = matematica.area(x,y);
		
		int areaR = matematica.area(x,y);
		
		// Resultado final sendo exibido para o usuario
		System.out.println("");
		System.out.println("A área do quadrado é: " + areaQ);
		System.out.println("A área do triângulo é: " + areaT);
		System.out.println("A área do retângulo é: " + areaR);
	}

}
