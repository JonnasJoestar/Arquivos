import java.util.Scanner;
public class ExM {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[],b[],i;
		a = new int[10];
		b = new int[10];
		for(i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}
		for(i = 0; i < a.length; i++) {
			if(a[i]%2 == 0) {
				b[i] = 1;
			}else {
				b[i] = 0;
			}
		}
		for(i = 0; i < a.length; i++) {
			System.out.println("B["+i+"] = "+b[i]);
		}
	}
}
