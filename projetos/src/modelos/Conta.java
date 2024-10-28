package modelos;

public class Conta {
	// ATRIBUTOS//-------------------------------------------------------------------

	String nomeCliente;
	String cpfCliente;
	long numeroConta;
	double saldo;

	// METODOS//----------------------------------------------------------------------

	// SACAR//---------------------------------------------------------------------
	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			saldo = saldo - valor;
			System.out.println("Saque realizado");
			return true;
		}
		System.out.println("Saldo insuficiente");
		return false;
	}
	// -------------------------------------------------------------------------------

	// DEPOSITAR//--------------------------------------------------------------------

	public void depositar(double valor) {
		saldo = saldo + valor;
		System.out.println("Deposito realizado com sucesso");
	}
	// --------------------------------------------------------------------------------

	// TRANSFERIR//--------------------------------------------------------------------
	public void transferir(Conta conta, double valor) {
		if (this.sacar(valor)) {
			conta.depositar(valor);
		}

	}
	// -----------------------------------------------------------------------------

	// EXIBIR
	// SALDO//------------------------------------------------------------------
	public void exibirSaldo() {
		System.out.println("Nome: " + this.nomeCliente);
		System.out.println("Saldo: " + this.saldo);
	}

}
