/*
 * Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros inteiros. O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.

 */
public class Exercicio1 {

	public static void main(String[] args) {
		int[] A = new int[6];
		int x,y,soma;
		
		for(x=0;x<6;x++)
		{
			A[0]=1;
			A[1]=0;
			A[2]=5;
			A[3]=-2;
			A[4]=-5;
			A[5]=7;
			soma=A[0]+A[1]+A[2]+A[3]+A[4]+A[5];
		}
		soma=A[0]+A[1]+A[2]+A[3]+A[4]+A[5];
		System.out.println("A soma dos valores do primeiro vetor �:"+soma);
		for(y=0;y<6;y++)
		{
			A[0]=1;
			A[1]=0;
			A[2]=5;
			A[3]=100;
			A[4]=-5;
			A[5]=7;
		}
		System.out.println("Vetor A ap�s a mudan�a na posi��o 4:\n"+A[0]+"\n"+A[1]+"\n"+A[2]+"\n"+A[3]+"\n"+A[4]+"\n"+A[5]);
		

	}

}
