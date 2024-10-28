package executa;
import modelos.Filmes;

public class Principal {

	public static void main(String[] args) {
		Filmes meuFilme = new Filmes();
		
		
		meuFilme.setNome("Wandinha");
		meuFilme.setanoDeLancamento(1989);
		meuFilme.avalia(7);
		meuFilme.avalia(8);
		meuFilme.avalia(5);
		meuFilme.avalia(10);
		
		meuFilme.exibeFichaTecnica();
		

	}

}
