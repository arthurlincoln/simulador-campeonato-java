package Campeonato;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Procedimentos {
    
    protected static ArrayList<Estatisticas> campeonato = new ArrayList<Estatisticas>();
    protected static Estatisticas time;
    protected static Estatisticas auxiliar;
    protected static Estatisticas auxiliarJogador;

    protected static ArrayList<Jogador> artilheiros = new ArrayList<Jogador>();

    protected static int golsA, golsB, gols, contadorGolsdoTime = 0, contadorGolsAAux, contadorGolsBAux;
    protected static int idJogador, numJogador;
    protected static int quantTimes;
   
    protected static String tabela[] = {"", "PTS", "J", "V", "E", "D", "SG", "GM", "GS"};
        
    protected static Scanner leitor = new Scanner(System.in);
    protected static boolean continueLoop = true;

    public static void bancoDeDados(){
        Estatisticas time1 = new Estatisticas("TimeA");
        Estatisticas time2 = new Estatisticas("TimeB");
        Estatisticas time3 = new Estatisticas("TimeC");
        Estatisticas time4 = new Estatisticas("TimeD");
        campeonato.add(time1);
        campeonato.add(time2);
        campeonato.add(time3);
        campeonato.add(time4);

        artilheiros.add(new Atacante(11, time1, "Atacante"));
        artilheiros.add(new Atacante(10, time1, "Atacante"));
        artilheiros.add(new Atacante(9, time1, "Atacante"));
        artilheiros.add(new MeioCampo(8, time1, "MeioCampo"));
        artilheiros.add(new MeioCampo(7, time1, "MeioCampo"));
        artilheiros.add(new MeioCampo(6, time1, "MeioCampo"));
        artilheiros.add(new Defensor(5, time1, "Defensor"));
        artilheiros.add(new Defensor(4, time1, "Defensor"));
        artilheiros.add(new Defensor(3, time1, "Defensor"));
        artilheiros.add(new Defensor(2, time1, "Defensor"));
        artilheiros.add(new Goleiro(1, time1, "Goleiro"));

        artilheiros.add(new Atacante(11, time2, "Atacante"));
        artilheiros.add(new Atacante(10, time2, "Atacante"));
        artilheiros.add(new Atacante(9, time2, "Atacante"));
        artilheiros.add(new MeioCampo(8, time2, "MeioCampo"));
        artilheiros.add(new MeioCampo(7, time2, "MeioCampo"));
        artilheiros.add(new MeioCampo(6, time2, "MeioCampo"));
        artilheiros.add(new Defensor(5, time2, "Defensor"));
        artilheiros.add(new Defensor(4, time2, "Defensor"));
        artilheiros.add(new Defensor(3, time2, "Defensor"));
        artilheiros.add(new Defensor(2, time2, "Defensor"));
        artilheiros.add(new Goleiro(1, time2, "Goleiro"));

        artilheiros.add(new Atacante(11, time3, "Atacante"));
        artilheiros.add(new Atacante(10, time3, "Atacante"));
        artilheiros.add(new Atacante(9, time3, "Atacante"));
        artilheiros.add(new MeioCampo(8, time3, "MeioCampo"));
        artilheiros.add(new MeioCampo(7, time3, "MeioCampo"));
        artilheiros.add(new MeioCampo(6, time3, "MeioCampo"));
        artilheiros.add(new Defensor(5, time3, "Defensor"));
        artilheiros.add(new Defensor(4, time3, "Defensor"));
        artilheiros.add(new Defensor(3, time3, "Defensor"));
        artilheiros.add(new Defensor(2, time3, "Defensor"));
        artilheiros.add(new Goleiro(1, time3, "Goleiro"));

        artilheiros.add(new Atacante(11, time4, "Atacante"));
        artilheiros.add(new Atacante(10, time4, "Atacante"));
        artilheiros.add(new Atacante(9, time4, "Atacante"));
        artilheiros.add(new MeioCampo(8, time4, "MeioCampo"));
        artilheiros.add(new MeioCampo(7, time4, "MeioCampo"));
        artilheiros.add(new MeioCampo(6, time4, "MeioCampo"));
        artilheiros.add(new Defensor(5, time4, "Defensor"));
        artilheiros.add(new Defensor(4, time4, "Defensor"));
        artilheiros.add(new Defensor(3, time4, "Defensor"));
        artilheiros.add(new Defensor(2, time4, "Defensor"));
        artilheiros.add(new Goleiro(1, time4, "Goleiro"));
    }

    //Menu de opções
    public static void menu(){
        System.out.println("\n\tMENU DE OPÇÕES\n");
        System.out.println("1 - COLOCAR RESULTADOS");
        System.out.println("2 - VER ESTATÍSTICAS");
        System.out.println("3 - VER LISTA DE JOGADORES ARTILHEIROS");
        System.out.println("0 - ENCERRAR PROGRAMA");
        System.out.println(" ");
       
    }

    //Método para limpar o buffer
    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }

    //Informar o numero de times
    public static void informarQuantidade(){
        System.out.printf("Informe quantos times tem no campeonato: ");
        quantTimes = leitor.nextInt();
    }

    //Cadastrar os Times
    public static void informarNomeTime() { 
       clearBuffer(leitor); 
       for (int i = 0; i < quantTimes; i++) {   
            System.out.printf("Digite o nome do %dº time: ", i + 1);
            String nomeTime = leitor.nextLine();
            //Criar o objeto do time
            time = new Estatisticas(nomeTime);
            //Adicionamos o objeto na lista do campeonato
            campeonato.add(time);
        }
    }

    //Para exibir a lista de confrontos
    public static void tabela() {
        System.out.println("\nTABELA: ");
        for (int i = 0; i < campeonato.size(); i++) {
            for (int j = i + 1; j < campeonato.size(); j++) {
                System.out.printf("%s x %s\n", campeonato.get(i).getTime(), campeonato.get(j).getTime());
            }
        }
    }
    
    public static void jogos() {
        
        System.out.println("Confrontos Diretos: \n");
        
        for (int i = 0; i < campeonato.size(); i++) {
            for (int j = i + 1; j < campeonato.size(); j++) {
                contadorGolsdoTime = 0;
                
                System.out.printf("%s x %s\n", campeonato.get(i).getTime(), campeonato.get(j).getTime());
                
                do {   
                    try {
                        System.out.printf("Informe os gols do %s: ", campeonato.get(i).getTime()); 
                        golsA = leitor.nextInt();//2
                        continueLoop = false;

                    } catch (InputMismatchException erro) {
                        System.err.println("Forneça apenas números\nError:" + erro);
                        leitor.nextLine();
                    }
                } while (continueLoop == true);
                /*Tratamento de Imput */
                contadorGolsAAux = golsA;
                    
                do {
                    try {    
                        System.out.printf("Informe os gols do %s: ", campeonato.get(j).getTime()); 
                        golsB = leitor.nextInt();//0
                        continueLoop = false;    
                        
                    } catch (InputMismatchException erro){
                        System.err.println("Forneça apenas números\nError:" + erro);
                        leitor.nextLine();
                    }
                } while (continueLoop == true);
                    /*Tratamento de Imput */
                contadorGolsBAux = golsB;

                campeonato.get(i).setGolsMarcados(golsA);
                campeonato.get(i).setGolsSofridos(golsB);
                
                campeonato.get(j).setGolsMarcados(golsB);
                campeonato.get(j).setGolsSofridos(golsA);
                
                //Associar o gols do time A com seus jogadores
                while (contadorGolsdoTime < golsA) {//2<2
                    artilheiroJogoMandante(campeonato.get(i).getTime());
                } 

                contadorGolsdoTime = 0;
                
                while (contadorGolsdoTime < golsB) {//
                    artilheiroJogoVisitante(campeonato.get(j).getTime());
                }
                contadorGolsdoTime = 0;
                if (golsA > golsB) { //VITORIA DO TIME A
                    campeonato.get(i).setVitorias(1);
                    campeonato.get(i).setPontos(3);

                    campeonato.get(j).setDerrotas(1);
                    campeonato.get(j).setPontos(0);
                }
                else if (golsB > golsA) { //VITORIA DO TIME B
                    campeonato.get(j).setVitorias(1);
                    campeonato.get(j).setPontos(3);

                    campeonato.get(i).setDerrotas(1);
                    campeonato.get(i).setPontos(0);
                }
                else { //EMPATE
                    campeonato.get(i).setEmpates(1);
                    campeonato.get(i).setPontos(1);

                    campeonato.get(j).setEmpates(1);
                    campeonato.get(j).setPontos(1);
                }

                campeonato.get(i).setNumeroJogos(1);
                campeonato.get(j).setNumeroJogos(1);

                cls();
            }
        }
    }

    public static void listarJogadores(){
        System.out.printf("\nARTILHARIA:\n\n");

       /* for (int i = 0; i < artilheiros.size(); i++) {
            for (int j = i + 1; j < artilheiros.size(); j++) {
                if (artilheiros.get(i).numGolsCampeonato < artilheiros.get(j).numGolsCampeonato) {
                    auxiliarJogador = campeonato.get(i);
                    campeonato.set(i, campeonato.get(j));
                    campeonato.set(j, auxiliarJogador);
                }
            }
        }
        
        for (int i = 0; i < artilheiros.size(); i++) {
            System.out.println(artilheiros.get(i));
        } 
        */
        
        for (Jogador jogador:artilheiros){
            jogador.mostrarJogador();
        }

    }

    public static boolean procurarJogador(String time){
        do {
            try {
                System.out.println("Informe o número do jogador do " + time);
                numJogador = leitor.nextInt();
                continueLoop = false;
            } catch (InputMismatchException erro){
                System.err.println("Forneça apenas números\nError:" + erro);
                leitor.nextLine();//Limpeza buffer
            }
        } while(continueLoop == true);
        boolean acha = false;

        //System.out.println(numJogador);
        if (continueLoop == false) {
            acha = false;
            idJogador = 0;
            while (acha == false && idJogador < artilheiros.size()) {
                if (time.equals(artilheiros.get(idJogador).getTime().getTime()) && numJogador == artilheiros.get(idJogador).getNumeroJogador()){
                    acha = true;
                } 
                else {
                    acha = false;
                    idJogador++;
                }
            } 
        }
        clearBuffer(leitor);
        return acha;
    }

    public static void artilheiroJogoMandante(String time){    
        if (procurarJogador(time) == true){
            System.out.println("Informe quantos gols ele marcou: ");
            gols = leitor.nextInt();//2
            
            if (gols <= contadorGolsAAux){//2<=1
                artilheiros.get(idJogador).setNumGolsCampeonato(gols);//1
                contadorGolsdoTime += gols;//1
                contadorGolsAAux -= gols; 
            } 
            else {
                System.out.println("A entrada fornecida é maior que a quantidade de gols marcada pelo time, informe um valor correto: ");
            }
        }
        else {
            System.out.println("Jogador não está cadastrado");
        }
    }

    public static void artilheiroJogoVisitante(String time){
        if (procurarJogador(time) == true){
            System.out.println("Informe quantos gols ele marcou: ");
            gols = leitor.nextInt();//2
            if (gols <= contadorGolsBAux){//2<=1
                artilheiros.get(idJogador).setNumGolsCampeonato(gols);//1
                contadorGolsdoTime += gols;//1
                contadorGolsBAux -= gols; 
            } 
            else {
                System.out.println("A entrada fornecida é maior que a quantidade de gols marcada pelo time, informe um valor correto: ");
            }
        }
        else {
            System.out.println("Jogador não está cadastrado");
        }
    }


    public static void estatisticas() {
        
        System.out.printf("\tESTATÍSTICAS\n\n");
        
        for (int i = 0; i < campeonato.size(); i++) {
            campeonato.get(i).setSaldoDeGols();
        }
        
        for (int i = 0; i < campeonato.size(); i++) { //MÉTODO DA BOLHA
            for (int j = i + 1; j < campeonato.size(); j++) {
                
                if (campeonato.get(i).getPontos() < campeonato.get(j).getPontos()) {
                    auxiliar = campeonato.get(i);
                    campeonato.set(i, campeonato.get(j));
                    campeonato.set(j, auxiliar);
                }

                else if (campeonato.get(i).getPontos() == campeonato.get(j).getPontos()) {
                    if (campeonato.get(i).getVitorias() < campeonato.get(j).getVitorias()) {
                        auxiliar = campeonato.get(i);
                        campeonato.set(i, campeonato.get(j));
                        campeonato.set(j, auxiliar);
                    }
                    else if (campeonato.get(i).getVitorias() == campeonato.get(j).getVitorias()) {
                        if (campeonato.get(i).getSaldoDeGols() < campeonato.get(j).getSaldoDeGols()) {
                            auxiliar = campeonato.get(i);
                            campeonato.set(i, campeonato.get(j));
                            campeonato.set(j, auxiliar);
                        }
                        else if (campeonato.get(i).getSaldoDeGols() == campeonato.get(j).getSaldoDeGols()) {
                            if (campeonato.get(i).getGolsMarcados() < campeonato.get(j).getGolsMarcados()) {
                                auxiliar = campeonato.get(i);
                                campeonato.set(i, campeonato.get(j));
                                campeonato.set(j, auxiliar);
                            }
                        }    
                    }
                }
            }
        }

        for (int i = 0; i < tabela.length; i++) {
            System.out.printf("%s\t", tabela[i]);
        }

        System.out.println("");

        for (int i = 0; i < campeonato.size(); i++) {
            System.out.println(campeonato.get(i)); 
        }
    }
    
    public static void cls() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } 
        catch(Exception E){
            System.out.println(E);
        }
    }

}
