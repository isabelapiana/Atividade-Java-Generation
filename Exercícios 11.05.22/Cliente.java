/*
 * Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */
package teste;

public class Cliente {
	private String nomeCliente;
	private long cpfCliente;
	private String situacaoPagamento;
	
	public Cliente(String nomeCliente,long cpfCliente,String situacaoPagamento)
	{
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		this.situacaoPagamento = situacaoPagamento;
	}
	
	public void imprimirInfo()
	{
		System.out.println("O cliente "+nomeCliente+" inscrito no cpf "+cpfCliente+" está cmom o pagamento "+situacaoPagamento);
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public long getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(int cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public String getSituacaoPagamento() {
		return situacaoPagamento;
	}

	public void setSituacaoPagamento(String situacaoPagamento) {
		this.situacaoPagamento = situacaoPagamento;
	}
	

}
