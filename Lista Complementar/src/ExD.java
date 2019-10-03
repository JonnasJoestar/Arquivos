import java.util.Scanner;
public class ExD {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[],i,j,k;
		a = new int [5];
		for(i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}
		for(j= 0; j < a.length; j++) {
			System.out.println(a[j]+": ");
			for(k = 0; k <= a[j]; k++) {
				if(k%2 == 0) {
					System.out.println(k);
				}
			}
		}
	}
}
