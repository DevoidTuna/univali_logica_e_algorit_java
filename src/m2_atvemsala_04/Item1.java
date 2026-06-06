package m2_atvemsala_04;

import java.util.Random;
import java.util.Scanner;

/**
 * Desenvolva um programa em Java para o jogo de Par ou Ímpar contra o computador.
 * O sistema deverá permitir que o jogador escolha entre par ou ímpar e informe um
 * número inteiro entre 0 e 10. O computador deverá gerar automaticamente, de forma
 * aleatória, um valor também entre 0 e 10. Após isso, o programa deverá calcular a soma
 * dos valores e determinar o vencedor da rodada de acordo com o resultado ser par ou
 * ímpar. O jogo deverá possuir um placar acumulativo, contabilizando a quantidade de
 * vitórias do jogador, vitórias do computador e, se desejar, o total de rodadas realizadas.
 * Ao final de cada rodada, o sistema deverá perguntar ao usuário se deseja continuar
 * jogando, encerrando apenas quando o jogador optar por sair. O programa deve validar
 * as entradas informadas pelo usuário para garantir que apenas valores entre 0 e 10
 * sejam aceitos.
 */
public class Item1 {
    void main() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int playerWins = 0;
        int computerWins = 0;

        while (true) {
            System.out.print("\nDigite um número ímpar ou par: ");
            boolean isImpar = sc.nextInt() % 2 != 0;

            System.out.print("Digite um número entre 0 e 10: ");
            int selectedNumber = sc.nextInt();

            if (selectedNumber < 0 || selectedNumber > 10) {
                System.out.println("\nO número digitado precisa ser entre 0 e 10! Reiniciando..");
                continue;
            }

            int computerNumber = rand.nextInt(10);

            boolean resultImpar = (computerNumber + selectedNumber) % 2 != 0;

            if (resultImpar && isImpar) {
                playerWins++;
                System.out.println("\nO jogador venceu!");
            } else {
                computerWins++;
                System.out.println("\nO computador venceu!");
            }

            System.out.println("Placar: Jogador " + playerWins + " X " + computerWins + " Computador");

            System.out.print("\nDigite 0 para sair ou 1+ para continuar jogando: ");
            if (sc.nextInt() == 0) break;

            System.out.println("\nFim de jogo! Placar final:");
            System.out.println("Jogador " + playerWins + " X " + computerWins + " Computador");
        }

        sc.close();
    }
}
