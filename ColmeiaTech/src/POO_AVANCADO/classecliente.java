package POO_AVANCADO;

public class classecliente {
				
			private String nomeCliente;
			private String dataNascimento;
			private String corFavorita;
			private int idade;
			private double altura;
			
			public classecliente(String nomeCliente, String dataNascimento, String corFavorita, int idade, double altura) {
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

			public double getAltura() {
				return altura;
			}

			public void setAltura(double altura) {
				this.altura = altura;
			}
			
			
			public void imprimirInfo() {
				
			}	
			
		}
		
