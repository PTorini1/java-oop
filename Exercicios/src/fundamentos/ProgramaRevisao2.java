package fundamentos;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaRevisao2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		List<Object> listaDados = new ArrayList<Object>();
		for(int dados = 0; dados<=1; dados++ ){
			DadosCadastro dadosCadastro = new DadosCadastro();
			System.out.println("Alimentos Gostosos e Muito Bons LTDA");
			System.out.println("Digite seu nome: ");
			dadosCadastro.setNome(entrada.next());
			System.out.println("Digite seu CPF");
			dadosCadastro.setCpf(entrada.nextInt());
			System.out.println("Digite seu salario");
			dadosCadastro.setSalario(entrada.nextFloat());
			listaDados.add(dadosCadastro);
			if (dados == 1){
				dadosCadastro.toString();
			}
		}
		
		List<Object> listaDados2 = new ArrayList<Object>();
		DadosCadastro dadosCadastro = new DadosCadastro();
		for (Object dados : listaDados2) {
			System.out.println(dados);
		}
	}

}
