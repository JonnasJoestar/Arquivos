import java.util.Scanner;
public class ExC {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i,j;
		String a[];
		a = new String[26];
		for(i=0;i<26;i++) {
			System.out.println("Digite a "+(i+1)+"º letra do alfabeto: ");
			a[i] = in.next();
		}
		for(j=0;j<26;j++) {
			System.out.println(a[j]);
		}
	}
}
