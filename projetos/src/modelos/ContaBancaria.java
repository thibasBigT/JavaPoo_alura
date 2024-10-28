package modelos;

public class ContaBancaria {
	private int numeroDeConta;
	private double saldo;
	private String titular;

	// setters:
	public void setnumeroDeConta(int numeroDeConta) {
		this.numeroDeConta = numeroDeConta;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	// Getters:
	public int getnumeroDeConta() {
		return numeroDeConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void exibeConta() {
		System.out.println(getnumeroDeConta());
		System.out.println(getSaldo());
		System.out.println(getTitular());
	}

}
