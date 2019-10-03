import java.util.Scanner;
public class ExF {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[],p,i,j,k;
		a = new int [11];
		for(i = 0;i < a.length; i++) {
			a[i] = in.nextInt();
		}
		for(j = 0; j < a.length; j++) {
			 p = 2;
			if(j == 0) {
				p = 1;
			}else {
				for(k = 1; k < j; k++ ) {
					p *= 2;
				}
			}
			
			System.out.println("A["+j+"] = "+p);
		}
		
	}
}
