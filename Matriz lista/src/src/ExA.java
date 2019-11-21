public class ExA {
	public static void main(String[] args) {
		int m[][],i,j;
		m = new int[4][4];
		
		m[0][0] = 2;
	
		
		for(i = 0; i < m.length; i++) {
			for(j = 1; j < m[i].length; j++) {
				m[i][j] = m[i][j-1]*2;
				if(j == 3 && i != 3) {
					m[i+1][0] = m[i][j]*2;
				}
			}
		}
		for(i = 0; i < m.length; i++) {
			for(j = 0; j < m[i].length; j++) {
				System.out.print("["+m[i][j]+"]");
				if(j == 3) {
					System.out.print("\n");
				}
			}
		}
	}
}
