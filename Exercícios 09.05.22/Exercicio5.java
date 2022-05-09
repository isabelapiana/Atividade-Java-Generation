import java.util.Scanner;

/*
 * Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)
 */
public class Exercicio5 {

	public static void main(String[] args) {
		int n,somaN=0;
		
		Scanner leia = new Scanner(System.in);
		
		do
		{
			System.out.println("Digite um número do teclado:");
			n = leia.nextInt();
			somaN = somaN+n;
		}
		while(n!=0);
		System.out.println("A soma dos números é:"+somaN);

	}

}
