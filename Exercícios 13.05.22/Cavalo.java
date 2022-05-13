package Tarefa;

public class Cavalo implements Animal{

	@Override
	public String getNome() {
		return "Cavalo";
	}

	@Override
	public void setNome(String nome) {
		
	}

	@Override
	public int getIdade() {
		return 17;
	}

	@Override
	public void setIdade(int idade) {
		
	}

	@Override
	public String getEmitirSom() {
		return "***Relinchando***";
	}

}
