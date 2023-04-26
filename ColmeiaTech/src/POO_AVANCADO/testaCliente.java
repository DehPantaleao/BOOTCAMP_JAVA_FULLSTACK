/*Atividade 01

Utilizando os conceitos de Herança e Polimorfismo, da Programação Orientada a Objetos, crie as Classes PessoaFisica 
e PessoaJuridica, como Heranças da Classe Cliente (criada na lista de exercícios anterior), com os seus respectivos 
Métodos e Atributos. Na sequência, utilize a Classe TestaCliente para instanciar dois objetos da Classe PessoaFisica 
e dois objetos da Classe PessoaJuridica, e apresente as informações destes 4 Objetos na tela.
 
Boas práticas:

1)	Crie a Classe PessoaFisica como uma herança da Classe Cliente e defina pelo menos 1 Atributo relevante, a pessoa física, a sua escolha;
2)	Lembre-se de escolher Atributos que descrevem características específicas e exclusivas de uma pessoa física;
3)	Crie o Método Construtor com parâmetros na Classe PessoaFisica;
4)	Crie os Métodos Get e Set para todos os Atributos da Classe PessoaFisica;
5)	Crie o Método visualizar() na Classe PessoaFisica, que consiga exibir todos os dados do Objeto;
6)	Instancie 2 Objetos da Classe PessoaFisica na Classe TestaCliente;
7)	Utilize o Método visualizar() para exibir os dados dos 2 Objetos Instanciados.
8)	Crie a Classe PessoaJuridica como uma herança da Classe Cliente e defina pelo menos 1 Atributo relevante, a pessoa jurídica, a sua escolha;
9)	Lembre-se de escolher Atributos que descrevam características específicas e exclusivas de uma pessoa jurídica;
10)	Crie o Método Construtor com parâmetros na Classe PessoaJuridica;
11)	Crie os Métodos Get e Set para todos os Atributos da Classe PessoaJuridica;
12)	Crie o Método visualizar() na Classe PessoaJuridica, que consiga exibir todos os dados do Objeto;
13)	Instancie 2 Objetos da Classe PessoaJuridica na Classe TestaCliente;
14)	Utilize o Método visualizar() para exibir os dados dos 2 Objetos Instanciados.
 */

package POO_AVANCADO;

public class testaCliente {

	public static void main(String[] args) {
			
			classecliente[] lista = new classecliente[6];
			
			lista[0] = new classecliente("Cinthia", "14.05.1987", "roxo", 36, 1.60);
			lista[1] = new classecliente("João", "14.05.1988", "verde", 35, 1.73);
			lista[2] = new PessoaFisica("Sofia", "15.05.1988", "amarelo", 35, 1.83,"0123456459", "internet");
			lista[3] = new PessoaFisica("Kelly", "25.05.1988", "rosa", 35, 1.50,"0123454559", "amigo");
			lista[4] = new PessoaJuridica("Deborah", "14.05.1988", "roxo", 35, 1.62,"12345678912345", "Aprendendo Java Juntos");
			lista[5] = new PessoaJuridica("Ricardo", "07.05.1988", "preto", 35, 1.82,"98745632145698", "Todo mundo fazendo juntos");
		
					
			for(classecliente roda:lista) {			
				roda.imprimirInfo();
			}
					
			System.out.println("\n**************************************************");
		}

	}

