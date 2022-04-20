package Campeonato;

public abstract class Jogador {
    protected int numeroJogador;
    protected Time time;
    protected int numGolsCampeonato = 0;

    public Jogador(int numeroJogador, Time time){
        this.numeroJogador = numeroJogador;
        this.time = time;
    }

    public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public int getNumeroJogador() {
		return numeroJogador;
	}

    public void setnumeroJogador(int numeroJogador) {
        this.numeroJogador = numeroJogador;
    }

    public int getNumGolsCampeonato() {
        return numGolsCampeonato;
    }

    public void setNumGolsCampeonato(int numGolsPartida) {
        this.numGolsCampeonato += numGolsPartida;
    }

    public void mostrarJogador() {
        System.out.println("Num do jogador = " + numeroJogador + "\tTime: " + time.nomeTime);
    }

    protected abstract void setPosicao(String posicao);
}