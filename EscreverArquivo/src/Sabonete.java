
public class Sabonete {
	
	@Override
	public String toString() {
		return "Sabonete [cheiro=" + cheiro + ", cor=" + cor + "]";
	}
	
	private String cheiro;
	private String cor;
	
	public Sabonete(String cheiro, String cor) {
		this.cheiro = cheiro;
		this.cor = cor;
	}
	
	public Sabonete() {

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
