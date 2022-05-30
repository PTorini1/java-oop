
public class Sabonete {
	
	@Override
	public String toString() {
		return "Sabonete: cheiro=" + cheiro + ", cor=" + cor;
	}
	
	private String cheiro;
	private String cor;
	
	public Sabonete(String cheiro, String cor) {
		this.cheiro = cheiro;
		this.cor = cor;
	}
	
	public Sabonete(String texto) {
		String[]ArrayTeste1 = texto.split(",");
		String[]ArrayTeste2 = ArrayTeste1[0].split("=");
		this.cheiro = ArrayTeste2[1].trim();
		
		String[] ArrayTeste3 = ArrayTeste1[1].split("=");
		this.cor = ArrayTeste3[1].trim();
	}
	
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
