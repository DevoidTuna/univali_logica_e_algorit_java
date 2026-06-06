package aula1;

public class N1 {
    public static void main(String[] args) {
        double[] questions = {
                5 + 6 * 4,
                5 + 6 - 3,
                12.0 / 6.0 * 4,
                8 + 3 * 5,
                4 % (5 -3),
                12 % 5 / 3,
                2 + (5 * (3 +2)),
                4 + ((10 / 2) * 4),
                12 % 7,
                125 / 3 % 7 + 3 * 5 - 4,
                9 + 9 * 2 - 14 % 5,
                67 % 5 * 2 / 4,
                10 % 13 + 5 * 3,
                25 / 2 % 3 * 2 + 49,
                66 / 3 + 16 - 2,
                28 % 3,
                28 / 3,
                (3 * (5 + 6)),
                4 % (5 -3),
                3 * (1 + 2),
                2 * 5.0 / 2.0 * 4,
                3 * (10 / 2),
        };

        for (int i = 0; i < questions.length; i++) {
            System.out.println("A resposta da questão " + (i+1) + " é: " + questions[i]);
        }
    }
}