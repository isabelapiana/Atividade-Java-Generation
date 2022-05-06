import java.util.Scanner;

/*
 * Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.
 */
public class Exercicio3 {

	public static void main(String[] args) {
		int seg,min,h,totalseg;
		
		Scanner tempo = new Scanner(System.in);
		
		System.out.println("Digite o tempo de duração em segundos:");
		totalseg = tempo.nextInt();
		
		h = (totalseg/60)/60;
		min = totalseg/60;
		seg = totalseg%60;
		
		System.out.println("Tempo: "+h+" horas, "+min+" minutos e "+seg+" segundos.");

	}

}
