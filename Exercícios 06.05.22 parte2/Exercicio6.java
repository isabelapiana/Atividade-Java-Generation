import java.util.Scanner;

/*
 * Construa um programa que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula

que efetua tal cálculo é: d*d = ((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1))
 */
public class Exercicio6 {

	public static void main(String[] args) {
		float x1,x2,y1,y2;
		double d;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor de x1:");
		x1 = leia.nextFloat();
		System.out.println("Digite o valor de x2:");
		x2 = leia.nextFloat();
		System.out.println("Digite o valor de y1:");
		y1 = leia.nextFloat();
		System.out.println("Digite o valor de y2:");
		y2 = leia.nextFloat();
		
		d = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
		
		System.out.println("Resultado: "+d);

	}

}
