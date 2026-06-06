package m2_atvemsala_01;

import java.util.Scanner;

/**
 * Exercício 04:
 * Menu de cadastro:
 * ❑ Crie um programa que exiba um menu com as opções:
 * 1 Cadastrar
 * 2 Consultar
 * 3 Atualizar
 * 4 Excluir
 * 5 Sair
 * ❑ O programa deve solicitar ao usuário uma opção e validar a entrada.
 * ❑ Enquanto a opção digitada for inválida, o sistema deve pedir novamente.
 * ❑ O programa deve finalizar apenas quando o usuário selecionar a opção 5.
 * ❑ Quando uma opção válida for informada, exiba a mensagem correspondente à operação escolhida. As
 * mensagens devem ser as seguintes:
 * ❑ Para Cadastrar: “Cadastro efetuado.”
 * ❑ Para Consultar: “Consulta realizada.”
 * ❑ Para Atualizar: “Atualização realizada.”
 * ❑ Para Excluir: “Exclusão realizada.”
 * ❑ Para Sair: “Finalizado o programa…”
 * ❑ Para opção inválida: “Opção inválida! Tente novamente.”
 * ❑ Dica: você pode usar o while, para manter o programa em execução apresentando o menu. E utilizar um switch
 * case dentro do while para processar a opção do usuário e verificar a condição de parada.
 */
public class Item4 {
    void main() {
        Scanner sc = new Scanner(System.in);
        int opcao = 1;

        System.out.print("Escolha uma opção do menu:" +
                "\n1 Cadastrar" +
                "\n2 Consultar" +
                "\n3 Atualizar" +
                "\n4 Excluir" +
                "\n5 Sair\n\n");

        while (opcao != 5) {
            System.out.print("Opção desejada: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1: System.out.println("Cadastro efetuado."); break;
                case 2: System.out.println("Consulta realizada."); break;
                case 3: System.out.println("Atualização realizada."); break;
                case 4: System.out.println("Exclusão realizada."); break;
                case 5: System.out.println("Finalizado o programa…"); break;
                default: System.out.println("Opção inválida! Tente novamente.");
            }
        }

        sc.close();
    }
}
