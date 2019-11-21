import java.util.*;
public class Ex2 {
	public static void main(String[] args) {
		Random r = new Random(20);
		Scanner in = new Scanner(System.in);
		int m[][],c,l,i,j;
		System.out.println("Digite o número de colunas: ");
		c = in.nextInt();
		System.out.println("Digite o número de linhas: ");
		l = in.nextInt();
		m = new int[l][c];
		for(i = 0; i < m.length; i++) {
			for(j = 0; j < m[i].length; j++) {
				m[i][j] = r.nextInt();
			}
		}
		
		for(i = 0; i < m.length; i++) {
			for(j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j]+" ");
				if(j == l-1) {
					System.out.print("\n");
				}
			}
		}
		
	}
}
