// Exntends inidica que a classe cachorro extende de animal e vai possuir os mesmos metodos que ela
public class Cachorro  extends Animal{
	
	// O override aqui foi usado para sobrescrever os metodos da classe animal na classe cachorro
	@Override
	public void Falar() {
		// O super e necessario para indicar que o metodo deriva da classe abstrata
		super.Falar();
		System.out.println("AU AU");
	}
	
	// Moder e um metodo presente apenas em cachorro e nao pode ser acessado por outros animais
	public void Morder() {
		System.out.println("NHAC!!");
	}
	
}
