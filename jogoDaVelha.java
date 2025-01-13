
public class jogoDaVelha {
    
    static char[][] velha = new char[3][3];

    public void inicializaTabuleiro(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                velha[i][j] = ' ';
            }
        }
    }

    public void exibirTabuleiro() {
        System.out.println("-----------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(velha[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-----------");
        }
    }


    //Metodo para o jogador realizar uma jogada
    public boolean jogada(int linha, int coluna, char jogador){

        //Verifica se o numero que o usuario digitar é valido e se a linha e coluna estão vazios
        if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && velha[linha][coluna] == ' '){
            velha[linha][coluna] = jogador;
            return true;
        }else{
            System.out.println("\n Movimento invalido ou posição já preenchida");
            return false;
        }
        
    }

    public boolean verificarVitoria(){
        
        //Entra em um loop para verfificar cada linha
        //verifica se o primeiro elemento está vazio, para comprar com os outros da mesma linha
        for (int i = 0; i < 3; i++) {
            if (velha[i][0] != ' ' && velha[i][0] == velha[i][1] && velha[i][0] == velha[i][2]) {
                return true;
            }
        }

        //verificar colunas
        for (int i = 0; i < 3; i++) {
            if (velha[0][i] != ' ' && velha[0][i] == velha[1][i] && velha[0][i] == velha[2][i]) {
                return true;
            }
        }
        
        //verificar diagonais
        if (velha [0][0] != ' ' && velha[0][0] == velha[1][1] && velha[0][0] == velha[2][2]) {
            return true;
        }
        if (velha [0][2] != ' ' && velha[0][2] == velha[1][1] && velha[0][2] == velha[2][0]) {
            return true;
        }
        
        return false;
    }


    public boolean verificarEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                //se tiver um espaço vazio ele retorna falso e o jogo continua
                if (velha[i][j] == ' ') {
                    return false;
                }
            }
        }
        // se estiver cheio, ele retorna true e vai imprimir a mensagem no main
        return true;
    }
}
