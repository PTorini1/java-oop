
public class Main {
	//final determina que e constante
	public static final double PI = 3.14;
	
	
	//E possivel criar um enum sem a necessidade de uma classe especifica pra isso
	private enum Sexo{
		MASCULINO,FEMININO
	}

	public static void main(String[] args) {
		
		double pi = Main.PI;

		DiaDaSemana hoje = DiaDaSemana.SEGUNDA;
		
		int num = DiaDaSemana.SEGUNDA.getNum();
		System.out.println(num);
		
		String s = "TERCA";
		hoje = DiaDaSemana.valueOf(s);
		System.out.println(hoje.getNum());
		
		Sexo sexo = Sexo.MASCULINO;
		sexo = Sexo.FEMININO;
		
		System.out.println(sexo);
	}

}
