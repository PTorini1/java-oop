
public class Aplicacao {

	public static void main(String[] args) {
		// Instanciando a classe preparador por meio da variavel preparador
		Preparador preparador = new Preparador();
		
		// Instanciando o objeto leiteQuente do tipo LeiteQuente
		LeiteQuente leiteQuente = new LeiteQuente();
		// Chamando o metodo preparar bebida e passando como parametro o leiteQuente
		preparador.prepararBebida(leiteQuente);
		
		// Instanciando o objeto refrigerante do tipo Refrigerante
		Refrigerante refrigerante = new Refrigerante("Soda", false);
		// Chamando o metodo preparar bebida e passando como parametro o refrigerante
		preparador.prepararBebida(refrigerante);
		
		
	}

}
