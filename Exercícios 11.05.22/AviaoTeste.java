/*
 * Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.
 */
package teste;

public class AviaoTeste {

	public static void main(String[] args) {
		
		Aviao aviao1 = new Aviao("branco","Airbus A320","PR-ABC",0);

		aviao1.acelera(870);
		aviao1.imprimirInfo();
	}

}
