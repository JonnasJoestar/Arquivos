import java.util.*;
public class Ex1 {
	
	public static double calc(int m, double q) {
		double inv = q;
		for(int i = 1; i <= m; i++) {
			double p = inv * 0.01;
			inv += p;
		}
		return inv;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double q;
		int m;
		System.out.println("Digite a quantia investida:");
		q = in.nextDouble();
		System.out.println("Digite a quantidade de meses investido:");
		m = in.nextInt();
		System.out.printf("Seu retorno será de: %.2f",calc(m,q));
	}
}
