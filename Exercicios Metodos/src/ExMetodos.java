import java.util.*;
public class ExMetodos {
	//Ex1
	public static int fat(int n) {
		int f = n;
		if(n == 0){
			f = 1;
		}
		for(int i = 2; i < n; i++) {
			f *= i;
		}
		
		return f;
	}
	
	//Ex2
	public static void tabuada(int n) {
		for(int i = 1; i <= 10; i++) {
			int t = n * i;
			System.out.println(n+" x "+i+" = "+t);
		}
	}
	
	//Ex3
	public static void aposen(int idade, String sexo) {
		int id;
		if (sexo.equalsIgnoreCase("mulher") ||sexo.equalsIgnoreCase("feminino")){
			id = 55 - idade;
			System.out.println("Você se aposentará em "+id+ " anos");
		}else if (sexo.equalsIgnoreCase("homem") || sexo.equalsIgnoreCase("masculino")) {
			id = 60 - idade;
			System.out.println("Você se aposentará em "+id+ " anos");
		}
	}
	
	//Ex4
	public static int exp(int b, int e) {
		int p = b;
			for(int i = 1; i < e; i++) {
				p *= b;
			}
		return p;
	}
	
	public static double negExp(double b, int e) {
		double p = b;
		for(int i = 1; i < e; i++) {
			p *= b;
		}
		p = 1/p;
	return p;
		
	}
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int o,id,n,f,b,e;
		String sex,c;
		do {
			System.out.println("Digite o número do exercício: ");
			o = in.nextInt();
			switch(o) {
				case 1:{
					System.out.println("Digite um número: ");
					f = in.nextInt();
					System.out.println(f+"! = "+fat(f));
					break;
				}
				case 2:{
					System.out.println("Digite um número: ");
					n = in.nextInt();
					tabuada(n);
					break;
				}
				case 3:{
					System.out.println("Sua idade: ");
					id = in.nextInt();
					System.out.println("Seu sexo: ");
					sex = in.next();
					aposen(id, sex);
					break;
				}
				case 4:{
					System.out.println("Digite a base: ");
					b = in.nextInt();
					System.out.println("Digite o expoente: ");
					e = in.nextInt();
					if(e < 0) {
						System.out.println(b+" ^ "+e+" = "+negExp(b,e));
					}else {
						System.out.println(b+" ^ "+e+" = "+exp(b,e));
					}
					
					break;
				}
				
				default:{
					System.out.println("Digite um número de 1 a 4.");
					break;
				}
				
			}
			System.out.println("Deseja continuar?");
			c = in.next();
		}while(c.equalsIgnoreCase("sim") || c.equalsIgnoreCase("s"));	
	}
}
