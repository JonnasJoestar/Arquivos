import java.util.Scanner;
public class ExC {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m[][],i,j,c;
		m = new int[3][4];
		for(i = 0; i < m.length; i++) {
			c = 0;
			for(j = 0; j < m[i].length-1; j++) {
					m[i][j] = in.nextInt();
					c += m[i][j];	
			}
			m[i][3] = c;
		}
		for(i = 0; i < m.length; i++) {
			for(j = 0; j < m[i].length; j++) {
				System.out.print("["+m[i][j]+"] ");
				if(j == 3) {
					System.out.print("\n");
				}
			}
		}
	}
}
