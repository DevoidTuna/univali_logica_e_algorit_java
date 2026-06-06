package aula5;

import java.util.Scanner;

/**
 * Exercício 02:
 * Elabore um programa em Java que solicite ao usuário a digitação de um número inteiro
 * entre 1 e 12, representando um mês do ano.
 * Utilizando a estrutura switch-case, o programa deve:
 * ❑ Identificar a estação do ano correspondente ao mês informado
 * ❑ Considerar as estações no Brasil
 * Considere a seguinte associação:
 * ❑ Verão: dezembro (12), janeiro (1), fevereiro (2)
 * ❑ Outono: março (3), abril (4), maio (5)
 * ❑ Inverno: junho (6), julho (7), agosto (8)
 * ❑ Primavera: setembro (9), outubro (10), novembro (11)
 * Regras:
 * Caso o valor informado não esteja entre 1 e 12, exibir: "Mês inválido"
 */
public class Item2 {
    void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro entre 1 e 12, correspondente a um mês do ano:");
        int number = sc.nextInt();
        sc.close();

        String message = switch (number) {
            case 12, 1, 2 -> "Verão";
            case 3, 4, 5 -> "Outono";
            case 6, 7, 8 -> "Inverno";
            case 9, 10, 11 -> "Primavera";
            default -> "Mês inválido.";
        };

        System.out.println(message);
    }
}
