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

		List<Object> listaDados = new ArrayList<Object>();

		for (int dados = 0; dados < 1; dados++) {
			Pessoa pessoa = new Pessoa();
			pessoa.setEndereco(new Endereco());

			System.out.println("Olá!");
			System.out.println("Digita o nome ai: ");
			pessoa.setNome(entrada.next());

			System.out.println("Digite sua idade ai: ");
			pessoa.setIdade(entrada.nextInt());

			int opcao = 0;
			do {
				System.out.println("Qual o seu sexo oh chará: 1-Masculino  2-Feminino");
				opcao = entrada.nextInt();

				if (opcao == 2) {
					pessoa.setSexo(Sexo.FEMININO);
				} else if (opcao == 1) {
					pessoa.setSexo(Sexo.MASCULINO);
				}

			} while (opcao != 1 && opcao != 2);

			System.out.println("Agora umas informações sobre seu endereço ");
			System.out.println("Qual a rua: ");
			pessoa.getEndereco().setRua(entrada.next());

			System.out.println("Qual o numero: ");
			pessoa.getEndereco().setNumero(entrada.nextInt());

			System.out.println("Fala o bairro: ");
			pessoa.getEndereco().setBairro(entrada.next());

			listaDados.add(pessoa);
		}

		List<Object> listaDados2 = new ArrayList<Object>();

		try (BufferedWriter cadastro = new BufferedWriter(new FileWriter("cadastro.txt"))) {
			for (Object cad : listaDados) {
				cadastro.write(cad + "\n");
			}
		}

		try (BufferedReader ler = new BufferedReader(new FileReader("cadastro.txt"))) {
			String line;

			while ((line = ler.readLine()) != null) {
				Pessoa pessoa = new Pessoa(line);
				listaDados2.add(pessoa.toString());
			}

			for (Object dados : listaDados2) {
				System.out.println(dados);
			}

		}

	}

}
