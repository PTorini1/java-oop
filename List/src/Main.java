import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//List = Interface
		//ArrayList = implementa a list (Classe da object)
		//LinkedList = outra classe que implementa a list
		
		List lista = new ArrayList(); //Instanciar uma lista
		
		lista.add("abc"); //Como a list vem da object, o polimorfismo dela permite colocar vários valores de difentes tipos
		lista.add(12);
		lista.add(true);
		
		//Aqui  o for foi usado para interagir com a lista e permitir que a variável x mostrasse os valores da lista (Interação mais trabalhosa)
		for(int x=0;x<lista.size();x++) {
		System.out.println(lista.get(x));
		
		}
		
		//Enhanced for facilita o código, pois automaticamente interage com a lista (Interação mais simples)
		for(Object valor: lista) {
			System.out.println(valor);
		}
		System.out.println();
	
		//No remove pode-se utilizar tanto o index como o objeto
		//Ao contrário do array, aqui quando você exclui um item ele não mostra nulo, mas remove completamente, pois utiliza o método lista e não direto o objeto
		lista.remove(0);
		for(Object valor: lista) {
			System.out.println(valor);
		}
		System.out.println();
		
		//O add empurra a valor que está na posição 0
		lista.add(0, "hue");
		for(Object valor: lista) {
			System.out.println(valor);
		}
		System.out.println();
	
		
		lista.remove(0);
		for(Object valor: lista) {
			System.out.println(valor);
		}
		System.out.println();
		
		//Set substitui o que estava na posição 0
		lista.set(0, "hue");
		for(Object valor: lista) {
			System.out.println(valor);
		}
		System.out.println();
		
		//O comando clear limpa os valores da lista
		lista.clear();
		if(lista.isEmpty()) {
			System.out.println("Sua lista está vazia");
		}

		// Instanciando objetos do tipo conta
		Conta conta1 = new Conta("Água",60.00);
		Conta conta2 = new Conta("Luz",120.00);
		
		// aqui foi criada uma lista do tipo Conta
		List<Conta>listaContas = new ArrayList<Conta>();
		// Os valores instanciados estao sendo jogadas na lista criada
		listaContas.add(conta1);
		listaContas.add(conta2);
		
		// Enhanced for para mostrar na tela
		for(Conta conta:listaContas) {
			System.out.println(conta);
		}
	}

}
