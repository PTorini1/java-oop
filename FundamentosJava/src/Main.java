
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

/*		int x = 100;
		double y = 200.3;

		int a = 0;
		double b = 0;

		short z = (short) 100000;

		a = (int) y; // Casting implicit
		b = x;

		System.out.println(a);
		System.out.println(b);
		System.out.println('x' + 'y');
		System.out.println(z+"\n");
*/
		
		
		
		
/*
		int idadePessoa = 60;

		if (idadePessoa < 18) {
			System.out.println("Você não pode beber!");
		} else if (idadePessoa >= 60) {
			System.out.println("Você é muito velho! Pare de beber!");
		} else {
			System.out.println("Você pode beber!");
		}

		System.out.println("Você tem " + idadePessoa + " anos \n");
*/
		
		
/*		
		int dia = 10;

		switch (dia) {
		case 1:
			System.out.println("Hoje é domingo");
			break;
		case 2:
			System.out.println("Hoje é segunda-feira");
			break;
		case 3:
			System.out.println("Hoje é terça-feira");
			break;
		case 4:
			System.out.println("Hoje é quarta-feira");
			break;
		case 5:
			System.out.println("Hoje é quinta-feira");
			break;
		case 6:
			System.out.println("Hoje é sexta-feira");
			break;
		case 7:
			System.out.println("Hoje é sábado");
			break;
		default:
			System.out.println("Esse dia não existe! Tá maluco pô");
		}
		
		char caractere = '2';
		
		switch(caractere) {
		case 'a':
			System.out.println("Primeira letra do alfabeto");
			break;
		case 'b':
			System.out.println("Bobo");
			break;
		default:
			System.out.println("Some daqui meu");
		}
		
		String farol = "Laranja";
		
		switch(farol) {
		case "Verde":
			System.out.println("Prossiga");
			break;
		case "Amarelo":
			System.out.println("Atenção!");
			break;
		case "Vermelho":
			System.out.println("Pare!");
			break;
		default:
			System.out.println("Que cor é essa ai? Conheço não");
		}
*/
		
		
		
//		int x = 0;
//
//		while (x < 10) {
//			x = x + 1;
//			System.out.println(x);
//		}
//
//		int x = 0;
//
//		do {
//			x = x + 1;
//			System.out.println(x);
//		} while (x < 10);
//	
		
		
		
//		Scanner entrada = new Scanner(System.in);
//		System.out.println("Digite o número que você deseja saber a tabuada");
//		int x = entrada.nextInt();
//		
//		for(int y=1; y<=10; y++) {
//			System.out.println(x + " x "+ y + " = "+ x*y);
//		}
//		
		// Aqui não foi necessário colocar new double, pois o próprio Java faz isso automaticamente
//		double x[]= {3,5,7}; 		
//		  - O for é a forma mais comum de interar uma matriz 
//		  - Foi utilizado 0, pois a matriz começará a ser conta a partir do 0 
//		  - O length é um método do Java que indica o máximo de uma matriz
		
//		for (int aux = 0; aux<x.length;aux++){
//			System.out.println("O valor do índice " + aux + " é = " + x[aux]);
//		}
//		
//		String nome[]= {"Pedro", "Henrique", "Spiecker","Torini"};
//		
//		for (int aux1 = 0; aux1<nome.length; aux1++) {
//			System.out.println(nome[aux1]);
//			if (nome[aux1] == "Henrique") {
//				System.out.println("o Índice de Henrique é: " + aux1);
//			}
//		}

		/*
//		Com o colchete eu indico que é uma matriz
		int[] arrayInt = new int[5]; // A variável arrayInt aponta para as variáveis da matriz e o new int serve para
										// definir a quantidade de variáveis eu vou ter na matriz
		String[] arrayString = new String[4];
		double[] arrayDouble = new double[3];

		arrayInt[3] = 4; // Aqui foi colocado o valor 4 na posição 3 - Isso serve para definir um valor
							// para uma posição da matriz

		int[] numero = new int[5];
		Scanner teclado = new Scanner(System.in);
		for (int aux2 = 0; aux2 < numero.length; aux2++) {
			System.out.println("Digite um número qualquer");
			numero[aux2] = teclado.nextInt();
		}
		for (int aux2 = 0; aux2 < numero.length; aux2++) {
			System.out.println("Índice " + aux2 + " = " + numero[aux2]);
			
		}
		*/
		
		/*
		int[] arrayQualquer = new int[3];		
		Object[] arrayObject = new Object[5];
		arrayObject[0]=12;
		arrayObject[1]="Pedro";
		arrayObject[2]=12.6;
		arrayObject[3]=true;
		arrayObject[4]=arrayQualquer;
		
		for (int aux2 = 0; aux2 < arrayObject.length; aux2++) {
			System.out.println("Índice " + aux2 + " = " + arrayObject[aux2]);
			
		}
		*/
		
		/*
		//array bidirecional serve para definir duas dimensões de uma tabela
		int[][]arrayBidirecional=new int[3][4];
		arrayBidirecional[0][0]=9;
		arrayBidirecional[2][1]=8;
		
		for (int linha = 0; linha < arrayBidirecional.length; linha++) {
			for (int coluna = 0; coluna < arrayBidirecional[0].length; coluna++) { //O '0' serve para descobrir o tamanho da segunda tabela
				System.out.print("Índice ["+ linha + "][" + coluna + "] = " + arrayBidirecional[linha][coluna] + " ");
			}
			System.out.println();		
		}
		*/
		
	}

}
