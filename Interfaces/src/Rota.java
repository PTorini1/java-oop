// Classe para representar uma rota generica
public class Rota {
	// Aqui foi criado um metodo que recebe como parametro uma variavel automovel do tipo automovel que chama os metodos daquela interface
	public void ir(Automovel automovel){
		
		automovel.virarEsquerda();
		automovel.virarDireita();
		automovel.acelerar();
		automovel.virarDireita();
		
	}
	
}
