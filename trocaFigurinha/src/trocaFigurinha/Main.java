package trocaFigurinha;

public class Main {

	public static void main(String[] args) {

		// Editado o perfil Pedro
		Pessoa pessoa1 = new Pessoa();
		pessoa1.nome = "Pedro";
		pessoa1.numFigurinhas = 20;
		pessoa1.x = 1;
		System.out.println("Número de figurinhas iniciais do Pedro: " + pessoa1.numFigurinhas);

		// Editando o perfil Jorge
		Pessoa pessoa2 = new Pessoa();
		pessoa2.nome = "Jorge";
		pessoa2.numFigurinhas = 20;
		System.out.println("Número de figurinhas iniciais do Jorge: " + pessoa2.numFigurinhas + "\n");

		// Realizando a troca

		pessoa1.Dar(35, pessoa2);

		// Resultado final

		if (pessoa1.x > 1) {
			System.out.println("");
		} else {
			System.out.println("Número de figurinhas do Pedro depois da troca: " + pessoa1.numFigurinhas);
			System.out.println("Número de figurinhas do Jorge depois da troca: " + pessoa2.numFigurinhas);
		}
	}
}