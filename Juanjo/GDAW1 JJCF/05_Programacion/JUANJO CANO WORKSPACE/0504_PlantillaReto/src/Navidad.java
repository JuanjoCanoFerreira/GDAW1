import java.util.Scanner;
public class Navidad {
	public static void main(String [] args) {
		try(Scanner s = new Scanner(System.in)) {
		int numCasos = s.nextInt();
		for (int i = 0; i < numCasos; i++) {
		
			int dia = s.nextInt();
			int mes = s.nextInt();
			String diaNavidad = anos(dia, mes);
			System.out.println(diaNavidad);
		} 
	}
}
			
				private static String anos(int dia, int mes) {
					if (dia == 25 && mes == 12) {
						
					return "SI";
					 
					} else {																	
						
					return "NO";
					
				}
				}
}
	

