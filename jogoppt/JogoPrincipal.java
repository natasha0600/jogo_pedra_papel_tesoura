package github.jogoppt;

public class JogoPrincipal {
    public static void main(String[] args) {
        Jogadas jogo = new Jogadas();
        Jogador j1 = new Jogador();
        Jogador j2 = new Jogador();

        jogo.jogar(j1,j2);

    }
}
