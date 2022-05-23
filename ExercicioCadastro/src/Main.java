import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		List<Object>listaDados = new ArrayList<Object>();
		
		Object arrayDados[] = new Object[4];
		for(int dados = 0; dados<arrayDados.length;dados++) {
			Pessoa pessoa = new Pessoa(null, dados);
			pessoa.setEndereco(new Endereco(null, dados, null));
			pessoa.
			System.out.println("Olá!");
			System.out.println("Digita o nome ai: ");
			pessoa.nome= entrada.next();
			System.out.println("Digite sua idade ai: ");
			pessoa.idade= entrada.nextInt();
			System.out.println("Qual o seu sexo oh chará: 1-Masculino  2-Feminino");
			pessoa.sexo.sex= entrada.nextInt();
			System.out.println("Agora umas informações sobre seu endereço ");
			System.out.println("Qual a rua: ");
			pessoa.endereco.rua=entrada.next();
			System.out.println("Qual o numero: ");
			pessoa.endereco.numero=entrada.nextInt();
			System.out.println("Fala o bairro: ");
			pessoa.endereco.bairro=entrada.next();
			listaDados.add(pessoa);
		}
		
		for(Object dados:listaDados) {
			System.out.println(dados);
		}
		
	}

}
