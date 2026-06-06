package aula5;

import java.util.Scanner;

/**
 * Exercício 01:
 * Elabore um programa em Java que solicite ao usuário a digitação de um
 * número inteiro entre 1 e 12, correspondente a um mês do ano.
 * O programa deve utilizar a estrutura switch-case para:
 * ❑ Identificar o mês correspondente ao número informado
 * ❑ Exibir o nome do mês por extenso
 * Regras:
 * ❑ Caso o número informado não esteja no intervalo de 1 a 12, o
 * programa deve exibir a mensagem: "Mês inválido"
 */
public class Item1 {
    void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro entre 1 e 12, correspondente a um mês do ano:");
        int number = sc.nextInt();
        sc.close();

        String message = switch (number) {
            case 1 -> "Janeiro";
            case 2 -> "Fevereiro";
            case 3 -> "Março";
            case 4 -> "Abril";
            case 5 -> "Maio";
            case 6 -> "Junho";
            case 7 -> "Julho";
            case 8 -> "Agosto";
            case 9 -> "Setembro";
            case 10 -> "Outubro";
            case 11 -> "Novembro";
            case 12 -> "Dezembro";
            default -> "Mês inválido.";
        };

        System.out.println(message);
    }
}
