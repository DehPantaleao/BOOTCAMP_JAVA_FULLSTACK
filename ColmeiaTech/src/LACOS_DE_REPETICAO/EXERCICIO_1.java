package LACOS_DE_REPETICAO;

import java.util.Scanner;

public class EXERCICIO_1 {

	public static void main(String[] args) {
						
				Scanner leia = new Scanner(System.in);
				
				int n1,n2,x=0;
				
				System.out.println("Escreva um número inteiro: "); 
				n1 = leia.nextInt();
				
				System.out.println("Escreva outro número inteiro: "); 
				n2 = leia.nextInt();
				
				if (n1 >= n2) {
					System.out.println("Informamos que o intervalo é inválido!! "); 
				}
				
				for(x=n1;x<=n2;x++) { 
					if (x % 3 == 0 && x % 5 == 0) {
					System.out.println(x+ "Os números digitados são múltiplos de 3 e 5");

			}

		}

	}

}
