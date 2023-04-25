/*
Atividade 01

Utilizando os conceitos de Classe, Objeto e Métodos, da Programação Orientada a Objetos, crie a Classe Cliente com os
seus respectivos Métodos e Atributos. Na sequência, crie uma Classe chamada TestaCliente, instancie dois objetos da 
Classe Cliente e apresente as informações destes 2 Objetos no console.

Boas práticas:

1)	Crie a Classe Cliente e defina pelo menos 5 Atributos relevantes ao Objeto Cliente, a sua escolha;
2)	Lembre-se de escolher Atributos genéricos, que descrevam as características gerais de qualquer Cliente;
3)	Crie o Método Construtor com parâmetros, contendo todos os Atributos definidos na Classe Cliente nos argumentos do Método;
4)	Crie os Métodos Get e Set para todos os Atributos da Classe Cliente;
5)	Crie o Método visualizar(), com a função de listar todos os Atributos de um Objeto da Classe Cliente;
6)	Crie a Classe TestaCliente no mesmo pacote da Classe Cliente, contendo o Método main() e instancie 2 Objetos da Classe Cliente;
7)	Utilize o Método visualizar() para exibir os dados dos 2 Objetos Instanciados.
*/

package POO_FUNDAMENTOS;

public class TESTA_CLIENTE {

	public static void main(String[] args) {
		
		CLASSE_CLIENTE[] lista = new CLASSE_CLIENTE[2];
		
		lista[0] = new CLASSE_CLIENTE("Maria", "14.05.1987", "roxo", 36, (float) 1.62);
		lista[1] = new CLASSE_CLIENTE("JosÃ©", "14.05.1988", "verde", 35, (float) 1.73);
				
		for(CLASSE_CLIENTE roda:lista) {			
			roda.imprimirInfo();
		}
		
		System.out.println("\n**************************************************");
	}

}
