// A classe diamante extende de Item, que e uma classe generica 
public class Diamante extends Item{

	//Nesse caso foi pego o metodo pegar da classe item e ele foi sobrescrevido a fim de se adequar as necessidadese especificas dessa classe
	@Override
	public void pegar() {
		System.out.println("Pegou Diamante");
	}
}
