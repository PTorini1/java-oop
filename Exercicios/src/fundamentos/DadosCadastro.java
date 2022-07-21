package fundamentos;

public class DadosCadastro {
		private String nome;
		private int cpf;
		private float salario;
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getCpf() {
			return cpf;
		}
		public void setCpf(int cpf) {
			this.cpf = cpf;
		}
		public float getSalario() {
			return salario;
		}
		public void setSalario(float salario) {
			this.salario = salario;
		}
		public DadosCadastro() {
			
		}
		
		@Override
		public String toString() {
			return "Nome: " + nome + " CPF: "+ cpf + " Salario " + salario;
		}
		
}
