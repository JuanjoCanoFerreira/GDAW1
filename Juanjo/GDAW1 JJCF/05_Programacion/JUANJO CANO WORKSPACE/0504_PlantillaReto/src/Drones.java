import java.util.Scanner;
public class Drones {
	public static void main(String[] args) {
		try(Scanner s = new Scanner(System.in)) {
			int numCasos = s.nextInt();
			for (int i = 0; i < numCasos; i++) {
				// por cada parámetro de nuestro caso
				// pero les ponemos nombres buenos
				
				int param1 = s.nextInt();
				int param2= s.nextInt();
				int param3 = s.nextInt();
				int param4 = s.nextInt();
				String res = drones(param1,param2,param3,param4);
				}
				System.out.println(res);
			
			}
		}
	}
	
	Private static String drones (int param1, int param2, int param3, int param4) {
		int iniA = param1;
		int finA = param2;
		
		if (param2 < param1) {
			finA = param1;
			IniA = param2;
		}
		int iniB = param3;
		int finB =  param4;
		if (param4 < param3) {
			
			finB =  param4;
			iniB = param3;
			
		}
		
	

}
