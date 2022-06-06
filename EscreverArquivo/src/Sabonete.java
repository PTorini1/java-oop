
public class Sabonete {
	// Aqui sobrescrevi o metodo toString para mostrar os atributos do sabonete
	@Override
	public String toString() {
		return "Sabonete: cheiro=" + cheiro + ", cor=" + cor;
	}
	
	// Aqui foram criados atributos privados para o objeto sabonete que sera criado
	private String cheiro;
	private String cor;
	
	// Aqui e o contrutor da classe sabonete
	// O construtor serve para que outras classes possam colocar informacoes nos atributos
	public Sabonete(String cheiro, String cor) {
		this.cheiro = cheiro;
		this.cor = cor;
	}
	
	// Aqui temos o metodo Sabonete que vai quebrar o conteudo quando encontrar uma virgula e transformar em elemento do array
	public Sabonete(String texto) {
		String[]ArrayTeste1 = texto.split(",");
		// Aqui foi feito um split que vai quebrar o elemento do array quando chegar em sinal de igual, assim
		// O elemento vai ser o que esta em uma virgula e um sinalde igual
		String[]ArrayTeste2 = ArrayTeste1[0].split("=");
		this.cheiro = ArrayTeste2[1].trim();
		
		String[] ArrayTeste3 = ArrayTeste1[1].split("=");
		this.cor = ArrayTeste3[1].trim();
	}
	
	// Getters e setters dos atributos da classe sabonete
	public String getCheiro() {
		return cheiro;
	}
	public void setCheiro(String cheiro) {
		this.cheiro = cheiro;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	
}
