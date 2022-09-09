package pi;

import java.util.Scanner;

public class e3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float peso;
		int tempo[] = new int [3];
		tempo[0] = 0;
		tempo[1] = 0;
		tempo[2] = 0;
		int t = 0;
		System.out.println("Qual o peso do material:");
		peso = ler.nextFloat();
		float peso2 = peso;
		do{
            peso2 = peso2/2;
            tempo[0] = tempo[0] + 50;
            t++;
        } while (peso2 > 0.5);
        if (tempo[0] >= 3600){
            tempo[1] = tempo[0]/60;
            tempo[2] = tempo[1]/60;
            tempo[1] = tempo[1] % 60;
            tempo[0] = tempo[0] % 60;
        } else if (tempo[0] <= 3599 && tempo[0] > 60){
        	tempo[1] = tempo[0]/60;
            tempo[0] = tempo[0] % 60;
        }
		System.out.println("Massa inicial: " + peso + "\n" + "Peso final:" + peso2 + "\n" + "Levou:" + tempo[2]
				+ " Horas e " + tempo[1] + " Minutos e " + tempo[0] + " Segundos para o elemento atingir 0,5 gramas");
		ler.close();
	}
}