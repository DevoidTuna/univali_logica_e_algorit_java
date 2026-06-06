package aula4;

public class Item1 {
    void main() {
        int minima = 10;
        int maxima = 25;
        int idade = 21;
        boolean solteiro = true;

        if (idade >= minima && idade <= maxima && solteiro) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}
