/*
 * Crie uma classe cliente e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.
 */
package teste;

public class ClienteTeste {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Jo�o",28598745632l,"atrasado");
		
		cliente1.imprimirInfo();

	}

}
