
public class Lampada {
	// variavel do tipo boolean que so recebe verdadeiro ou falso
	private boolean ligada;	
	
	// Construtor 
	public Lampada(boolean ligada) {
		this.ligada = ligada;
	}

	// Metodo para ligar a lampada que atribui o boolean como true
	public void ligar() {		
		ligada = true;		
	}
	
	// Metodo para ligar a lampada que atribui o boolean como false
	public void desligar() {		
		ligada = false;
	}
	
	// Imprime o estado da lampada
	public void imprimir() {
		if(ligada == true) {
			System.out.println("Ligada");
		}else {
			System.out.println("Desligada");
		}
	}

}
