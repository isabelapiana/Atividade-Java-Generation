import java.util.Scanner;

/*
 * Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
 */
public class Exercicio1 {

	public static void main(String[] args) {
		
		int n,nmaior=0,x=1;
		
		Scanner leia = new Scanner(System.in);
		
		while(x<=3)
		{
			x++;
			System.out.println("\nDigite um n�mero inteiro: ");
			n = leia.nextInt();
					
					if(n>nmaior)
					{
						nmaior = n;
					}
		}
		System.out.println("O maior n�mero �: "+nmaior);

	}

}
