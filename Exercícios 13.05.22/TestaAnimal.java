package Tarefa;

import java.util.Scanner;

public class TestaAnimal {
	public static void main (String[] args) {
		
		int opcao;
		Scanner leia = new Scanner(System.in);
		
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
				
		System.out.println("De qual animal você quer receber as informações? \n1-Cachorro \n2-Cavalo \n3-Preguiça");
		opcao = leia.nextInt();
		
		switch(opcao)
		{
		case 1:
			System.out.println("Animal: "+cachorro.getNome()+"\n Idade: "+cachorro.getIdade()+"\nEmitir som: "+cachorro.getEmitirSom());
			break;
		case 2:
			System.out.println("Animal: "+cavalo.getNome()+"\nIdade: "+cavalo.getIdade()+"\nEmitir som: "+cavalo.getEmitirSom());
			break;
		case 3:
			System.out.println("Animal: "+preguica.getNome()+"\nIdade: "+preguica.getIdade()+"\nEmitir som: "+preguica.getEmitirSom());
			break;
			default:
				System.out.println("Opção inválida.");
		}
	}

}
