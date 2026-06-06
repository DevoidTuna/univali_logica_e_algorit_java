package aula4;

import java.util.Scanner;

/**
 * Exercício 4
 * ❑ Faça um programa que peça para o usuário informar um ano qualquer. O programa deve verificar e
 * exibir ao usuário se o ano é bissexto ou não.
 */
public class item4 {
    void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um ano inteiro:");
        int year = sc.nextInt();
        sc.close();

        boolean rule1 = (year % 4) == 0 && (year % 100) != 0;
        boolean rule2 = (year % 400 == 0);

        if (rule1 || rule2) {
            System.out.println("É um ano bissexto");
        } else {
            System.out.println("Não é um ano bissexto");
        }
    }
}
