// Importando uma renca de classes do java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	// Aqui ja foi passado as excecoes
	public static void main(String[] args) throws IOException {
		// Importando o Scanner
		Scanner entrada = new Scanner(System.in);
		
		// Lista do tipo Object que vai receber os dados do usuario
		List<Object> listaDados = new ArrayList<Object>();

		// Aqui um for para 4 cadastros. Quando chegar em 4 para de cadastrar
		for (int dados = 0; dados < 4; dados++) {
			// Instanciando o objeto pessoa para chamar os metodos da classe pessoa
			Pessoa pessoa = new Pessoa();
			// Chamando o metodo setEndereco e passando um construtor como parametro a fim de chamar os metodos do endereco
			pessoa.setEndereco(new Endereco());
			// Interacao com o usuario
			System.out.println("Olá!");
			System.out.println("Digita o nome ai: ");
			pessoa.setNome(entrada.next());

			System.out.println("Digite sua idade ai: ");
			pessoa.setIdade(entrada.nextInt());
			
			// Condicao para que o usuario digite apenas 1 e 2 para escolher o sexo, se digitar algo fora disso a mensagem se repetira ate que seja 1 ou 2
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
			
			// Informacoes sobre o endereco
			System.out.println("Agora umas informações sobre seu endereço ");
			System.out.println("Qual a rua: ");
			pessoa.getEndereco().setRua(entrada.next());

			System.out.println("Qual o numero: ");
			pessoa.getEndereco().setNumero(entrada.nextInt());

			System.out.println("Fala o bairro: ");
			pessoa.getEndereco().setBairro(entrada.next());
			// adiciondo tudo na lista criada
			listaDados.add(pessoa);
		}

		// Criando outra lista de que sera usada na leitura de arquivo
		List<Object> listaDados2 = new ArrayList<Object>();
		
		
		// Escrevendo os dados em um arquivo (Os conceitos de BufferedWriter e Reader ja foram explicados anteriormente)
		try (BufferedWriter cadastro = new BufferedWriter(new FileWriter("cadastro.txt"))) {
			for (Object cad : listaDados) {
				// Escrevendo os dados no arquivo e pulando linha
				cadastro.write(cad + "\n");
			}
		}

		try (BufferedReader ler = new BufferedReader(new FileReader("cadastro.txt"))) {
			String line;

			while ((line = ler.readLine()) != null) {
				Pessoa pessoa = new Pessoa(line);
				// salvando os dados lidos e adicionando na segunda lista
				listaDados2.add(pessoa.toString());
			}

			// Exibindo a lista na tela
			for (Object dados : listaDados2) {
				System.out.println(dados);
			}

		}

	}

}
