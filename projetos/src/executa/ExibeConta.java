package executa;
import modelos.ContaBancaria;
public class ExibeConta {

	public static void main(String[] args) {
		ContaBancaria minhaConta = new ContaBancaria();
		
		
		minhaConta.setnumeroDeConta(12345412);
		minhaConta.setSaldo(1500);
		minhaConta.setTitular("Joao");
		
		
		minhaConta.exibeConta();
		
	}

}
