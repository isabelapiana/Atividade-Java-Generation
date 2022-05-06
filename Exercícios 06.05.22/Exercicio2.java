import java.util.Arrays;
import java.util.Scanner;

/*
 * Faça um programa que entre com três números e coloque em ordem crescente.
 */
public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		
		float[] numeros = new float[3];
		int x,y;
		
		for(x=0;x<3;x++)
		{
			System.out.println("\nDigite um número:");
			numeros[x] = num.nextFloat();
		}
		
		Arrays.sort(numeros);
		System.out.println("\nOrdem crescente:");
		
		for(y=0;y<3;y++)
		{
			System.out.println("\n"+numeros[y]);
		}

	}

}
