package github.jogoppt;

import java.util.Scanner;

public class Jogador {
    public String escolher(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Faça sua escolha para jogar:\n Pedra\n Papel\n Tesoura");
        String escolha = sc.nextLine().toLowerCase();

        while(!escolha.equals("pedra")&& !escolha.equals("papel")&&!escolha.equals("tesoura")){
            System.out.println("Escolha inválida, escolha novamente: ");
            escolha = sc.nextLine().toLowerCase();
        }
        return escolha;
    }
}
