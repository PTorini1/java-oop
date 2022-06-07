// Importando a classe Scanner
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Instanciando variaveis
		int x = 100;
		double y = 200.3;

		int a = 0;
		double b = 0;

		short z = (short) 100000;
		
		// Casting implicit - No casting explicito eu forco uma variavel a ser de um tipo. Nesse caso y e double mas eu forcei a virar int, assim ele vai 
		// perder tudo o que esta depois da virgula, porque o tipo int suporta apenas numero inteiros
		a = (int) y;
		
		// Nesse caso nao foi necessario fazer casting explicito, porque a variavel b e double e x e int. Assim, ao converter o numero nao ira perder nenhum 
		// valor, sera apenas acrescentado um valor depois da virgula
		b = x;

		System.out.println(a);
		System.out.println(b);
		System.out.println('x' + 'y');
		System.out.println(z+"\n");
		
		//----------------------------------------------------------------------------------------------------//
		// If else
		
		int idadePessoa = 60;
		
		// O if serve para indicar uma condicao. Ou seja, se a variavel receber um valor age de uma forma, se receber outro age de outra forma
		// Aqui, se a variavel idadePessoa for maior que 18, ele vai poder beber, se for menor de 18 não pode beber e se tiver mais de 60 anos tambem
		// nao vai poder
		if (idadePessoa < 18) {
			System.out.println("Você não pode beber!");
		} /* O else serve para indicar o que o codigo vai fazer caso nao atenda a condicao do if, e nesse caso foi usado else if, ou seja, se nao atender a
		primeira condicao, vai fazer outro if */
		else if (idadePessoa >= 60) {
			System.out.println("Você é muito velho! Pare de beber!");
		} // Aqui foi usado outro else, pois na ha mais condicoes para serem analisadas
		else {
			System.out.println("Você pode beber!");
		}
		
		// Mensagem final indicando a idade da pessoa
		System.out.println("Você tem " + idadePessoa + " anos \n");
		
		//----------------------------------------------------------------------------------------------------//
		//Switch
		
		int dia = 10;
		// O Switch case tambem e uma estrutura para tomada de decisoes
		// Ele vai passar por cada caso disponivel e executar o codigo que atende a condicao pedida
		// Nesse teste cada dia da semana representa um numero e dependo do que o usario digitar, e mostrada uma mensagem na tela indicando o dia escolhido
		switch (dia) {
		// Case indica o caso que esta sendo analisado
		case 1:
			System.out.println("Hoje é domingo");
			// O break serve para ele parar de executar o switch ali mesmo quando o caso e verdadeiro, a fim de otimizar o codigo
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
		// O deafult serve para indicar o que fazer quando nenhum caso atende a condicao imposta
		default:
			System.out.println("Esse dia não existe! Tá maluco pô");
		}
		
		// Outro exemplo de Swith case com letras do alfabeto
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
		
		
		
		// Outro exemplo de Swith case com =sinais de transito
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

		//----------------------------------------------------------------------------------------------------//
		// While
		
		int x = 0;
		// O while e um laco de repeticao. Serve para indicar que enquanto uma condicao for verdadeiro ele executara um codigo
		// Nesse exemplo enquanto a variavel x for menor que 10 ele vai mostrar na tela o valor da variavel
		while (x < 10) {
			x = x + 1;
			System.out.println(x);
		}

		int x = 0;
		
		// O do while funciona de uma forma parecida. Indica para o programa fara um codigo enquanto uma condicao for verdadeira
		// Nesse caso sera executado um codigo para mostrar o valor da variavel x na tela enquanto ela for menor que 10
		// A diferenca do 'do while' para o 'while' e a ordem de execucao do codigo, pois o resultado sera o mesmo
		do {
			x = x + 1;
			System.out.println(x);
		} while (x < 10);
	
		
		//----------------------------------------------------------------------------------------------------//
		// For
		
		// A classe Scanner e usada para interagir com o usuario e permitir que ele possa colocar suas proprias respostas no console ao inves de so pegar
		// respostas pre-determinadas. Aqui foi instanciada a variavel entrada do tipo Scanner
		Scanner entrada = new Scanner(System.in);
		
		// Nesse projeto foi pedido uma tabuada
		System.out.println("Digite o número que você deseja saber a tabuada");
		
		// Instanciando a variavel que sera escolhida a tabuada
		int x = entrada.nextInt();
		
		/* Para a execucao dela, foi usada a estrutura 'for'
		Podemos interpretar o codigo abaixo da seguinte forma:
		
		for significa 'para'
		int y=1 e a variavel criada para multiplicar o valor escolhido pelo usuario
		y<=10; y++, significa que enquanto a variavel y for menor que 10, sera somado 1 a variavel y	
		
		Dentro do for temos uma multiplicacao de x(valor que usuario escolheu) e y(variavel criada que comeca em 1 e termina no 10)
		Assim vai mostrar a tabuada do valor escolhido pelo usuario do 1 ao 10
		*/
		for(int y=1; y<=10; y++) {
			System.out.println(x + " x "+ y + " = "+ x*y);
		}
		
		//----------------------------------------------------------------------------------------------------//
		//Matriz
		
		// Matriz e uma tabela que agrupa valores de variaveis de um unico tipo
		// Aqui não foi necessário colocar new double, pois o próprio Java faz isso automaticamente
		// Com o colchete eu indico que é uma matriz
		double x[]= {3,5,7}; 
		
		//  - O for é a forma mais comum de interar uma matriz 
		
		// int aux=1 e a variavel criada para indicar o indice procurado na matriz
		// aux<=x.lenght; aux++, significa que enquanto a variavel aux for menor que o tamanho da mtriz, sera somado 1 a variavel aux	
		
		//  - Foi utilizado 0, pois a matriz começará a ser conta a partir do 0 
		//  - O length é um método do Java que indica o máximo de uma matriz
		
		for (int aux = 0; aux<x.length;aux++){
			//  - Com o auxilio do for, sera exibido na tela os valores dos indices da matriz. Para isso e usado os colchetes que unem a matriz x e variavel aux
			//    que indica qual o indice procurado
			System.out.println("O valor do índice " + aux + " é = " + x[aux]);
		}
		
		
		// Essa proxima matriz faz a mesma coisa, porem mostra um nome ao inves de um numero
		// Nesse caso foi possivel mostrar que da usar String em uma matriz 
		String nome[]= {"Pedro", "Henrique", "Spiecker","Torini"};
		
		for (int aux1 = 0; aux1<nome.length; aux1++) {
			System.out.println(nome[aux1]);
			// Aqui dentro foi passado uma condicao para mostrar o nome na tela quando a variavel aux1 receber o nome desejado na condicao
			if (nome[aux1] == "Henrique") {
				System.out.println("o Índice de Henrique é: " + aux1);
			}
		}

		//----------------------------------------------------------------------------------------------------//
		//Array
		
		// Array e um vetor de uma linha so. Ou tem uma so linha ou uma so coluna, e seus elementos estao agrupados. 
		// A variavel arrayInt aponta para as variáveis da matriz e o new int serve para definir a quantidade de variaveis que eu vou ter na matriz
		int[] arrayInt = new int[5]; 								
		String[] arrayString = new String[4];
		double[] arrayDouble = new double[3];

		// Aqui foi colocado o valor 4 na posicao 3 - Isso serve para definir um valor para uma posicao da matriz					
		arrayInt[3] = 4; 
		
		
		// No exemplo abaixo foi mostrado que e possivel usar o array para interagir com o Scanner
		// Nesse exemplo o usuario digita os valores e no final e mostrado ao usuario o que ele digitou
		// Foi usado um for para pedir o valor e outro for para mostrar na tela
		int[] numero = new int[5];
		Scanner teclado = new Scanner(System.in);
		for (int aux2 = 0; aux2 < numero.length; aux2++) {
			System.out.println("Digite um número qualquer");
			numero[aux2] = teclado.nextInt();
		}
		for (int aux2 = 0; aux2 < numero.length; aux2++) {
			System.out.println("Índice " + aux2 + " = " + numero[aux2]);
			
		}
		
		
		// Nesse exemplo foi usado um array do tipo object para mostrar que da pra colocar valores de tipos diferentes em um array desde que seja do tipo object
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
		
				
		// Array bidirecional serve para definir duas dimensões de uma tabela
		// Como o Array normal so tem uma dimensao (linha ou coluna) esse comando permite que tenha os dois
		// Para definir o array bidirecional e necessario usar dois colchetes para indicar o tamanho das dimensoes
		int[][]arrayBidirecional=new int[3][4];
		// Aqui foi definido valores na (linha 0 e coluna 0 ) e (linha 2 e coluna 1)
		arrayBidirecional[0][0]=9;
		arrayBidirecional[2][1]=8;
		
		for (int linha = 0; linha < arrayBidirecional.length; linha++) {
			//O '0' serve para descobrir o tamanho da segunda tabela se nao ele mostrara os valores que estao em comum apenas com os dois arrays
			//Nesse caso mostraria 3 linhas e 3 colunas ao inves de 4 
			for (int coluna = 0; coluna < arrayBidirecional[0].length; coluna++) { 
				System.out.print("Índice ["+ linha + "][" + coluna + "] = " + arrayBidirecional[linha][coluna] + " ");
			}
			System.out.println();		
		}
		
		
	}

}
