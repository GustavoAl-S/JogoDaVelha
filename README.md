# Jogo da Velha em Java

Este é um simples jogo da velha implementado em Java. O jogo é jogado no terminal e permite que dois jogadores alternem suas jogadas, o tabuleiro é exibido após cada jogada, e o jogo termina quando um dos jogadores vencer ou se o tabuleiro estiver cheio e ocorrer um empate.

## Como Jogar

1. Clone o repositório ou baixe o código para o seu computador.
2. Compile o código com o comando:
   ```bash
   javac *.java
3. Execute o programa com:
   ```bash
   java jogoApp
4. O jogo solicita que você informe a linha e coluna (valores de 1 a 3) que deseja realizar sua jogada.
5. O jogo inicia com o Jogador 'X' e vai alternando entre os jogadores 'O' e 'X'.
6. O jogo termina quando um dos jogadores vence ou quando o tabuleiro está cheio e o jogo empata.

## Regras
* O tabuleiro é composto por uma grade 3x3.
* Os jogadores se alternam, colocando suas marcas (X ou O) em uma célula vazia do tabuleiro.
* O primeiro jogador a alinhar três marcas consecutivas em uma linha, coluna ou diagonal vence.
* Se todas as células do tabuleiro forem preenchidas e nenhum jogador vencer, o jogo empata.

## Funcionalidades
* Tabuleiro dinãminco que exibe o estado atual do jogo conforme as jogadas.
* Metódo que verifica a vitória nas linhas, colunas e diagonais.
* Metódo que verifica o empate do jogo, quando o tabuleiro ficar cheio e não houver vencedor.
* Alternância entre os jogadores.
* Loop para verificar se a jogada é valida, caso não o jogador repete sua jogada.

## Exemplo do Jogo
Aqui está um exemplo de como o tabuleiro é exibido durante o jogo:

![Exemplo de como o tabuleiro é exibido durante o jogo](https://github.com/user-attachments/assets/ea482526-c3ca-414a-81c2-0c07dfa4fe4b)


Exemplo de uma jogada:

![descrição da imagem](https://github.com/user-attachments/assets/00e80337-669f-4611-bf7a-c7ba3c38cb9b
)


Mensagem exibida após a vitória:

![Mensagem exibida após a vitória do jogador 'X'](https://github.com/user-attachments/assets/a7000bc2-2ff5-473c-b705-3010103132c0
)
