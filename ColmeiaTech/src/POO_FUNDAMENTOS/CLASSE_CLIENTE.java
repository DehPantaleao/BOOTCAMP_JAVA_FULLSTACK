package POO_FUNDAMENTOS;

public class CLASSE_CLIENTE {
		
		private String nomeCliente;
		private String dataNascimento;
		private String corFavorita;
		private int idade;
		private float altura;
		
		public CLASSE_CLIENTE(String nomeCliente, String dataNascimento, String corFavorita, int idade, float altura) {
			super();
			this.nomeCliente = nomeCliente;
			this.dataNascimento = dataNascimento;
			this.corFavorita = corFavorita;
			this.idade = idade;
			this.altura = altura;
		}

		public String getNomeCliente() {
			return nomeCliente;
		}

		public void setNomeCliente(String nomeCliente) {
			this.nomeCliente = nomeCliente;
		}

		public String getDataNascimento() {
			return dataNascimento;
		}

		public void setDataNascimento(String dataNascimento) {
			this.dataNascimento = dataNascimento;
		}

		public String getCorFavorita() {
			return corFavorita;
		}

		public void setCorFavorita(String corFavorita) {
			this.corFavorita = corFavorita;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public float getAltura() {
			return altura;
		}

		public void setAltura(float altura) {
			this.altura = altura;
		}
		
		public void imprimirInfo() {
			System.out.println("A/O "+nomeCliente+" nasceu no dia "+dataNascimento+", por isso tem "+idade+" anos de idade. Sua cor favorita Ã© "
		+corFavorita+" e tem "+altura+" de altura");
		}	
	}
