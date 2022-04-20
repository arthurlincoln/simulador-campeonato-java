package Campeonato;

public class Atacante extends Jogador{
    protected String posicao;

	public Atacante(int numeroJogador, Time time, String posicao) {
		super(numeroJogador, time);
        this.posicao = "Atacante";
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