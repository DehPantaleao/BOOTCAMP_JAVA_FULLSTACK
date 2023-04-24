package ESTRUTURA_DE_DADOS;

import java.util.Iterator;
import java.util.Stack;

public class EXEMPLO_PilhaLIFO_STACK {

	public static void main(String[] args) {
				
				Stack<String> pilha = new Stack<String>();
				
				pilha.push("Livro verde");
				pilha.push("Livro amarelo");
				pilha.push("Livro rosa");
				pilha.push("Livro vermelho");
				pilha.push("Livro preto");
				
				System.out.println("\nElementos da pilha: "+pilha);
				System.out.println("\nRetirar elemento: "+pilha.pop());
				System.out.println("\nElemento no topo da pilha: "+pilha.peek());
				System.out.println("\nAdicionar um elemento específico na pilha: "+pilha.push("Livro Branco"));
				System.out.println("\nVisualizar a pilha: "+pilha);
				System.out.println("\nTamanho da pilha: "+pilha.size());
				System.out.println("\nO elemento livro cinza está contido dentro da pilha? "+pilha.contains("Livro cinza"));
				System.out.println("\nExibir elementos da pilha com o Iterator...");
				
				Iterator<String> iterator = pilha.iterator();
				
				while(iterator.hasNext()) {
					System.out.println(iterator.next());
				}
				
				pilha.clear();
				System.out.println("\nVerificar se a pilha está vazia...: "+pilha.isEmpty());

	}

}
