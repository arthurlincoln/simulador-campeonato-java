package Campeonato;

public class Estatisticas extends Time{
    protected int golsMarcados = 0;
    protected int golsSofridos = 0;
    protected int vitorias = 0;
    protected int empates = 0;
    protected int derrotas = 0;
    protected int numeroJogos = 0;
    protected int saldoDeGols;
    protected int pontos = 0;
    
    public Estatisticas(String nomeTime) {
        super(nomeTime);
	}

    public int getVitorias() {
        return vitorias;
    }

    public int getEmpates() {
        return empates;
    }
    
    public int getDerrotas() {
        return derrotas;
    }
    
    public int getNumeroJogos() {
        return numeroJogos;
    }
    
    public int getSaldoDeGols() {
        return saldoDeGols;
    }
    
    public int getPontos() {
        return pontos;
    }

    public int getGolsMarcados() {
        return golsMarcados;
    }
    
    public int getGolsSofridos() {
        return golsSofridos;
    }
    
    public void setVitorias(int vitorias) {
        this.vitorias += vitorias;
    }

    public void setEmpates(int empates) {
        this.empates += empates;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas += derrotas;
    }

    public void setNumeroJogos(int numeroJogos) {
        this.numeroJogos += numeroJogos;
    }

    public void setSaldoDeGols() {
        this.saldoDeGols = (golsMarcados - golsSofridos);
    }

    public void setPontos(int pontos) {
        this.pontos += pontos;
    }

    public void setGolsMarcados(int golsMarcados) {
        this.golsMarcados += golsMarcados;
    }

    public void setGolsSofridos(int golsSofridos) {
        this.golsSofridos += golsSofridos;
    }

    @Override
    public String toString() {
        return String.format("%s\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t", nomeTime.toUpperCase(), pontos, numeroJogos,
                                                                    vitorias, empates, derrotas, saldoDeGols,
                                                                    golsMarcados, golsSofridos);
    }
}

