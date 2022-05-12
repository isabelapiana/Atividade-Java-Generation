package teste;

public class AnimalCachorroTeste {

	public static void main(String[] args) {
	
		AnimalCachorro cachorro = new AnimalCachorro("cachorro",3);
		
		cachorro.imprimirInfo();
		cachorro.emitirSom();
		cachorro.emitirSomCachorro();
		cachorro.correr();
	}
}
