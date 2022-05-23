
public class Endereco {

	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", numero=" + numero + ", bairro=" + bairro + "]";
	}

	String rua;
	int numero;
	String bairro;
	
	public Endereco(String rua, int numero, String bairro) {
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
	}
	
	public String getRua() {
		return rua;
	}

	public int getNumero() {
		return numero;
	}

	public String getBairro() {
		return bairro;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
		
}
