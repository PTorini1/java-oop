package fundamentos;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaRevisao2 {

	public static void main(String[] args) {
		float x=0;
		float y=0;
		Scanner entrada = new Scanner(System.in);
		
		List<DadosCadastro> listaDados = new ArrayList<DadosCadastro>();
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
			
			if(dados == 0) {
				x = dadosCadastro.getSalario();
			}else {
				y = dadosCadastro.getSalario();
			}
		}

		DadosCadastro dadosCadastro = new DadosCadastro();		
		for (DadosCadastro dados : listaDados) {
			System.out.println(dados);
		}
		System.out.println("A diferenca de salario entre os dois e de: " + (x-y));
	}
