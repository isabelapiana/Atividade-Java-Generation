package teste;

public class FuncionarioTeste {
	
	public static void main(String[] args) 
	{
		Funcionario funcionario1 = new Funcionario(1500,"Joaquina","atendente comercial");
		
		funcionario1.imprimirInfo();
		funcionario1.setCargo("CEO");
		funcionario1.setSalario(95000);
		
		System.out.println("*****************Funcion�rie promovide!!!*******************");
		System.out.println("A funcion�ria "+funcionario1.getNome()+" foi promovida a "+funcionario1.getCargo()+" e receber� "+funcionario1.getSalario());
	}
	
}
