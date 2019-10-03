import java.util.Scanner;
public class ExI{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] a,b,c;
		int cont = 0;
		a = new int[5];
		b = new int[5];
		System.out.println("Conjuto A: ");
		for(int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}
		System.out.println("Conjuto B:");
		for(int j = 0; j < a.length; j++) {
			b[j] = in.nextInt();
		}
		for(int k = 0; k < a.length; k++) {
			for(int l = 0; l < a.length; l++) {
				if(a[k] == b[l]) {
					cont++;
				}
			}
		}
		c = new int[cont];
		for(int m = 0; m < a.length; m++ ) {
			for(int o = 0; o < a.length; o++) {
				if(a[m] == b[o]) {
					c[o] = a[m];
				}
			}
		}
		System.out.print("C = ");
		for(int d = 0; d < c.length; d++) {
			System.out.print(c[d]+" ");
		}
	}
}