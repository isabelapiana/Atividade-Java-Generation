import java.util.Scanner;

/*
 * Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)
 */
public class Exercicio5 {

	public static void main(String[] args) {
		int n,somaN=0;
		
		Scanner leia = new Scanner(System.in);
		
		do
		{
			System.out.println("Digite um n�mero do teclado:");
			n = leia.nextInt();
			somaN = somaN+n;
		}
		while(n!=0);
		System.out.println("A soma dos n�meros �:"+somaN);

	}

}
