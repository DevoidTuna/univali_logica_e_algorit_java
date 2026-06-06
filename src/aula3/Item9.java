package aula3;

import java.util.Scanner;

/**
 * 9. Escreva um programa que calcule o IMC de um indivíduo, utilizando a fórmula IMC =
 * peso / altura².
 */
public class Item9 {
    void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu peso (kg): ");
        double weight = sc.nextDouble();
        System.out.println("Informe sua altura (m): ");
        double height = sc.nextDouble();

        sc.close();

        double imc = weight / Math.pow(height, 2);

        if (imc < 16) {
            System.out.println("Magreza grave");
        } else if (imc < 17) {
            System.out.println("Magreza moderada");
        } else if (imc < 18.5) {
            System.out.println("Magreza leve");
        } else if (imc < 25) {
            System.out.println("Saudável");
        } else if (imc < 30) {
            System.out.println("Sobrepeso");
        } else if (imc < 35) {
            System.out.println("Obesidade grau 1");
        } else if (imc < 40) {
            System.out.println("Obesidade grau 2");
        } else {
            System.out.println("Obesidade grau 3");
        }
    }
}
