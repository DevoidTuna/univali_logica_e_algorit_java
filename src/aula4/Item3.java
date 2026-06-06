package aula4;

import java.util.Scanner;

public class Item3 {
    void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        String nome = sc.next();
        System.out.println("Informe sua média:");
        double media = sc.nextDouble();
        System.out.println("Informe sua frequência:");
        double frequencia = sc.nextDouble();

        sc.close();

        boolean repPorFrequencia = frequencia < 75;
        boolean repPorMedia = media < 6;

        if (!repPorFrequencia && !repPorMedia) {
            System.out.println("Parabéns " + nome + " você foi aprovado!");
        } else if (repPorFrequencia && repPorMedia) {
            System.out.println(nome + " Você foi reprovado por frequência e média!");
        } else if (repPorFrequencia) {
            System.out.println(nome + " Você foi reprovado por frequência");
        } else {
            System.out.println(nome + " Você foi reprovado por média");
        }
    }
}
