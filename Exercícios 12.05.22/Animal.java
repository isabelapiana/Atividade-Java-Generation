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

public class Animal {
	private String nome;
	private int idade;
	
	public Animal(String nome,int idade)
	{
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void imprimirInfo()
	{
		System.out.println("Animal: "+getNome()+"\nIdade: "+getIdade());
	}
	
	public void emitirSom()
	{
		System.out.println("****Emitir som:****");
	}

}
