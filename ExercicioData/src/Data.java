import java.util.Scanner;
public class Data {
	Scanner entrada = new Scanner(System.in);
	private int hora;
	private int minuto;
	private int segundo;
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int hora, int minuto, int segundo, int dia, int mes, int ano) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano; 
	}
	
	public void receber() {
		System.out.println("Bem-vindo ao sistema de calendário da nossa empresa \n");
		System.out.println("Digite um dia entre 0 e 31");
		
		System.out.println("Digite um mês entre 1 e 12");
		System.out.println("Digite um ano");
		System.out.println("Digite uma hora entre 0 e 23");
		System.out.println("Digite um minuto entre 0 e 60");
		System.out.println("Digite um segundo entre 0 e 60");
	}
	
}
