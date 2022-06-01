
public class Endereco {

	@Override
	public String toString() {
		return "Endereco rua=" + rua + ", numero=" + numero + ", bairro=" + bairro;
	}

	private String rua;
	private int numero;
	private String bairro;

	public Endereco() {

	}

	public Endereco(String[] linha) {
		String[] ArrayTeste1 = linha[3].split(",");
		String[] ArrayTeste2 = ArrayTeste1[0].split("=");
		this.rua = ArrayTeste2[1].trim();

		String[] ArrayTeste3 = ArrayTeste1[1].split("=");
		this.numero = Integer.parseInt(ArrayTeste3[1].trim());

		String[] ArrayTeste4 = ArrayTeste1[2].split("=");
		this.bairro = ArrayTeste4[1].trim();

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
