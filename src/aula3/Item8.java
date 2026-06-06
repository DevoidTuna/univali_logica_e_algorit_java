package aula3;

import java.util.Scanner;

/**
 * 8. Pedro comprou um saco de ração com peso em quilos. Ele possui dois gatos, para os
 * quais fornece a quantidade de ração em gramas. A quantidade diária de ração fornecida
 * para cada gato é sempre a mesma. Faça um programa que receba o peso do saco de
 * ração e a quantidade de ração fornecida para cada gato, calcule e mostre quanto restará
 * de ração no saco após cinco dias.
 */
public class Item8 {
    void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o peso do saco de ração (kg): ");
        double packageWeight = sc.nextDouble() * 1000;
        System.out.println("Informe a quantidade de ração diária fornecida a cada gato (g): ");
        double amountOfFeed = sc.nextDouble();

        sc.close();

        double finalAmount = packageWeight - (amountOfFeed * 2 * 5);

        System.out.println("Restará no pacote ao final dos 5 dias " + finalAmount / 1000 + "Kg");
    }
}
