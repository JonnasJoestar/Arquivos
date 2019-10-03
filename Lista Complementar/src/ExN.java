import java.util.Scanner;
public class ExN {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[],b[],c[],i;
		a = new int[10];
		b = new int[10];
		c = new int[10];
		for(i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}
		for(i = 0; i < b.length; i++) {
			b[i] = in.nextInt();
		}
		for(i = 0; i < c.length; i++) {
			if(a[i] > b[i]) {
				c[i] = 1;
			}else if(a[i] == b[i]) {
				c[i] = 0;
			}else if(a[i] < b[i]) {
				c[i] = -1;
			}
		}
		for(i = 0; i < c.length; i++) {
			System.out.println("C["+i+"] = "+c[i]);
		}
	}
}
