package LACOS_DE_REPETICAO;

import java.util.Scanner;

public class EXERCICIO_5 {

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		
		int num = 0, soma = 0;
		
		do {
				System.out.println("Digite um número: ");
				num = leia.nextInt();
				
				if (num > 0){
					soma = soma = num;
				}
		} while (num != 0);
		System.out.println("A soma de todos os números positivos digitados é: "+soma);
		

	}

}
