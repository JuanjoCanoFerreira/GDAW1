import java.util.Scanner;
public class Gregorio_xiii {
	public static void main(String[] args) {
		try(Scanner s = new Scanner(System.in)) {
			int numCasos = s.nextInt();
			for (int i = 0; i < numCasos; i++) {
				// por cada parámetro de nuestro caso
				// pero les ponemos nombres buenos
				
				int anno = s.nextInt();
				int res = reto(anno);
				System.out.println(res);
			}
		}
	}
	// le ponemos un nombre bueno al reto, y los parámetros que necesitemos
	
	private static int reto(int anno) {
		if (anno % 4==0 && anno % 100 != 0) {
			return 29;
		} else if (anno % 100 == 0 && anno % 400 == 0) {
			return 29; 
		
	}
			return 28;
	}
}


			