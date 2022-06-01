// Serve para criar uma lista
public enum DiaDaSemana {
	// Aqui foi instanciada uma lista de dias da semana que recebe um inteiro como valor
	DOMINGO(1),
	SEGUNDA(2),
	TERCA(3),
	QUARTA(4),
	QUINTA(5),
	SEXTA(6),
	SABADO(7);

	// Aqui foi atribuida uma variavel para atribuir um numero para os dias
	private int num;
	
	// Chamado o metodo getNum que retorna a variavel num
	public int getNum() {
		return num;
	}
	
	// Aqui foi adicionado um construtor privado 
	private DiaDaSemana(int num) {
		this.num = num;
	}
	
}
