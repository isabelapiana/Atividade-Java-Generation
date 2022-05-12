/*
 * Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
características de forma que tudo o que for comum a todos os animais fique na classe
Animal:
Cachorro: nome;idade;deve emitir som;deve correr.
Cavalo:nome;idade;deve emitir som;deve correr.
Preguiça:nome;idade;deve emitir som;deve subir em árvores.
 */
package teste;

public class AnimalCachorro extends Animal{

	public AnimalCachorro(String nome, int idade) {
		super(nome, idade);
		
	}
	
	public void correr()
	{
		System.out.println("****correndo****");
	}

	public void emitirSomCachorro()
	{
		System.out.println("*latindo...*");
	}
	

}
