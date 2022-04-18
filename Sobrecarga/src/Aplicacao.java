import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		Matematica matematica = new Matematica();
		
		
		System.out.println("Área dos polígonos");
		System.out.println("Digite a altura do polígono");
		int x = valor.nextInt();
		System.out.println("Digite a largura do polígono");
		int y = valor.nextInt();
		
		int areaQ = matematica.area(x,y);
		
		double areaT = matematica.area(x,y);
		
		int areaR = matematica.area(x,y);
		
		System.out.println("");
		System.out.println("A área do quadrado é: " + areaQ);
		System.out.println("A área do triângulo é: " + areaT);
		System.out.println("A área do retângulo é: " + areaR);
	}

}
