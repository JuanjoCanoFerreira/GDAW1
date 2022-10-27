package condicionales;
public class Trimestre {
	public static void main(String [] args) {
		trimestre(1);
		trimestre(5);
		trimestre(7);
		trimestre(11);
		
		System.out.println("Enero es del " + trimestre(1) +" trimestre.");
		System.out.println("Abril es del " + trimestre(5) + " trimestre.");
		System.out.println("Agosto es del " + trimestre(7) + " trimestre.");
		System.out.println("Noviembre es del " + trimestre(11) + " trimestre.");

		}
	
	private static int trimestre(int mes) {
		
		if (mes<3) {
			return 1;
		} else if (mes>3 && mes<6) {
			return 2;
		} else if (mes>6 && mes<9) {
			return 3;
		} else if (mes>9 && mes<12) {
			return 4;
		} else {
			return 5;
		}
		
	}
	
	public static void main(String [] args) {
		
		
		
	}
	
	
	private static int switchDiasMes(int mes) {
		int dias;
		switch (mes) {
		case 2:
			dias = 20;
			break;
		default: 
			dias = 31;
		}
		return dias;
	}

}
