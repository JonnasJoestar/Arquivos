import java.util.Scanner;
public class ExB {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[],m,i,j,k;
		a = new int [5];
		for(i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}
		for(j = 0; j < a.length; j++) {
			for(k = 1; k <= 10; k++) {
				m = a[j]*k;
				System.out.println(a[j]+" X "+k+" = "+m);
			}
		}
	}
}
