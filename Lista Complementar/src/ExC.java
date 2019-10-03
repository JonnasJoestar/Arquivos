import java.util.Scanner;
public class ExC {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[],i,j,k,div;
		a = new int [10];
		for(i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}
		for(j = 0; j < a.length; j++) {
			div = 0;
			for(k = 1; k <= a[j]; k++) {
				if(a[j]%k == 0) {
					div++;
				}
			}
			if(div == 2) {
				System.out.println(a[j]+" Primo");
			}else {
				System.out.println(a[j]);
			}
		}
	}
}
