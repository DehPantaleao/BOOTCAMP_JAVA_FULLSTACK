package ESTRUTURA_DE_DADOS;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class EXEMPLO_Fila_FIFO_QUEUE {

	public static void main(String[] args) {
				
				Queue<Integer> fila = new LinkedList<Integer>();
				
				for(int i=0;i<=10;i++) {
					fila.add(i);
				}
				
				System.out.println("\nElementos da fila: "+fila);
				System.out.println("\nRemovendo elemento: "+fila.remove());
				System.out.println("\nElementos da fila depois de remover: "+fila);
				System.out.println("\nAdicionando o elemento 11: "+fila.add(11));
				System.out.println("\nelementos da fila depois de adicionar: "+fila);
				System.out.println("\nPegar um elemento da fila: "+fila.peek());
				System.out.println("\nPegar o tamanho da fila: "+fila.size());
				System.out.println("\nVerificar um elemento da fila: "+fila.contains(37));
				System.out.println("\nExibiar e retirar o primeiro elemento da fila: "+fila.poll());
				System.out.println("\nFil atual:"+fila);
				
				Iterator<Integer> iterator = fila.iterator();
				
				while(iterator.hasNext()) {
					System.out.println(iterator.next());
				}
				
				System.out.println("\nLimpar a fila: ");
				fila.clear();
				System.out.println(fila);
				
				System.out.println("\nVerificar se a fila estÃ¡ vazia: "+fila.isEmpty());

	}

}
