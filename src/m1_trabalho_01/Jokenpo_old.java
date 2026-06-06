package m1_trabalho_01;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo_old {
    void main() {
        Scanner sc = new Scanner(System.in);
        Random gerador = new Random();

        String pedraL1 = " _____  ";
        String pedraL2 = "---' ____)";
        String pedraL3 = "      (_____)";
        String pedraL4 = "      (_____)";
        String pedraL5 = "      (____)";
        String pedraL6 = "---.__(___) ";
        String pedraL7 = "";

        String pedraXL1 = "  \\ ____/__ ";
        String pedraXL2 = "---\\ __/_) ";
        String pedraXL3 = "    \\ /_____) ";
        String pedraXL4 = "     X(_____) ";
        String pedraXL5 = "    / \\____) ";
        String pedraXL6 = "---/__(\\___) ";
        String pedraXL7 = "  /     \\ ";

        String papelL1 = "  _______  ";
        String papelL2 = "---' ____)____";
        String papelL3 = "         ______)";
        String papelL4 = "         _______)";
        String papelL5 = "        _______) ";
        String papelL6 = "---.__________) ";
        String papelL7 = "";

        String papelXL1 = "   \\_____/  ";
        String papelXL2 = "---'\\   /_)____";
        String papelXL3 = "     \\ / ______) ";
        String papelXL4 = "      X _______) ";
        String papelXL5 = "     / \\ _______) ";
        String papelXL6 = "---./___\\_____) ";
        String papelXL7 = "   /     \\ ";

        String tesouraL1 = "  _______  ";
        String tesouraL2 = "---' ____)____";
        String tesouraL3 = "         ________)";
        String tesouraL4 = "     _____________)";
        String tesouraL5 = "      (____)  ";
        String tesouraL6 = "---.__(___) ";
        String tesouraL7 = "";

        String tesouraXL1 = "  \\______/  ";
        String tesouraXL2 = "---'\\ __/_)___";
        String tesouraXL3 = "     \\ / ________) ";
        String tesouraXL4 = "      X___________)";
        String tesouraXL5 = "     /(\\___) ";
        String tesouraXL6 = "---./_(_\\_) ";
        String tesouraXL7 = "   /     \\ ";

        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║        BEM-VINDO AO JOKENPÔ!         ║");
        System.out.println("║      Pedra  x  Papel  x  Tesoura     ║");
        System.out.println("╚══════════════════════════════════════╝");
        System.out.println();

        System.out.println("Escolha sua jogada:");
        System.out.println("  1 - Pedra");
        System.out.println("  2 - Papel");
        System.out.println("  3 - Tesoura");
        System.out.print("Sua escolha: ");

        int escolhaJogador = sc.nextInt();

        sc.close();

        if (escolhaJogador < 1 || escolhaJogador > 3) {
            System.out.println("Opção inválida! Digite 1, 2 ou 3.");
        } else {
            int escolhaComputador = gerador.nextInt(3) + 1;

            String nomeJogador = switch (escolhaJogador) {
                case 1 -> "PEDRA";
                case 2 -> "PAPEL";
                default -> "TESOURA";
            };

            String nomeComputador = switch (escolhaComputador) {
                case 1 -> "PEDRA";
                case 2 -> "PAPEL";
                default -> "TESOURA";
            };

            int resultado;
            if (escolhaJogador == escolhaComputador) {
                resultado = 0;
            } else if (escolhaJogador == 1 && escolhaComputador == 3) {
                resultado = 1;
            } else if (escolhaJogador == 2 && escolhaComputador == 1) {
                resultado = 1;
            } else if (escolhaJogador == 3 && escolhaComputador == 2) {
                resultado = 1;
            } else {
                resultado = 2;
            }

            String j1, j2, j3, j4, j5, j6, j7;
            String c1, c2, c3, c4, c5, c6, c7;

            if (resultado == 2) {
                switch (escolhaJogador) {
                    case 1: j1=pedraXL1; j2=pedraXL2; j3=pedraXL3; j4=pedraXL4; j5=pedraXL5; j6=pedraXL6; j7=pedraXL7; break;
                    case 2: j1=papelXL1; j2=papelXL2; j3=papelXL3; j4=papelXL4; j5=papelXL5; j6=papelXL6; j7=papelXL7; break;
                    default: j1=tesouraXL1; j2=tesouraXL2; j3=tesouraXL3; j4=tesouraXL4; j5=tesouraXL5; j6=tesouraXL6; j7=tesouraXL7;
                }
            } else {
                switch (escolhaJogador) {
                    case 1: j1=pedraL1; j2=pedraL2; j3=pedraL3; j4=pedraL4; j5=pedraL5; j6=pedraL6; j7=pedraL7; break;
                    case 2: j1=papelL1; j2=papelL2; j3=papelL3; j4=papelL4; j5=papelL5; j6=papelL6; j7=papelL7; break;
                    default: j1=tesouraL1; j2=tesouraL2; j3=tesouraL3; j4=tesouraL4; j5=tesouraL5; j6=tesouraL6; j7=tesouraL7;
                }
            }

            if (resultado == 1) {
                switch (escolhaComputador) {
                    case 1: c1=pedraXL1; c2=pedraXL2; c3=pedraXL3; c4=pedraXL4; c5=pedraXL5; c6=pedraXL6; c7=pedraXL7; break;
                    case 2: c1=papelXL1; c2=papelXL2; c3=papelXL3; c4=papelXL4; c5=papelXL5; c6=papelXL6; c7=papelXL7; break;
                    default: c1=tesouraXL1; c2=tesouraXL2; c3=tesouraXL3; c4=tesouraXL4; c5=tesouraXL5; c6=tesouraXL6; c7=tesouraXL7;
                }
            } else {
                switch (escolhaComputador) {
                    case 1: c1=pedraL1; c2=pedraL2; c3=pedraL3; c4=pedraL4; c5=pedraL5; c6=pedraL6; c7=pedraL7; break;
                    case 2: c1=papelL1; c2=papelL2; c3=papelL3; c4=papelL4; c5=papelL5; c6=papelL6; c7=papelL7; break;
                    default: c1=tesouraL1; c2=tesouraL2; c3=tesouraL3; c4=tesouraL4; c5=tesouraL5; c6=tesouraL6; c7=tesouraL7;
                }
            }

            System.out.println();
            System.out.println("----------------------------------------");
            System.out.println("   VOCÊ (" + nomeJogador + ")   VS   COMPUTADOR (" + nomeComputador + ")");
            System.out.println("----------------------------------------");

            System.out.printf("%-25s     %s%n", j1, c1);
            System.out.printf("%-25s     %s%n", j2, c2);
            System.out.printf("%-25s     %s%n", j3, c3);
            System.out.printf("%-25s     %s%n", j4, c4);
            System.out.printf("%-25s     %s%n", j5, c5);
            System.out.printf("%-25s     %s%n", j6, c6);
            System.out.printf("%-25s     %s%n", j7, c7);

            System.out.println("----------------------------------------");
            System.out.println();

            String mensagemResultado = switch (resultado) {
                case 0 -> ">>  EMPATE! Ninguém venceu desta vez.  <<";
                case 1 -> ">>  PARABÉNS! Você VENCEU!             <<";
                default -> ">>  Que pena... O computador VENCEU!   <<";
            };

            System.out.println(mensagemResultado);
        }
    }
}