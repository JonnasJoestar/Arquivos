import java.util.Scanner;
public class ExE {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[],i,j,k;
		a = new int [10];
		for(i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}
		for(j = 0;j < a.length; j++) {
			System.out.println("Divisores de "+a[j]);
			for(k = 1; k <= a[j]; k++) {
				if(a[j]%k == 0 ) {
					System.out.println(a[j]+" : "+k+" = "+(a[j]/k));
				}
			}
		}
		
	}
}
