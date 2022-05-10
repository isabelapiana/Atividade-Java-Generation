import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Faça um programa que receba 6 números inteiros e mostre: 
1 - Os números pares digitados;  
2 - A soma dos números pares digitados; 
3 - Os números ímpares digitados; 
4 - A quantidade de números ímpares digitados.
 */
public class Exercicio2 {

	public static void main(String[] args) {
		int y,n,somaPar = 0,somaImpar = 0,quantImpar = 0;
		List<Integer>numerosPares = new ArrayList<>();
		List<Integer>numerosImpares = new ArrayList<>();

		Scanner leia = new Scanner(System.in);
		
		for(y=0;y<6;y++)
		{
			System.out.println("Digite um número inteiro:");
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
		System.out.println("Números pares:"+numerosPares);
		System.out.println("Soma dos números pares:"+somaPar);
		System.out.println("Números ímpares:"+numerosImpares);
		System.out.println("Quantidade de números ímpares:"+quantImpar);
	}

}
