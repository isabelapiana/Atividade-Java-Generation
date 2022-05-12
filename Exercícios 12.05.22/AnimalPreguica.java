package teste;

public class AnimalPreguica extends Animal{

	public AnimalPreguica(String nome, int idade) {
		super(nome, idade);
		
	}
	
	public void subirEmArvores()
	{
		System.out.println("****Subindo em árvores****");
	}

	public void emitirSomPreguica()
	{
		System.out.println("*emitindo sons pelas narinas...*");
	}

}
