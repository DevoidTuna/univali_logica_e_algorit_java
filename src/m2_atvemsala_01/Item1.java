package m2_atvemsala_01;

import java.util.Random;
import java.util.Scanner;

/**
 * Exercício 01:
 * Adivinhação de número:
 * O programa deve gerar um número aleatório entre 1 e 100.
 * O usuário deve tentar adivinhar o número:
 * ❑ Informar se o valor digitado é maior ou menor
 * ❑ Continuar até acertar
 * Para gerar número aleatório:
 * Random random = new Random();
 * random.nextInt(100) + 1;
 */
public class Item1 {
    void main() {
        Scanner sc = new Scanner(System.in);
        int randomNumber = (new Random()).nextInt(100) + 1;
        int number;

        System.out.println("Tente adivinhar o número que o computador escolheu aleatoriamente!");
        do {
            System.out.print("Informe o número: ");
            number = sc.nextInt();

            if (number == randomNumber) {
                System.out.println("Você acertou o número! Parabéns! O computador escolheu o número " + randomNumber);
            } else if  (number > randomNumber) {
                System.out.println("Ops, o número que o computador escolheu é MENOR!");
            } else {
                System.out.println("Ops, o número que o computador escolheu é MAIOR!");
            }
        } while(number != randomNumber);

        sc.close();
    }
}
