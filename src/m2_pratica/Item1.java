package m2_pratica;

import java.util.Scanner;
import java.util.Random;

public class Item1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] gabarito = new char[7][7];
        char[][] tabuleiro = new char[7][7];
        int[] placar = new int[2];

        preencherTabuleiros(gabarito, tabuleiro);

        int paresEncontrados = 0;
        int vezDoJogador = 1;

        System.out.println("\n=== GABARITO (COLA) ===");
        mostrarMatriz(gabarito);

        while (paresEncontrados < 24) {
            System.out.println("\n=== TABULEIRO ===");
            mostrarMatriz(tabuleiro);

            System.out.println("\nPlacar - Jogador 1: " + placar[0] + " | Jogador 2: " + placar[1]);
            System.out.println("Sua vez, Jogador " + vezDoJogador + "!");

            System.out.print("Digite a linha da carta 1 (1 a 7): ");
            int linha1 = sc.nextInt() - 1;
            System.out.print("Digite a coluna da carta 1 (1 a 7): ");
            int coluna1 = sc.nextInt() - 1;

            if (linha1 < 0 || linha1 > 6 || coluna1 < 0 || coluna1 > 6 || tabuleiro[linha1][coluna1] != '#') {
                System.out.println("Jogada invalida! Voce perdeu a vez.");
                if (vezDoJogador == 1) {
                    vezDoJogador = 2;
                } else {
                    vezDoJogador = 1;
                }
                continue;
            }

            char carta1 = gabarito[linha1][coluna1];
            tabuleiro[linha1][coluna1] = carta1;

            if (carta1 == '*') {
                System.out.println("Opa! Achou o Coringa (*). Passou a vez.");
                if (vezDoJogador == 1) {
                    vezDoJogador = 2;
                } else {
                    vezDoJogador = 1;
                }
                continue;
            }

            mostrarMatriz(tabuleiro);

            System.out.print("Digite a linha da carta 2 (1 a 7): ");
            int linha2 = sc.nextInt() - 1;
            System.out.print("Digite a coluna da carta 2 (1 a 7): ");
            int coluna2 = sc.nextInt() - 1;

            if (linha2 < 0 || linha2 > 6 || coluna2 < 0 || coluna2 > 6 || tabuleiro[linha2][coluna2] != '#' || (linha1 == linha2 && coluna1 == coluna2)) {
                System.out.println("Jogada invalida! Voce perdeu a vez.");
                tabuleiro[linha1][coluna1] = '#';
                if (vezDoJogador == 1) {
                    vezDoJogador = 2;
                } else {
                    vezDoJogador = 1;
                }
                continue;
            }

            char carta2 = gabarito[linha2][coluna2];
            tabuleiro[linha2][coluna2] = carta2;

            mostrarMatriz(tabuleiro);

            if (carta2 == '*') {
                System.out.println("Opa! Achou o Coringa (*). Passou a vez.");
                tabuleiro[linha1][coluna1] = '#';
                if (vezDoJogador == 1) {
                    vezDoJogador = 2;
                } else {
                    vezDoJogador = 1;
                }
                continue;
            }

            if (carta1 == carta2) {
                System.out.println("BOA! Voce achou um par!");
                paresEncontrados++;
                if (vezDoJogador == 1) {
                    placar[0]++;
                } else {
                    placar[1]++;
                }
            } else {
                System.out.println("Errou! Passando a vez...");
                tabuleiro[linha1][coluna1] = '#';
                tabuleiro[linha2][coluna2] = '#';
                if (vezDoJogador == 1) {
                    vezDoJogador = 2;
                } else {
                    vezDoJogador = 1;
                }
            }
        }

        System.out.println("\n--- FIM DE JOGO ---");
        System.out.println("Jogador 1 fez " + placar[0] + " pontos.");
        System.out.println("Jogador 2 fez " + placar[1] + " pontos.");

        if (placar[0] > placar[1]) {
            System.out.println("Jogador 1 Venceu!");
        } else if (placar[1] > placar[0]) {
            System.out.println("Jogador 2 Venceu!");
        } else {
            System.out.println("Deu empate!");
        }

        sc.close();
    }

    static void preencherTabuleiros(char[][] gabarito, char[][] tabuleiro) {
        char[] vetorCartas = new char[49];
        int posicaoAtual = 0;

        for (char letra = 'A'; letra <= 'X'; letra++) {
            vetorCartas[posicaoAtual] = letra;
            posicaoAtual++;
            vetorCartas[posicaoAtual] = letra;
            posicaoAtual++;
        }
        vetorCartas[48] = '*';

        Random sorteio = new Random();
        for (int i = 0; i < vetorCartas.length; i++) {
            int numeroSorteado = sorteio.nextInt(49);
            char auxiliar = vetorCartas[i];
            vetorCartas[i] = vetorCartas[numeroSorteado];
            vetorCartas[numeroSorteado] = auxiliar;
        }

        posicaoAtual = 0;
        for (int linha = 0; linha < 7; linha++) {
            for (int coluna = 0; coluna < 7; coluna++) {
                gabarito[linha][coluna] = vetorCartas[posicaoAtual];
                tabuleiro[linha][coluna] = '#';
                posicaoAtual++;
            }
        }
    }

    static void mostrarMatriz(char[][] matriz) {
        System.out.println("  1 2 3 4 5 6 7");
        for (int linha = 0; linha < 7; linha++) {
            System.out.print((linha + 1) + " ");
            for (int coluna = 0; coluna < 7; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }
    }
}