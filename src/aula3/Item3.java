package aula3;

/**
 * 3. Faça um programa que receba um número real, encontre e mostre:
 * a) a parte inteira desse número;
 * b) a parte fracionária desse número;
 * c) o arredondamento desse número.
 */
public class Item3 {
    void main() {
        double number = 10.80;

        int integerNumber = (int) number;
        double fraction = number - integerNumber;
        int rounded = (int) Math.rint(number);

        System.out.println("Inteiro: " + integerNumber);
        System.out.println("Fração: " + fraction);
        System.out.println("Arredondamento: " + rounded);
    }
}
