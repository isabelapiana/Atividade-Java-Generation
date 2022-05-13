package Tarefa;

public class Cachorro implements Animal {
	
	@Override
	public String getNome() {
		return "Cachorro";
	}

	@Override
	public void setNome(String nome) {
		
	}

	@Override
	public int getIdade() {
		return 3;
	}

	@Override
	public void setIdade(int idade) {
		
	}

	@Override
	public String getEmitirSom() {
		return "***Latindo...***";
	}
	
	

}
