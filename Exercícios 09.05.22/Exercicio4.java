import java.util.Scanner;

/*
 * Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: 
1- o número de pessoas calmas;
2- o número de mulheres nervosas;
3- o número de homens agressivos;
4- o número de outros calmos;
5- o número de pessoas nervosas com mais de 40 anos;
6- o número de pessoas calmas com menos de 18 anos.
 */
public class Exercicio4 {

	public static void main(String[] args) {
		int x=1,idade,quantMaior=0,quantMenor=0,sexo,temperamento,quantPC=0,quantMN=0,quantHA=0,quantPNMaior=0,quantPCMenor=0;
		
		Scanner leia = new Scanner(System.in);
		
		while(x<=150)
		{
			x++;
			System.out.println("Digite sua idade:");
			idade = leia.nextInt();
			System.out.println("Digite o seu sexo (1-feminino / 2-masculino / 3-Outros):");
			sexo = leia.nextInt();
			System.out.println("Digite o seu temperamento (1-Calmo / 2-Nervoso / 3-Agressivo):");
			temperamento = leia.nextInt();
			if(temperamento==1)
			{
				quantPC++;
			}
			if(sexo==1 && temperamento==2)
			{
				quantMN++;
			}
			if(sexo==2 && temperamento==3)
			{
				quantHA++;
			}
			if(temperamento==2 && idade>40)
			{
				quantPNMaior++;
			}
			if(temperamento==1 && idade<18)
			{
				quantPCMenor++;
			}
		}
		System.out.println("Número de pessoas calmas:"+quantPC);
		System.out.println("Número de mulheres nervosas:"+quantMN);
		System.out.println("Número de homens agressivos:"+quantHA);
		System.out.println("Número de pessoas nervosas com mais de 40 anos:"+quantPNMaior);
		System.out.println("Número de pessoas calmas com menos de 18 anos:"+quantPCMenor);

	}

}
