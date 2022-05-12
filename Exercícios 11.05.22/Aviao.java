/*
 * Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */
package teste;

public class Aviao {
	private String cor;
	private String modelo;
	private String registro;
	private double velocidadeAtual;
	
	public Aviao(String cor,String modelo,String registro,double velocidadeAtual)
	{
		this.cor = cor;
		this.modelo = modelo;
		this.registro = registro;
		this.velocidadeAtual = velocidadeAtual;
	}
	
	void acelera(double quantidade)
	{
		double velocidadeNova = this.velocidadeAtual+quantidade;
		this.velocidadeAtual = velocidadeNova;
	}
	
	void imprimirInfo()
	{
		System.out.println("Avião do modelo "+modelo+", da cor "+cor+", inscrito no registro "+registro+", está com a velocidade: "+velocidadeAtual+"km/h");
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	

}
