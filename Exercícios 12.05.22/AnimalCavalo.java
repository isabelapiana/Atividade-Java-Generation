package teste;

public class AnimalCavalo extends Animal {

	public AnimalCavalo(String nome, int idade) {
		super(nome, idade);
		
	}
	
	public void correr()
	{
		System.out.println("****correndo****");
	}

	public void emitirSomCavalo()
	{
		System.out.println("*relinchando...*");
	}


}
