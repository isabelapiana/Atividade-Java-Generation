package teste;

public class FuncionarioTeste {
	
	public static void main(String[] args) 
	{
		Funcionario funcionario1 = new Funcionario(1500,"Joaquina","atendente comercial");
		
		funcionario1.imprimirInfo();
		funcionario1.setCargo("CEO");
		funcionario1.setSalario(95000);
		
		System.out.println("*****************Funcionárie promovide!!!*******************");
		System.out.println("A funcionária "+funcionario1.getNome()+" foi promovida a "+funcionario1.getCargo()+" e receberá "+funcionario1.getSalario());
	}
	
}
