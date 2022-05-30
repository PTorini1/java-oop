// se não escrever nada não dá erro porque é uma herança
public interface Carro extends Automovel{
	
	// Carro e um automovel, por isso extende de Automovel
	// Mas como nem todo autmovel precisa abrir a porta, foi criado um metodo que e usado para carro e nao para todos os automoveis
	public void abrirPorta();
	
	
}
