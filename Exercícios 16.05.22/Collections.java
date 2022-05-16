/*
 * Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o programa deverá atender as seguintes funcionalidades:

Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.

 */
package Tarefa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Collections {
	public static void main(String[] args) {
		
		List<String> lista = new ArrayList();
		Scanner leia = new Scanner(System.in);
		int op;
		
		
		do
		{
			System.out.println("O que você deseja fazer? \n1)Adicionar um dado na lista. \n2)Remover um dado da lista. \n3)Atualizar os dados da lista. \n4)Apresentar os dados da lista.");
			op = leia.nextInt();
			switch(op)
			{
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o dado a ser adicionado:");
				String dado1 = leia.nextLine();
				lista.add(dado1);
				break;
			case 2:
				leia.nextLine();
				System.out.println("\nInforme o dado a ser removido:");
				String dado2 = leia.nextLine();
				if(lista.contains(dado2))
				{
					lista.remove(dado2);
				}
				else
				{
					System.out.println("\nDado não encontrado.");
				}
				break;
			case 3:
				leia.nextLine();
				System.out.println("\nInforme o dado a ser substituído:");
				String dado3 = leia.nextLine();
				if(lista.contains(dado3))
				{
					lista.remove(dado3);
				}
				else
				{
					System.out.println("\nDado não encontrado.");
				}
				System.out.println("\nInforme o novo dado:");
				String dado4 = leia.nextLine();
				lista.add(dado4);
				break;
			case 4:
				leia.nextLine();
				System.out.println("\nDados da lista: \n"+lista);
				break;
			default:
				leia.nextLine();
				System.out.println("\nOpção inválida!");
				break;
			}
		}
		while(op!=0);
	}
}
