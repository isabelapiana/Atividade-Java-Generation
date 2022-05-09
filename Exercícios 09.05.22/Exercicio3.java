import java.util.Scanner;

/*
 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99.
 */
public class Exercicio3 {

	public static void main(String[] args) {
		int idade,quantMenor=0,quantMaior=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a idade:");
		idade = leia.nextInt();
		
		while(idade!=-99)
		{
			System.out.println("Digite a idade (para encerrar, digite -99)");
			idade = leia.nextInt();
					
					if(idade<21)
					{
						quantMenor++;
					}
					else if(idade>50)
					{
						quantMaior++;
					}
		}
		System.out.println("Pessoas com menos de 21 anos:"+quantMenor);
		System.out.println("Pessoas com mais de 50 anos:"+quantMaior);

	}

}
