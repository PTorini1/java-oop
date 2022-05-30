import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);
		
		List<Object>listaDados = new ArrayList<Object>();
		
		Object arrayDados[] = new Object[4];
		for(int dados = 0; dados<arrayDados.length;dados++) {
			Pessoa pessoa = new Pessoa(null, dados, null);
			pessoa.setEndereco(new Endereco(null, dados, null));
			System.out.println("Olá!");
			System.out.println("Digita o nome ai: ");
			pessoa.setNome(entrada.next());
			System.out.println("Digite sua idade ai: ");
			pessoa.setIdade(entrada.nextInt());
			System.out.println("Qual o seu sexo oh chará: 1-Masculino  2-Feminino");
			pessoa.sex(entrada.nextInt());
			System.out.println("Agora umas informações sobre seu endereço ");
			System.out.println("Qual a rua: ");
			pessoa.endereco.rua=entrada.next();
			System.out.println("Qual o numero: ");
			pessoa.endereco.numero=entrada.nextInt();
			System.out.println("Fala o bairro: ");
			pessoa.endereco.bairro=entrada.next();
			listaDados.add(pessoa);
		}
		
		try(BufferedWriter cadastro = new BufferedWriter(new FileWriter("cadastro.txt"))){
			for(Object cad : listaDados) {
				cadastro.write(cad+"\n");
			}
		}
		
		try(BufferedReader ler = new BufferedReader(new FileReader("cadastro.txt"))){
			String line;
			
			while ((line = ler.readLine()) != null) {
				Pessoa pessoa = new Pessoa(line);
				listaDados.add(pessoa.toString());
			}
			
			for(Object dados:listaDados) {
				System.out.println(dados);
			}
			
		}
		
	}

}
