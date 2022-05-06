import java.util.Scanner;

/*
 * Um sistema de equações lineares do tipo:
 * ax+by=c ; dx + ey=f
 * Pode ser resolvido segundo mostrado abaixo :
 * x= (ce-bf)/(ae-bd) ; y= (af-cd)/(ae-bd)
 * Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os
valores de x e y.
 */
public class Exercicio7 {

	public static void main(String[] args) {
		
		float a,b,c,d,e,f,x,y;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Dê o valor de a:");
		a = leia.nextFloat();
		System.out.println("Dê o valor de b:");
		b = leia.nextFloat();
		System.out.println("Dê o valor de c:");
		c = leia.nextFloat();
		System.out.println("Dê o valor de d:");
		d = leia.nextFloat();
		System.out.println("Dê o valor de e:");
		e = leia.nextFloat();
		System.out.println("Dê o valor de f:");
		f = leia.nextFloat();
		
		x = ((c*e)-(b*f))/((a*e)-(b*d));
		y = ((a*f)-(c*d))/((a*e)-(b*d));
		
		System.out.println("Valor de x:"+x);
		System.out.println("Valor de y:"+y);

	}

}
