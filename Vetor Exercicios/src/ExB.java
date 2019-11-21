import java.util.Scanner;
public class ExB {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String d[];
		int i,j;
		d = new String[7];
		for(i=0;i<7;i++) {
			System.out.println("Digite o "+(i+1)+"º dia da semana: ");
			d[i] = in.next();
		}
		for(j=0;j<7;j++) {
			System.out.println(d[j]);
		}
	}
}
