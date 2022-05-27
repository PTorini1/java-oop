
public class Aplicacao {

	public static void main(String[] args) {
		// Instanciando a classe preparador por meio da variavel preparador
		Preparador preparador = new Preparador();
		
		// Instanciando a classe LeiteQuente por meio da variavel leiteQuente
		LeiteQuente leiteQuente = new LeiteQuente();		
		preparador.prepararBebida(leiteQuente);
		
		Refrigerante refrigerante = new Refrigerante("Soda", false);
		preparador.prepararBebida(refrigerante);
		
		
	}

}
