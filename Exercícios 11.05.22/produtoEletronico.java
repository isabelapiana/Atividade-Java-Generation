/*
 * Crie uma classe produto eletr�nico e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto produto eletr�nico,
defina as instancias deste objeto e apresente as informa��es deste objeto
no console. 
 */
package teste;

public class produtoEletronico {

	double preco;
	String cor;
	int anoLancamento;
	String proprietario;
	String aparelho;
	
	public produtoEletronico(double preco,String cor,int anoLancamento,String proprietario,String aparelho)
	{
		this.preco = preco;
		this.cor = cor;
		this.anoLancamento = anoLancamento;
		this.proprietario = proprietario;
		this.aparelho = aparelho;
	}
	
	public void imprimirInfo()
	{
		System.out.println("O "+aparelho+", da cor "+cor+", lan�ado em "+anoLancamento+", pertence ao(�) "+proprietario+" e custou "+preco);
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public String getAparelho() {
		return aparelho;
	}

	public void setAparelho(String aparelho) {
		this.aparelho = aparelho;
	}
	
}
