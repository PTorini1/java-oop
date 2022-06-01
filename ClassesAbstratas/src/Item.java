// Item e uma classe abstrata, portanto, seus metodos sao genericos e vao ser melhor definidos pelas classes que extenderem dela
public abstract class Item {
	// Atribuindo variaveis
	private int posX;
	private int poxY;
	
	// Metodo generico pegar
	public abstract void pegar();
	
	
	// Getters e setters das variaveis que serao utilizadas para pegar e atribuir valores futuramente
	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPoxY() {
		return poxY;
	}

	public void setPoxY(int poxY) {
		this.poxY = poxY;
	}
	
	
}
