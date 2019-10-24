import java.util.Scanner;
import java.util.Random;
public class ExD {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		int c[][],n[][],i,j,can = 0,v = 0;
		boolean fim = false;
		c = new int[4][4];
		n = new int[4][4];
		for(i = 0; i < c.length; i++) {
			for(j = 0; j < c[i].length; j++) {
				c[i][j] = r.nextInt();
			}
		}
		do {
			for(i = 0; i < n.length; i++) {
				for(j = 0; j < n[i].length; j ++){
					n[i][j] = in.nextInt();
				}
			}
			
			for(int a = 0; a < n.length; a++) {
				for(int b = 0; b < n[a].length; b++) {
					for(i = 0; i < c.length; i++) {
						for(j = 0; j < c[i].length; j++) {
							if(n[a][b] == c[i][j]) {
								can++;
							}
						}
					}
				}
			}
			if(can >= c.length) {
				System.out.println("Bingo");
				fim = true;
			}else {
				System.out.println("A cartela não possui os números cantados");
			}
			v++;
		}while(fim == false);
		System.out.println("Você acertou em "+v+" rodada(s)");
	}
}
