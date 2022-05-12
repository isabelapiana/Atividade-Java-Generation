/*
 * Crie uma classe patinete e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto patinete, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */
package teste;

public class PatineteTeste {

	public static void main(String[] args) {
		
		Patinete patinete1 = new Patinete("metálica",200,3,"Joaquim");
		
		patinete1.imprimirInfo();
		patinete1.setQuantidadeDeRodas(2);
		System.out.println("Quando "+patinete1.getProprietarie()+" crescer, seu patinete terá "+patinete1.getQuantidadeDeRodas()+" rodas.");

	}

}
