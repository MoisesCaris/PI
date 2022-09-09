package pi;

public class e2 {
	public static void main(String[] args) {
		double salario[] = new double [25];
		salario[0] = 1000;
		salario[1] = salario[0] + (0.015 * salario[0]);
		int ano = 1997;
		/*double salario2 = salario[0] + (0.015 * salario[0]);*/
		float por = (float) 0.015;
		while (ano != 2023){
			por = por * 2;
			salario[1] = salario[1] + (por * salario[1]);
			ano++;
		}
		System.out.println("O salario final foi de:" + salario[1]);
	}
}