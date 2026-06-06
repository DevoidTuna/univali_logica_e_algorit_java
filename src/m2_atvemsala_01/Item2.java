package m2_atvemsala_01;

import java.util.Scanner;

/**
 * Exercício 02:
 * Leitura de números com múltiplas condições de paradas:
 * Crie um programa que solicite números inteiros ao usuário.
 * ❑ A leitura deve continuar até que ocorram simultaneamente as duas condições:
 * ❑ O usuário já tenha digitado pelo menos 10 números válidos;
 * ❑ A soma total dos números digitados seja maior que 100.
 * ❑ Ao final, exiba: a quantidade de números informados; os números informados; a
 * soma total do números; e a média dos valores.
 */
public class Item2 {
    void main() {
        Scanner sc = new Scanner(System.in);
        int quantidade = 0;
        int soma = 0;
        String numeros_informados = "";

        while (quantidade < 10 || soma <= 100) {
            System.out.print("Informe um número inteiro #" + (quantidade + 1) + ": ");
            int numero = sc.nextInt();

            soma += numero;
            numeros_informados = numeros_informados + numero + ", ";

            quantidade++;
        }

        System.out.println("Quantidade de números informados: " + quantidade);
        System.out.println("Números informados: " + numeros_informados);
        System.out.println("Média dos valores: " + (soma / quantidade));
        sc.close();
    }
}
