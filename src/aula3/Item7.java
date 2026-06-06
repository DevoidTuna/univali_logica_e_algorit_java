package aula3;

import java.util.Scanner;

/**
 * 7. Cada degrau de uma escada tem X de altura. Faça um programa que receba essa
 * altura e a altura que o usuário deseja alcançar subindo a escada, calcule e mostre
 * quantos degraus ele deverá subir para atingir seu objetivo, sem se preocupar com a altura
 * do usuário. Todas as medidas fornecidas devem estar em metros.
 */
public class Item7 {
    void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a altura do degrau (m): ");
        double stepHeight = sc.nextDouble();
        System.out.println("Informe a altura que deseja alcançar (m): ");
        double targetHeight = sc.nextDouble();

        sc.close();

        // Não tem como ter um "meio" degrau
        int qntOfSteps = (int) Math.rint(targetHeight / stepHeight);

        System.out.println("A quantidade de degraus para alcançar a altura desejada será de: " + qntOfSteps);
    }
}
