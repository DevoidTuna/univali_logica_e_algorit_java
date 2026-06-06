package m2_prova;

import java.util.Random;
import java.util.Scanner;

public class item1 {
	void main() {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int countPlayerWins = 0;
		int countComputerWins = 0;
		
		String caraL1 = "+----------+";
		String caraL2 = "|   CARA   |";
		String caraL3 = "|    :)    |";
		String caraL4 = "+----------+";
		
		String coroaL1 = "+---------+";
		String coroaL2 = "|  COROA  |";
		String coroaL3 = "|    $    |";
		String coroaL4 = "+---------+";
		
		System.out.println("Jogo do Cara ou Coroa!");
		
		while (true) {
			System.out.print("\n\nDigite 0 para Cara ou 1 para Coroa: ");
			int choice = sc.nextInt();
			
			if (choice < 0 || choice > 1) {
				System.out.println("Necessário digitar 0 para Cara ou 1 para coroa!");
				continue;
			}
			
			System.out.println("Lançando a moeda...\n");
			
			int result = rd.nextInt(2);
			boolean playerWin = result == choice;
			
			if (result == 0) {
				System.out.println(caraL1);
				System.out.println(caraL2);
				System.out.println(caraL3);
				System.out.println(caraL4);
			} else {
				System.out.println(coroaL1);
				System.out.println(coroaL2);
				System.out.println(coroaL3);
				System.out.println(coroaL4);
			}
			
			if (playerWin) {
				countPlayerWins++;
				System.out.println("Você venceu!");
			} else {
				countComputerWins++;
				System.out.println("Você perdeu!");
			}
			
			System.out.print("Digite 0 para sair ou qualquer outro n�mero para continuar: ");
			if (sc.nextInt() == 0) break;
		}
		
		System.out.println("\nPlacar final:");
		System.out.println("Jogador " + countPlayerWins + " X " + countComputerWins + " Computador");
		
		sc.close();
	}

}
