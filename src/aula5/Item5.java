package aula5;

import java.util.Scanner;

/**
 * Exercício 05:
 * Produto com Desconto:
 * Crie um programa em Java que calcule o valor final de uma compra com base em regras de
 * desconto.
 * O programa deve solicitar ao usuário:
 * • Valor da compra
 * • Se é cliente VIP (true/false)
 * Regras de desconto
 * O sistema de desconto funciona da seguinte forma:
 * Cliente VIP E compra maior que 200 10% de desconto
 * Cliente VIP OU compra maior que 200 5% de desconto
 * Nenhuma das condições sem desconto
 * Saída:
 * Valor da compra: R$ x
 * Percentual de desconto aplicado: x%
 * Valor do desconto: R$ x
 * Valor final da compra: R$ x
 */
public class Item5 {
    void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da compra:");
        double amount = sc.nextDouble();
        System.out.println("É cliente VIP? (true ou false)");
        boolean vip = sc.nextBoolean();
        sc.close();

        double discount = 0;
        String discountPercentual = "0%";

        if (vip && amount > 200) {
            discount = amount * 0.1;
            discountPercentual = "10%";
        } else if (vip || amount > 200) {
            discount = amount * 0.05;
            discountPercentual = "5%";
        }

        System.out.println("Valor da compra: R$ " + amount);
        System.out.println("Percentual de desconto aplicado: " + discountPercentual);
        System.out.println("Valor do desconto: R$ " + discount);
        System.out.println("Valor final da compra: R$ " + (amount - discount));
    }
}
