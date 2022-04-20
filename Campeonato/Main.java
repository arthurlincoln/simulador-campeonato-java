package Campeonato;

import java.util.Scanner;

public class Main {
        
    protected static Scanner leitor = new Scanner(System.in);
    
    public static void main(String[] args){ 
        int opcao = -1;
         
        //Procedimentos.informarQuantidade();

        //Procedimentos.informarNomeTime(); 
        
        Procedimentos.bancoDeDados();
        Procedimentos.tabela(); 
        //cls();

        do {
            Procedimentos.menu();

            System.out.print("Selecione um opção: ");
            opcao = leitor.nextInt(); 
                
            Procedimentos.cls(); 
            
            switch (opcao) {
                case 1: Procedimentos.jogos(); break;
                case 2: Procedimentos.estatisticas(); break;
                case 3: Procedimentos.listarJogadores(); break;
                default: System.out.println("Opção Inválida"); break;
            }
        } while (opcao != 0);
    
    }
}
