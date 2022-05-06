import java.util.Scanner;

/*
 * Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.
 */
public class Exercicio2 {

	public static void main(String[] args) {
		int anos,meses,totaisdias,dias;
		
		Scanner idade = new Scanner(System.in);
		
		System.out.println("Digite a sua idade somente em dias:");
		totaisdias = idade.nextInt();
		
		anos = totaisdias/365;
		meses = (totaisdias%365)/30;
		dias = (totaisdias%365)%30;
		
		System.out.println("Sua idade: "+anos+" anos, "+meses+" meses e "+dias+" dias.");

	}

}
