import java.util.Scanner;

/*
 * Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor da constante deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.
 */
public class Exercicio4 {

	public static void main(String[] args) {
		float[][] matA = new float[2][2];
		float[][] matB = new float[2][2];
		float[][] matC = new float[2][2];
		float[][] matD = new float[2][2];
		int l,c,opcao;
		final float k;
		
		Scanner leia = new Scanner(System.in);
		
		for(l=0;l<2;l++)
		{
			for(c=0;c<2;c++)
			{
				System.out.printf("Insira o elemento M[%d][%d] da primeira matriz:",l+1,c+1);
				matA[l][c] = leia.nextFloat();
			}
		}
		for(l=0;l<2;l++)
		{
			for(c=0;c<2;c++)
			{
				System.out.printf("Insira o elemento M[%d][%d] da segunda matriz:",l+1,c+1);
				matB[l][c] = leia.nextFloat();
			}
		}
		System.out.println("Menu de opções:\n1 - Somar as duas matrizes \n2 - Subtrair a primeira matriz da segunda \n3 - Adicionar uma constante às duas matrizes \n4 - Imprimir as matrizes");
		opcao = leia.nextInt();
		
		switch (opcao)
		{
		case 1:
			System.out.println("Soma das duas matrizes: \n");
			for(l=0;l<2;l++)
			{
				for(c=0;c<2;c++)
				{
					matC[l][c]=matA[l][c]+matB[l][c];
					System.out.println(matC[l][c]);
				}
			}
			
			break;
		case 2:
			System.out.println("Subtração da segunda matriz pela primeira: \n");
			for(l=0;l<2;l++)
			{
				for(c=0;c<2;c++)
				{
					matD[l][c]=matB[l][c]-matA[l][c];
					System.out.println(matD[l][c]);
				}
			}
			break;
		case 3:
			System.out.println("Qual o valor que você gostaria de adicionar?");
			k = leia.nextFloat();
			System.out.println("Resultado da primeira matriz somada à constante: \n");
			for(l=0;l<2;l++)
			{
				for(c=0;c<2;c++)
				{
					matA[l][c] += k;
					matB[l][c] += k;
					System.out.println(matA[l][c]);
				}
			}
			System.out.println("\nResultado da segunda matriz somada à constante: \n");
			for(l=0;l<2;l++)
			{
				for(c=0;c<2;c++)
				{
					matB[l][c] += k;
					System.out.println(matB[l][c]);
				}
			}
			break;
		case 4:
			System.out.println("Primeira matriz: \n");
			for(l=0;l<2;l++)
			{
				for(c=0;c<2;c++)
				{
					System.out.println(matA[l][c]);
				}
			}
			System.out.println("\nSegunda matriz: \n");
			for(l=0;l<2;l++)
			{
				for(c=0;c<2;c++)
				{
					System.out.println(matB[l][c]);
				}
			}
		}

	}

}
