import java.util.Scanner;
public class ExA {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[],b[],i,j,k,l;
		a = new int [20];
		b = new int [20];
		for(i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
			if(a[i]%2 == 0) {
				b[i] = a[i];
			}
		}
		for(j = 0; j <  a.length;j++) {
			if(a[j]%2 != 0) {
				b[j] = a[j];
			}
		}
		System.out.println("Pares:");
		for(k = 0; k < a.length; k++) {
			if(b[k]%2 == 0) {
				System.out.println("B["+k+"] = "+b[k]);
			}
		}
		System.out.println("Impares:");
		for(l = 0; l < a.length; l++) {
			if(b[l]%2 != 0) {
				System.out.println("B["+l+"] = "+b[l]);
			}
		}
	}
}
