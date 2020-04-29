package digitar;
import java.util.Scanner;
public class Datos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan =new Scanner(System.in);
		System.out.println("Ingrese Apellido Paterno");
		String apePat = scan.next();
		System.out.println("Ingrese Apellido Materno");
		String apeMat = scan.next();
		System.out.println("Ingrese su edad");
		int edad = scan.nextInt();
		System.out.println("Apellidos: "+ apePat + " "+ apeMat + ", tiene "+ edad + " a\u00f1os");
		
	}

}
