import java.util.Scanner;
public class ExL {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[], c = 1, d = 0;
		a = new int[10];
		for(int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}
		for(int j = 0; j < a.length; j++) {
			if(a[j] != a[a.length-c]){
				d++;
			}	
			c++;
		}
		if(d > 0) {
			System.out.println("O vetor não é um palíndromo");
		}else {
			System.out.println("O vetor é um palíndromo");
		}
	}
}
