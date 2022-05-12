package teste;

public class produtoEletronicoTeste {

	public static void main(String[] args) {
		produtoEletronico celular = new produtoEletronico(1500,"metálica",2020,"Marcela","celular antigo");
		
		celular.imprimirInfo();
		System.out.println("**********************Mudança de aparelho!!!************************");
		celular.setAparelho("celular novo");
		celular.setPreco(2500);
		celular.imprimirInfo();

	}

}
