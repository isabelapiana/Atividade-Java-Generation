import java.util.Scanner;

/*
 * Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
 */
public class Exercicio4 {

	public static void main(String[] args) {
		
		float numero;
		double rnumero,pnumero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um n�mero qualquer:");
		numero = leia.nextFloat();
		
		if(numero%2==0)
		{
			rnumero = Math.sqrt(numero);
			System.out.println("O n�mero � par e a raiz quadrada �:"+rnumero);
		}
		else
		{
			pnumero = Math.pow(numero, 2);
			System.out.println("O n�mero � �mpar e se elevado ao quadrado o resultado �:"+pnumero);
		}

	}

}
