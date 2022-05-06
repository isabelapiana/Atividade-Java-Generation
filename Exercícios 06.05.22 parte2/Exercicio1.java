import java.util.Scanner;

/*
 * Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.
 */
public class Exercicio1 {

	public static void main(String[] args) {
		
		int anos,meses,dias,diastotais;
		
		Scanner idade = new Scanner(System.in);
		
		System.out.println("Digite a sua idade em anos:");
		anos = idade.nextInt();
				
		System.out.println("\nDigite a sua idade em meses:");
		meses = idade.nextInt();
		
		System.out.println("\nDigite a sua idade em dias:");
		dias = idade.nextInt();
		
		diastotais = (anos*365)+(meses*30)+dias;
		
		System.out.println("Sua idade somente em dias é:"+diastotais);

	}

}
