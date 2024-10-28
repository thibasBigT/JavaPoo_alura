package modelos;

public class Filmes {
	private String nome;
	private int anoDeLancamento;
	private boolean incluidoNoPlano;
	private double somaDasAvaliacoes;
	private int totalDeAvaliacoes;
	private int duracaoEmMinutos;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setanoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;

	}

	public int getTotalDeAvaliacoes() {
		return totalDeAvaliacoes;
	}

	public void exibeFichaTecnica() {
		System.out.println("Nome do filme:" + nome);
		System.out.println("Ano de lancamento:" + anoDeLancamento);
		System.out.println("media de avaliacoes: " + pegaMedia());
	}

	public void avalia(double nota) {
		somaDasAvaliacoes += nota;
		totalDeAvaliacoes++;
	}

	public double pegaMedia() {
		double media = somaDasAvaliacoes / totalDeAvaliacoes;
		return media;
	}

}
