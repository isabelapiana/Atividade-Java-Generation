package Tarefa;

public interface Animal {
	
	public String nomeInterface = "Animal";
	
	abstract public String getNome();
	abstract public void setNome(String nome);
	abstract public int getIdade();
	abstract public void setIdade(int idade);
	abstract public String getEmitirSom();

}
