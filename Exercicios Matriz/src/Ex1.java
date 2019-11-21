import java.util.Scanner;
public class Ex1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m[][],i,j,n,c,md[];
		System.out.println("Digite o número de colunas e linhas: ");
		c = in.nextInt();
		m = new int[c][c];
		md = new int[c];
		for(i = 0; i < m.length; i++) {
			for(j = 0; j < m[i].length; j++) {
				m[i][j] = in.nextInt();
			}
		}
		
		for(i = 0; i < m.length; i++) {
			for(j = 0; j < m[i].length; j++) {
				if(i == j) {
					md[i] = m[i][j];
				}
			}
		}
		System.out.println("Main Diagonal: ");
		for(i = 0; i < md.length; i++) {
			System.out.print(md[i]+" ");
		}
		
	}
}
