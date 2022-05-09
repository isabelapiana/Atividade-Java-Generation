import java.util.Scanner;

/*
 * Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)
 */
public class Exercicio6 {

	public static void main(String[] args) {
		int n,quantN=0;
		float media,somaN=0;
		
		Scanner leia = new Scanner(System.in);
		
		do
		{
			System.out.println("Digite um número inteiro do teclado (para sair, digite 0):");
			n = leia.nextInt();
			
			if(n%3==0 && n!=0)
			{
				quantN++;
				somaN = somaN+n;
			}
		}
		while(n!=0);
		media = somaN/quantN;
		System.out.println("A média dos números múltiplos de 3 é:"+media);

	}

}
