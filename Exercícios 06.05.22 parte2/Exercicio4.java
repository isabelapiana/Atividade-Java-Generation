import java.util.Scanner;

/*
 * Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
calcule a seguinte expressão: D= (R+S)/2 ; sendo R= (A+B)*(A+B) e S= (B+C)*(B+C)
 */
public class Exercicio4 {

	public static void main(String[] args) {
		int A,B,C;
		double D;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor de A:");
		A = leia.nextInt();
		
		System.out.println("Digite o valor de B:");
		B = leia.nextInt();
		
		System.out.println("Digite o valor de C:");
		C = leia.nextInt();
		
		D = (Math.pow((A+B), 2)+Math.pow((B+C), 2))/2;
		
		System.out.println("Resultado: "+D);

	}

}
