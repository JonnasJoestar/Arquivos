import java.util.Scanner;
public class ExA {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a[];
		int i,j;
		a = new String[12];
		for(i=0;i<a.length;i++) {
			System.out.println("Digite o "+(i+1)+"º mes: ");
			a[i] = in.next();
		}
		System.out.print("[ ");
		for(j=0;j<a.length;j++) {
			if(j==a.length) {
				System.out.print(a[j]);
			}else{
			System.out.print(a[j]+" - ");
			}
		}
		System.out.print(" ]");
	}
}
