import java.util.Scanner;
public class ExK {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[],x,cont = 0;
		a = new int[10];
		System.out.println("Digite os valores do vetor: ");
		for(int i = 0; i < a.length;i++) {
			a[i] = in.nextInt();
		}
		System.out.println("Digite o valor que deseja verificar: ");
		x = in.nextInt();
		for(int j = 0; j < a.length; j++) {
			if(a[j] == x) {
				cont++;
			}
		}
		if(cont == 1){
			System.out.println("O valor está no vetor");
		}else {
			System.out.println("O valor não está no vetor");
		}
	}
}
