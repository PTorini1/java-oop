
public class Preparador{
	
	public void prepararBebida(Bebida bebida) {
		System.out.println("Preparando Bebida " + bebida.getNome());
		
		bebida.preparar();
		
		if(bebida.isAquecer() == true) {

			System.out.println("Aquecendo a bebida " + bebida.getNome());
		}
		
		System.out.println("Bebida preparada com sucesso!! \n");
		
	}

}
