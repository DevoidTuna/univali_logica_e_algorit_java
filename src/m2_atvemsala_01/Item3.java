package m2_atvemsala_01;

import java.util.Scanner;

/**
 * Exercício 03:
 * Pesquisa de satisfação:
 * Crie um programa que simule uma pesquisa de satisfação de atendimento.
 * ❑ Para cada cliente, o usuário deve informar uma nota de 1 a 5 (valores inteiros,
 * valide a nota).
 * ❑ O programa deve continuar recebendo notas até que o usuário digite 0, que indicará
 * o encerramento da pesquisa.
 * ❑ Ao final, informe:
 * ❑ a quantidade de respostas registradas;
 * ❑ a média das notas;
 * ❑ quantas vezes cada nota de 1 a 5 foi informada.
 */
public class Item3 {
    void main() {
        Scanner sc = new Scanner(System.in);
        int qntNotasInformadas = 0;
        int somaNotas = 0;
        int nota = 1;
        int qntNota1 = 0;
        int qntNota2 = 0;
        int qntNota3 = 0;
        int qntNota4 = 0;
        int qntNota5 = 0;

        System.out.println("Pesquisa de satisfação! Digite 0 caso deseje encerrar.");

        while (nota != 0) {
            System.out.print("Informe uma nota de 1 a 5: ");
            nota = sc.nextInt();

            switch (nota) {
                case 0: sc.close(); break;
                case 1: qntNota1++; break;
                case 2: qntNota2++; break;
                case 3: qntNota3++; break;
                case 4: qntNota4++; break;
                case 5: qntNota5++; break;
                default:
                    System.out.println("Informe uma nota de 1 a 5 ou 0 para sair.");
                    continue;
            }

            if (nota != 0) {
                qntNotasInformadas++;
                somaNotas += nota;
            }
        }

        System.out.println("\nQuantidade de respostas registradas: " + qntNotasInformadas);
        System.out.println("Média das notas: " + (somaNotas / qntNotasInformadas));
        System.out.println("Quantidade de notas 1: " + qntNota1);
        System.out.println("Quantidade de notas 2: " + qntNota2);
        System.out.println("Quantidade de notas 3: " + qntNota3);
        System.out.println("Quantidade de notas 4: " + qntNota4);
        System.out.println("Quantidade de notas 5: " + qntNota5);
    }
}
