package aula3;

import java.util.Scanner;

/**
 * Atividade em sala.
 */
public class Item10 {
    void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        String nome = sc.next();
        System.out.println("Informe sua idade:");
        int idade = sc.nextInt();
        System.out.println("Informe seu email:");
        String email = sc.next();
        System.out.println("Informe sua altura em metros (1,75):");
        double altura = sc.nextDouble();

        sc.close();

        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua idade é: " + idade);
        System.out.println("Seu e-mail é: " + email);
        System.out.println("Sua altura é: " + altura + " metros");
    }
}
