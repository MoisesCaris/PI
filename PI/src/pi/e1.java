package pi;

import java.util.Scanner;

public class e1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n[] = new int[5];
		int maior = 0, menor = 0;
		System.out.println("Escolha 5 numeros:");
		for (int i = 0; i < 5; i++) {
			n[i] = ler.nextInt();
			if (i == 0) {
				maior = n[i];
				menor = n[i];
			}
			if (maior < n[i]) {
				maior = n[i];
			}
			if (menor > n[i]) {
				menor = n[i];
			}
		}
		System.out.println("O maior numero foi:" + maior + "\n" + "O menor numero foi de:" + menor);
		ler.close();
	}
}