package trocaFigurinha;

public class Pessoa {
	// Criando atributos para a classe 
	String nome;
	int numFigurinhas;
	// O atributo x serve para controlar a mensagem que será mostrada
	int x=1;
	
	// Metodo que recebe as figurinhas
	void Receber(int numFigurinhas) {
		this.numFigurinhas += numFigurinhas;
		
	}
	
	// Metodo que da as figurinhas
	void Dar(int numFigurinhas, Pessoa pessoa) {	
		// Condicao if para impedir que o usuario dê mais figurinhas do que possui
		if(this.numFigurinhas < numFigurinhas) {
			System.out.println("Você não pode trocar, pois não possui a quantidade necessária de figurinhas \n");
			x=2;
		}else {
		this.numFigurinhas -= numFigurinhas;
		pessoa.Receber(numFigurinhas);
		}
	}
}
