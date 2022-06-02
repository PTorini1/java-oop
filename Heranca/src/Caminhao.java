// exntends mostra que a classe Caminhao herda de veiculo
public class Caminhao extends Veiculo{
	// Aqui foi sobrescrito o metodo buzinar, pois a buzina do caminhao e diferente do padrao definido
	@Override
	public void Buzinar() {
		System.out.println("FON FON");
	}
	
	

}
