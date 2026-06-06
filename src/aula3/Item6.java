package aula3;

import java.util.Scanner;

/**
 * 6. Faça um programa que receba o salário base de um funcionário, calcule e mostre o
 * salário a receber, sabendo-se que o funcionário tem gratificação de 5% sobre o salário
 * base e paga imposto de 7% também sobre o salário base.
 */
public class Item6 {
    void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o salário do funcionário: ");
        double wage = sc.nextDouble();
        sc.close();

        double discount = wage / 100 * 7;
        double bonus = wage / 100 * 5;
        double finalWage = wage + bonus - discount;

        System.out.println("O salário final do funcionário é: " + finalWage);
    }
}
