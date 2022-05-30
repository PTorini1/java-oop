
public class Vendedor {
	// Aqui foi criada uma variavel mostrar preco que tem como parametro uma variavel caro do tipo ItemCaro e mostra o preco instanciado na interface ItemCaro
	public void mostrarPreco(ItemCaro caro) {
		System.out.println("O valor é " + caro.getPreco());
	}
	
}
