/*
 * Crie uma classe patinete e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto patinete, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.
 */
package teste;

public class PatineteTeste {

	public static void main(String[] args) {
		
		Patinete patinete1 = new Patinete("met�lica",200,3,"Joaquim");
		
		patinete1.imprimirInfo();
		patinete1.setQuantidadeDeRodas(2);
		System.out.println("Quando "+patinete1.getProprietarie()+" crescer, seu patinete ter� "+patinete1.getQuantidadeDeRodas()+" rodas.");

	}

}
