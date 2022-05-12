/*
 * Crie uma classe patinete e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto patinete, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */
package teste;

public class Patinete {

	private String cor;
	private double preco;
	private int quantidadeDeRodas;
	private String proprietarie;
	
	public Patinete(String cor,double preco,int quantidadeDeRodas,String proprietarie)
	{
		this.cor = cor;
		this.preco = preco;
		this.proprietarie = proprietarie;
		this.quantidadeDeRodas = quantidadeDeRodas;
	}
	
	public void imprimirInfo()
	{
		System.out.println("O patinete de "+proprietarie+" é da cor "+cor+", possui "+quantidadeDeRodas+" rodas e custou "+preco+" reais.");
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidadeDeRodas() {
		return quantidadeDeRodas;
	}

	public void setQuantidadeDeRodas(int quantidadeDeRodas) {
		this.quantidadeDeRodas = quantidadeDeRodas;
	}

	public String getProprietarie() {
		return proprietarie;
	}

	public void setProprietarie(String proprietarie) {
		this.proprietarie = proprietarie;
	}
	
	
}
