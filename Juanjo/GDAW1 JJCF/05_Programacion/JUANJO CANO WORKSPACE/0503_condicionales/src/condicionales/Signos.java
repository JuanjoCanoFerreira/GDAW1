package condicionales;
public class Signos {
	public static void main(String [] args) {
		abs(3);
		abs(5);
		abs(7);
		
		System.out.println("El valor absoluto de -3 es " + abs(-3));
		System.out.println("El valor absoluto de -5 es " + abs (-5));
		System.out.println("El valor de " + abs(7) + " es 7 ");
		
	}
	
	private static int abs(int num) {
		if (num < 0) {
			return -num;
		} else {
			return num;
		}
	}
		
		
		
	}

