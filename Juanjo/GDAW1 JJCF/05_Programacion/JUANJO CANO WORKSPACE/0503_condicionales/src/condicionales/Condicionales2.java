package condicionales;
public class Condicionales2 {
public static void main (String [] args) {
	adultez(18);
		System.out.println("Si tiene 18 años es adulto");
	adultez(15);
		System.out.println("Si tiene 15 años no es adulto");
	adultez2(20);
		System.out.println("Si tiene 20 años es adulto");
	adultez3(12);
		System.out.println("Si tiene 12 años es un niñ");
		
}

private static void adultez (int edad) {
	if (edad<18) { // edad es menor que 18
		System.out.println("es menor");
	} else { //edad es 18 o más
		System.out.println("es mayor");
	}
}
	
private static void adultez2 (int edad) {

	if (edad>=18) {
		System.out.println("es adulto");
	} else {
		System.out.println("no es adulto");
	}
}

private static void adultez3 

}




		
	


