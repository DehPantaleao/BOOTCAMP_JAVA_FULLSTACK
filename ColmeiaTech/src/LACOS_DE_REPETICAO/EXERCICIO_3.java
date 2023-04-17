package LACOS_DE_REPETICAO;

import java.util.Scanner;

public class EXERCICIO_3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade = 0, contadormenor = 0, contadormaior = 0;
		
		while (idade >= 0) 
		{
			System.out.println("Digite uma idade: "); 
			idade = leia.nextInt();
			
			if (idade >= 1 && idade < 21) {
				contadormenor++;				
			}
			else if (idade > 50) {
				contadormaior++;
			}
		}
		System.out.println("total de pessoas cuja idade seja menor que 21 anos : " +contadormenor); 
		System.out.println("total de pessoas cuja idade seja menor que 50 anos : " +contadormaior); 
		
	}

}
