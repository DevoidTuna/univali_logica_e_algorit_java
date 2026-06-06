package aula3;

import java.util.Scanner;

/**
 * 5. Crie um programa para o cálculo da fórmula de basckara com base nos valores
 * de a, b, e c, apresentando os valores de X1 e X2.
 */
public class Item5 {
    void main() throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de a: ");
        double a = sc.nextDouble();
        System.out.println("Digite o valor de b: ");
        double b = sc.nextDouble();
        System.out.println("Digite o valor de c: ");
        double c = sc.nextDouble();

        sc.close();

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0) throw new Exception("Delta não pode ser negativo");

        double x1 = (- b + Math.sqrt(delta)) / (2 * a);
        double x2 = (- b - Math.sqrt(delta)) / (2 * a);

        System.out.println("X1: " + x1);
        System.out.println("X2: " + x2);
    }
}
