package aula4;

public class Item2 {
    void main() {
        double n1 = 6;
        double n2 = 6;
        double n3 = 5;
        double n4 = 6.5;

        double media = (n1 + n2 + n3 + n4) / 4;

        System.out.println("Sua média é: " + media);

        if (media >= 6) {
            System.out.println("Você foi aprovado.");
        } else {
            System.out.println("Você foi reprovado. Nota mínima: 6.");
        }
    }
}
