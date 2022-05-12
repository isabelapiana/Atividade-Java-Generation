/*
 * Crie uma classe funcion�rio e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto funcion�rio, defina as
instancias deste objeto e apresente as informa��es deste objeto no
console.
 */
package teste;

public class Funcionario {
	private double salario;
	private String nome;
	private String cargo;
	
	public void imprimirInfo()
	{
		System.out.println("O(a) funcion�rio(a) "+nome+" foi contratado(a) como "+cargo+" e recebe "+salario);
	}
	
	public Funcionario(double salario,String nome,String cargo)
	{
		this.cargo = cargo;
		this.nome = nome;
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
	
	
}
