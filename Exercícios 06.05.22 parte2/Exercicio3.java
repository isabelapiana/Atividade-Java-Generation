import java.util.Scanner;

/*
 * Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.
 */
public class Exercicio3 {

	public static void main(String[] args) {
		int seg,min,h,totalseg;
		
		Scanner tempo = new Scanner(System.in);
		
		System.out.println("Digite o tempo de dura��o em segundos:");
		totalseg = tempo.nextInt();
		
		h = (totalseg/60)/60;
		min = totalseg/60;
		seg = totalseg%60;
		
		System.out.println("Tempo: "+h+" horas, "+min+" minutos e "+seg+" segundos.");

	}

}
