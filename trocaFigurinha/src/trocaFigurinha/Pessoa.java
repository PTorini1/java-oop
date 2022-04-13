package trocaFigurinha;

public class Pessoa {
	String nome;
	int numFigurinhas;
	int x=1;
	
	void Receber(int numFigurinhas) {
		this.numFigurinhas += numFigurinhas;
		
	}
	
	void Dar(int numFigurinhas, Pessoa pessoa) {
		if(this.numFigurinhas < numFigurinhas) {
			System.out.println("Você não pode trocar, pois não possui a quantidade necessária de figurinhas \n");
			x=2;
		}else {
		this.numFigurinhas -= numFigurinhas;
		pessoa.Receber(numFigurinhas);
		}
	}
}