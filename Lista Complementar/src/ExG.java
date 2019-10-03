import java.util.Scanner;
public class ExG {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[],b[],i,j,k,f=1;
		a = new int[15];
		b = new int[15];
		for(i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}
		for(j = 0; j < a.length; j++) {
			f = a[j];
			for(k = 1; k < a[j]; k++) {
				f *= k;			
			}
			b[j] = f;
			System.out.println("B["+j+"] = "+b[j]);
		}
	}
}
