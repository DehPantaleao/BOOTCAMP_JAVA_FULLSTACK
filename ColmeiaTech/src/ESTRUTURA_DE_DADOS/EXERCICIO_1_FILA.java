package ESTRUTURA_DE_DADOS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EXERCICIO_1_FILA {

	public static void main(String[] args) {
		
		int op = 0;
		Scanner leia = new Scanner(System.in);
				
		Queue<String> fila = new LinkedList<String>();
			
		
		do {
			
			System.out.println("\n\t\tMenu ");
			System.out.println("\n(1) Adicionar um novo cliente na fila");
			System.out.println("\n(2) Listar todos os clientes na fila");
			System.out.println("\n(3) Retirar cliente da fila");
			System.out.println("\n(0) Deseja sair?");
			System.out.println("\nEntre com a opção desejada: ");
			op = leia.nextInt();
			
			switch(op) {
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o nome do cliente: ");
				String nome = leia.nextLine();
				System.out.println("\nCliente adicionado. ");
				fila.add(nome);
				break;
				
			case 2:
				leia.nextLine();
							
				if(fila.isEmpty()) {
					System.out.println("\nA fila esta vazia!!");
					
				}else {
					System.out.println("\nLista de clientes na fila: "+fila);
				}
				break;
				
			case 3: 
				leia.nextLine();
								
				if(fila.isEmpty()) {
					System.out.println("\nA fila esta vazia!!");
					
				}else {
					System.out.println("\nPróximo cliente: "+fila.poll());
				}
				break;
							
			case 0:
				System.out.println("\nPrograma finalizado!");
				break;
				
				default:
					System.out.println("\nOpção inválida!!!");
				
			}
			
		}while(op != 0);

	
	}
}