import java.util.Scanner;

/*
 * Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
 */
public class Exercicio4 {

	public static void main(String[] args) {
		
		float numero;
		double rnumero,pnumero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número qualquer:");
		numero = leia.nextFloat();
		
		if(numero%2==0)
		{
			rnumero = Math.sqrt(numero);
			System.out.println("O número é par e a raiz quadrada é:"+rnumero);
		}
		else
		{
			pnumero = Math.pow(numero, 2);
			System.out.println("O número é ímpar e se elevado ao quadrado o resultado é:"+pnumero);
		}

	}

}
