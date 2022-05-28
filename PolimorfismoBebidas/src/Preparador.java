
public class Preparador{
	
	public void prepararBebida(Bebida bebida) {
		// Metodo Generico para preparar bebida
		System.out.println("Preparando Bebida " + bebida.getNome());
		
		bebida.preparar();
		
		// Metodo generico para aquecer, so funciona se for verdadeiro pois nao sera aplicado a todas as bebidas ao contrario do preparar
		if(bebida.isAquecer() == true) {

			System.out.println("Aquecendo a bebida " + bebida.getNome());
		}
		
		System.out.println("Bebida preparada com sucesso!! \n");
		
	}

}
