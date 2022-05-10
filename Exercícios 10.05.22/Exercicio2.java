import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Fa�a um programa que receba 6 n�meros inteiros e mostre: 
1 - Os n�meros pares digitados;  
2 - A soma dos n�meros pares digitados; 
3 - Os n�meros �mpares digitados; 
4 - A quantidade de n�meros �mpares digitados.
 */
public class Exercicio2 {

	public static void main(String[] args) {
		int y,n,somaPar = 0,somaImpar = 0,quantImpar = 0;
		List<Integer>numerosPares = new ArrayList<>();
		List<Integer>numerosImpares = new ArrayList<>();

		Scanner leia = new Scanner(System.in);
		
		for(y=0;y<6;y++)
		{
			System.out.println("Digite um n�mero inteiro:");
			n = leia.nextInt();
			if(n%2==0)
			{
				numerosPares.add(n);
				somaPar = somaPar+n;
			}
			else
			{
				numerosImpares.add(n);
				quantImpar++;
			}
		}
		System.out.println("N�meros pares:"+numerosPares);
		System.out.println("Soma dos n�meros pares:"+somaPar);
		System.out.println("N�meros �mpares:"+numerosImpares);
		System.out.println("Quantidade de n�meros �mpares:"+quantImpar);
	}

}
