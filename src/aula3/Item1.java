package aula3;

import java.util.Scanner;

/**
 * 1. Faça um programa que receba três notas informadas pelo usuário, calcule e mostre a
 * média aritmética.
 */
class Item1 {
    void main() {
        double n1, n2, n3, soma, media;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota 01: ");
        n1 = sc.nextDouble();
        System.out.println("Digite a nota 02: ");
        n2 = sc.nextDouble();
        System.out.println("Digite a nota 03: ");
        n3 = sc.nextDouble();

        sc.close();

        soma = n1 + n2 + n3;
        media = soma / 3;

        System.out.println("\nA média é: " + media);
    }
}