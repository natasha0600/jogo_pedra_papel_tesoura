package github.jogoppt;

public class Jogadas {
    public void jogar(Jogador jogador1, Jogador jogador2){
        String escolhaJ1 = jogador1.escolher();
        String escolhaJ2 = jogador2.escolher();

        System.out.println("Jogador 1 escolheu: "+escolhaJ1);
        System.out.println("Jogador 2 escolheu: "+escolhaJ2);

        if(escolhaJ1.equals(escolhaJ2)){
            System.out.println("Empate!");
        }
        else if(escolhaJ1.equals("pedra")&& escolhaJ2.equals("tesoura") || escolhaJ1.equals("tesoura")&& escolhaJ2.equals("papel")|| escolhaJ1.equals("papel")&& escolhaJ2.equals("pedra")) {
            System.out.println("Jogador 1 venceu!");
        }
        else{
            System.out.println("Jogador 2 venceu!");
        }
    }
}
