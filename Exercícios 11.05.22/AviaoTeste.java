/*
 * Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */
package teste;

public class AviaoTeste {

	public static void main(String[] args) {
		
		Aviao aviao1 = new Aviao("branco","Airbus A320","PR-ABC",0);

		aviao1.acelera(870);
		aviao1.imprimirInfo();
	}

}
