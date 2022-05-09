import java.util.Scanner;

/*
 * Ler 10 números e imprimir quantos são pares e quantos são ímpares.
 */
public class Exercicio2 {

	public static void main(String[] args) {
		float n;
		int x,quantPar=0,quantImpar=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<10;x++)
		{
			System.out.println("Digite um número:");
			n = leia.nextFloat();
			
			if(n%2==0)
			{
				quantPar++;
			}
			else
			{
				quantImpar++;
			}
			System.out.println("A quantidade de números pares é de:"+quantPar);
			System.out.println("A quantidade de números ímpares é de:"+quantImpar);
		}

	}

}
