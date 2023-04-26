package POO_AVANCADO;

public class PessoaFisica extends classecliente{
	
	private String cpf;
	private String pesquisa;
	
	public PessoaFisica(String nomeCliente, String dataNascimento, String corFavorita, int idade, double altura,
			String cpf, String pesquisa) {
		super(nomeCliente, dataNascimento, corFavorita, idade, altura);
		this.cpf = cpf;
		this.pesquisa = pesquisa;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getPesquisa() {
		return pesquisa;
	}

	public void setPesquisa(String pesquisa) {
		this.pesquisa = pesquisa;
	}
	
	 public void imprimirInfo() {
		 System.out.printf("\nA/O %s nascido em %s , com %s como cor favorita. Tem %d de idade e %.2f de altura.%s %s"
					,getNomeCliente(), getDataNascimento(), getCorFavorita(), getIdade(), getAltura(), cpf, pesquisa);
}

}
