import java.util.Scanner;

/*
 * Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
 */
public class Exercicio3 {

	public static void main(String[] args) {
		float[][] mat = new float[3][3];
		int contMaior = 0,l,c;
		
		Scanner leia = new Scanner(System.in);
		
		for(l=0;l<3;l++)
		{
			for(c=0;c<3;c++)
			{
				System.out.println("Entre com um número:");
				mat[l][c] = leia.nextFloat();
			}
		}
		for(l=0;l<3;l++)
		{
			for(c=0;c<3;c++)
			{
				if(mat[l][c]>10)
				{
					contMaior++;
				}
			}
		}
		System.out.println("Valores maiores que 10:"+contMaior);
	}

}
