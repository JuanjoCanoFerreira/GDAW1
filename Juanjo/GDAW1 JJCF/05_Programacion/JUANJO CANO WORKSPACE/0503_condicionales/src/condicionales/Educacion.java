package condicionales;
public class Educacion{
public static void main(String [] args) {
	educacion(2);
	educacion(9);
	educacion(17);
	educacion(19);
	educacion(25);

}
	private static void educacion(int edad) {
		if (edad < 6) {
			System.out.println("infantil");
		} else if (edad < 12) {
			System.out.println("primaria");
		} else if (edad < 16) {
			System.out.println("secundaria");
		} else if (edad > 16 && edad < 18 ) {
			System.out.println("bachillerato");
		} else if (edad > 18) {
			System.out.println("Mercado laboral");
		}
	

	}
	
}
