import java.util.Scanner;

/*
 * Faça um programa que receba três inteiros e diga qual deles é o maior.
 */
public class Exercicio1 {

	public static void main(String[] args) {
		
		int n,nmaior=0,x=1;
		
		Scanner leia = new Scanner(System.in);
		
		while(x<=3)
		{
			x++;
			System.out.println("\nDigite um número inteiro: ");
			n = leia.nextInt();
					
					if(n>nmaior)
					{
						nmaior = n;
					}
		}
		System.out.println("O maior número é: "+nmaior);

	}

}
