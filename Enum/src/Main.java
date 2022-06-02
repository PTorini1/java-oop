
public class Main {
	//final determina que e constante
	public static final double PI = 3.14;
	
	
	//E possivel criar um enum sem a necessidade de uma classe especifica pra isso
	private enum Sexo{
		MASCULINO,FEMININO
	}

	public static void main(String[] args) {
		// Instanciando uma variavel
		double pi = Main.PI;
		
		// Instanciando objeto da classe DiaDaSemana e passa SEGUNDA como parametro
		DiaDaSemana hoje = DiaDaSemana.SEGUNDA;
		
		// Instanciando variavel do tipo int cujo nome e num como um DiaDaSemana que vai o metodo getNum
		// O getNum vai atribuir um numero o dia da semana, conforme feito na classe Enum
		int num = DiaDaSemana.SEGUNDA.getNum();
		System.out.println(num);
		
		// Um enum tambem pode ser chamado por String
		String s = "TERCA";
		// Aqui o objeto hoje, criado acima, e convertido para String a fim de receber o dia da semana
		hoje = DiaDaSemana.valueOf(s);
		System.out.println(hoje.getNum());
		
		// Aqui foi mostrado como e possivel chamar um Enum utilizando um objeto
		Sexo sexo = Sexo.MASCULINO;
		sexo = Sexo.FEMININO;
		
		System.out.println(sexo);
	}

}
