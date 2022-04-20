package Campeonato;

public class MeioCampo extends Jogador {
    protected String posicao;

	public MeioCampo(int numeroJogador, Time time, String posicao) {
		super(numeroJogador, time);
        this.posicao = "Meio-Campo";
	}

	@Override
	protected void setPosicao(String posicao) {
        this.posicao = posicao;
	}

    public void mostrarJogador() {
        System.out.println("Num do jogador = " + numeroJogador + "\tTime: " + time.nomeTime + 
                            "\tPosição:" + posicao + "\tGols do Campeonato: " + getNumGolsCampeonato());
    }
}
