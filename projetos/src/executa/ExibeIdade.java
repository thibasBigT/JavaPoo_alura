package executa;

import modelos.IdadePessoa;

public class ExibeIdade {

	public static void main(String[] args) {
		IdadePessoa minhaPessoa = new IdadePessoa();

		minhaPessoa.setIdade(18);
		minhaPessoa.setNome("Carlos");

		minhaPessoa.exibePessoa();

	}

}
