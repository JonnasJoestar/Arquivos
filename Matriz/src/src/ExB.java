import java.util.Random;
public class ExB {
	public static void main(String[] args) {
		Random r = new Random();
		int m[][],i,j,maior,menor,ime,ima,jme,jma;
		m = new int[3][3];
		for(i = 0;i < m.length; i++) {
			for(j = 0; j < m[i].length; j++) {
				m[i][j] = r.nextInt(10);
			}
		}
		
		menor = m[0][0];
		maior = 0;
		ime = 0;
		ima = 0;
		jme = 0;
		jma = 0;
		
		for(i = 0; i < m.length; i++) {
			for(j = 0; j < m[i].length; j++) {
				System.out.print("["+m[i][j]+"] ");
				if(j == 2) {
					System.out.print("\n");
				}
			}
		}
		
		for(i = 0; i < m.length; i++) {
			for(j = 0; j < m[i].length; j++) {
				if(m[i][j] > maior) {
					maior = m[i][j];
					ima = i;
					jma = j;
				}else if(m[i][j] < menor){
					menor = m[i][j];
					ime = i;
					jme = j;
				}
			}
		}
		System.out.println("Número maior: "+maior+" ["+(ima+1)+"]["+(jma+1)+"]");
		System.out.println("Número menor: "+menor+" ["+(ime+1)+"]["+(jme+1)+"]");
	}
}
