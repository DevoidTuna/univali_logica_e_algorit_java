package aula3;

import java.util.Scanner;

/**
 * 4. Faça um programa que receba um número positivo e maior que zero, calcule e mostre:
 * a) o número digitado ao quadrado;
 * b) o número digitado ao cubo;
 * c) a raiz quadrada do número digitado;
 * d) a raiz cúbica do número digitado;
 */
public class Item4 {
    void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Infome um número maior que 0: ");
        double number = sc.nextDouble();
        sc.close();

        double squared = Math.pow(number, 2);
        double cubed = Math.pow(number, 3);
        double sqrt = Math.sqrt(number);
        double cbrt = Math.cbrt(number);

        System.out.println("Seu número ao quadrado é: " + squared);
        System.out.println("Seu número ao cubo é: " + cubed);
        System.out.println("A raiz quadrada do seu número é: " + sqrt);
        System.out.println("A raiz cúbica do seu número é: " + cbrt);
    }
}
