import java.util.Scanner;

/*
 * Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.
 */
public class Exercicio2 {

	public static void main(String[] args) {
		float n;
		int x,quantPar=0,quantImpar=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<10;x++)
		{
			System.out.println("Digite um n�mero:");
			n = leia.nextFloat();
			
			if(n%2==0)
			{
				quantPar++;
			}
			else
			{
				quantImpar++;
			}
			System.out.println("A quantidade de n�meros pares � de:"+quantPar);
			System.out.println("A quantidade de n�meros �mpares � de:"+quantImpar);
		}

	}

}
