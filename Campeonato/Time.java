package Campeonato;

public class Time {
    protected String nomeTime;
    
    public Time(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public String getTime() {
        return nomeTime;
    }
 
    public void setTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    @Override
    public String toString() {
        return String.format("%s\t", nomeTime.toUpperCase());
    }
}