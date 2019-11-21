import java.util.Scanner;
public class ExD {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i,j,a[],b[];
		a = new int[7];
		b = new int[7]; 
		for(i=0;i<7;i++) {
			System.out.println("Digite o "+(i+1)+"º valor: ");
			a[i] = in.nextInt(); 
		}
		for(j=0;j<7;j++) {
			b[j] = 2*a[j];
			System.out.println(b[j]);
		}
	}
}
