import java.util.*;
public class Ex2 {
	
	public static double opcao1(double d) {
		double par = d * 0.9;
		return par;
	}
	
	public static double opcao2(double d) {
		double par = d / 2;
		return par;
	}
	
	public static double opcao3(double d,int npar) {
		double par = d / npar; 
		if(d > 100.0) {
			for(int i = 1; i <= npar; i++) {
				par += par * 0.03 ;
			}
			return par;
		}else {
			return par;
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean fim;
		double d;
		int f,npar;
		System.out.println("Digite o valor da compra:");
		d = in.nextDouble();
		do {
			System.out.println("1 - A vista | 2 - Em duas vezes | 3 - Mais de três vezes (3 a 10 parcelas)");
			f = in.nextInt();
			fim = false;
			switch(f) {
				case 1:
					System.out.printf("Você pagará R$%.2f à vista\n",opcao1(d));
					fim = true;
					break;
				case 2:
					System.out.printf("Você pagará %1d vezes de R$%.2f\n",f,opcao2(d));
					fim = true;
					break;
				case 3:
					System.out.println("Digite a quantidade de parcelas:");
					npar = in.nextInt();
					System.out.printf("Você pagará %1d vezes de R$%.2f",npar,opcao3(d,npar));
					fim = true;
					break;
				default: 
					System.out.println("Digite um número válido.");
					break;
			}
		}while(fim == false);
	}
}