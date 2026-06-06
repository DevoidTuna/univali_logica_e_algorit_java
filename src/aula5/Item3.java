package aula5;

import java.util.Scanner;

/**
 * Exercício 03:
 * Verificação de triângulo:
 * Leia três lados de um triângulo e verifique se é possível formar um triângulo.
 * Regras:
 * lado1 + lado2 > lado3
 * lado1 + lado3 > lado2
 * lado2 + lado3 > lado1
 * Utilize uma flag: formaTriangulo
 * Se true, apresente a mensagem:
 * Forma triangulo!
 * Senão, apresente a mensagem:
 * Não forma triangulo!
 */
public class Item3 {
    void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos verificar se é possível formar um triângulo a partir de 3 medidas.");

        System.out.println("Primeiro, informe o tamanho do primeiro lado:");
        double lado1 = sc.nextDouble();
        System.out.println("Agora, informe o tamanho do segundo lado:");
        double lado2 = sc.nextDouble();
        System.out.println("Por último, informe o tamanho do terceiro lado:");
        double lado3 = sc.nextDouble();

        sc.close();

        boolean formaTriangulo = lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1;

        String message;
        if  (formaTriangulo) {
            message = "Forma triângulo!";
        } else {
            message = "Não forma triângulo!";
        }

        System.out.println(message);
    }
}
