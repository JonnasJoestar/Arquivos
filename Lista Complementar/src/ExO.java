import java.util.Scanner;
public class ExO {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[],b[],c[],i;
		a = new int[5];
		b = new int[5];
		c = new int[5];
		for(i = 0; i < a.length;i++) {
			a[i] = in.nextInt();
		}
		b[0] = a[0];
		c[0] = a[0];
		
			for(int j = 0; j < b.length; j++) {
				if(a[j] < b[j]) {
					b[j] = a[j];
				}else if(a[j] > c[j]) {
					c[j] = a[j];
				}
			}
		
		System.out.println("Ordem Crescente");
		for(i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		System.out.println("Ordem Decrescente");
		for(i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}
}
