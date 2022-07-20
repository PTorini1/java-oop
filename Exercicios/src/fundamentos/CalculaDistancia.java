package fundamentos;

public class CalculaDistancia {
	private int destino;
	
	public int getDestino() {
		return destino;
	}

	public void setDestino(int destino) {
		this.destino = destino;
	}

	public CalculaDistancia() {
		
	}

	public void CalcularDistancia() {
		if(destino == 1) {
			System.out.println("Distancia = 200km");
		}else if(destino == 2) {
			System.out.println("Distancia = 1000km");
		}else {
			System.out.println("Distancia = 3000km");
		}
	}
}
