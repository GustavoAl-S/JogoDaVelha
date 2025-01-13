import java.util.Scanner;

public class jogoApp {
    public static void main(String[] args) {

        jogoDaVelha jogo = new jogoDaVelha();

        Scanner sc = new Scanner(System.in);

        char jogadorAtual = 'X';

        jogo.inicializaTabuleiro();
        
        while (true) {

            jogo.exibirTabuleiro();

            boolean jogadaValida = false;
            do {

                System.out.println("\n Jogador " + jogadorAtual + " informe sua jogada: ");
                System.out.println("Linha 1, 2, 3:");
                int linha = sc.nextInt();
                System.out.println("Coluna 1, 2, 3: ");
                int coluna = sc.nextInt();

                // Diminui 1 no valor da variavel para que o vetor use a posiçao correta
                linha = linha - 1;
                coluna = coluna - 1;

                jogadaValida = jogo.jogada(linha, coluna, jogadorAtual);

            } while(!jogadaValida);

            jogo.exibirTabuleiro();

            if (jogo.verificarVitoria()){
                jogo.exibirTabuleiro();
                System.out.println("Jogador " + jogadorAtual + " venceu o jogo");
                break;
            }
            if (jogo.verificarEmpate()){
                jogo.exibirTabuleiro();
                System.out.println("O jogo empatou");
                break;
            }
            
            if (jogadorAtual == 'X') {
                jogadorAtual = 'O';
            }else if (jogadorAtual == 'O') {
                jogadorAtual = 'X';
            }
        }
    }
}
