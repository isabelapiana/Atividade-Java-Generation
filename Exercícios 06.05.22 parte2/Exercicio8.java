import java.util.Scanner;

/*
 * O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.
 */
public class Exercicio8 {

	public static void main(String[] args) {
		float custofab;
		double custocons,dist,imp;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("O custo de fábrica é:");
		custofab = leia.nextFloat();
		
		custocons = custofab/0.27;
		imp = custocons*0.28;
		dist = custocons*0.45;
		
		System.out.println("O custo ao consumidor é de: "+custocons);

	}

}
