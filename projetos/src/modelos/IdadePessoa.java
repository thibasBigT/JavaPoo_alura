package modelos;

public class IdadePessoa {
	private String nome;
	private int idade;

	private String verificaIdade(int idade) {
		if (idade >= 18) {
			return "Y";
		} else {
			return "N";
		}
	}

	// setters
	public void setNome(String nome) {
		this.nome = nome;
	}


	// getters:

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}
	
	// metodos uteis:
	
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void exibePessoa() {
		System.out.println("Nome: " + nome + "\nIdade: " + idade);
		System.out.println("Maior de idade[" + verificaIdade(idade) + "]");
	}
}
