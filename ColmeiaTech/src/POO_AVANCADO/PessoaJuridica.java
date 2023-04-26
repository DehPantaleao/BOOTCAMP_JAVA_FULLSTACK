package POO_AVANCADO;

public class PessoaJuridica extends classecliente{
	
	private String cnpj;
	private String razaoSocial;
	
	public PessoaJuridica(String nomeCliente, String dataNascimento, String corFavorita, int idade, double altura,
			String cnpj, String razaoSocial) {
		super(nomeCliente, dataNascimento, corFavorita, idade, altura);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public String getRazaoSocial() {
		return razaoSocial;
	}


	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	public void imprimirInfo() {
		System.out.printf("\nA/O %s nascido em %s , com %s como cor favorita. Tem %d de idade e %.2f de altura. %s %s"
				,getNomeCliente(), getDataNascimento(), getCorFavorita(), getIdade(), getAltura(), cnpj, razaoSocial);

	}

}	