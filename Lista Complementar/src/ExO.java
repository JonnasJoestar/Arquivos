import java.util.Scanner;
public class ExO {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[],b[],c[],i,j,co=0;
		a = new int[5];
		b = new int[5];
		c = new int[5];
		for(i = 0; i < a.length;i++) {
			a[i] = in.nextInt();
		}
		
		c[0] = 0;
		b[0] = a[0];
		
		for(i = 0; i < a.length; i++) {
			for(j = 0; j < b.length; j++) {
				if(b[j] > a[i]) {
					b[j] = a[i];
				}else if(c[j] > a[i]) {
					c[j] = a[i];
				}
			}
		}
		
		for(i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
}
