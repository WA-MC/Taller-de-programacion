import java.util.*;

public class ESwtich {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double noteA=0,noteB=0,noteC=0,promedio=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Ingrese Nota A: ");
		noteA=scan.nextDouble();
		
		System.out.println("Ingrese Nota B: ");
		noteB=scan.nextDouble();
		
		System.out.println("Ingrese Nota C: ");
		noteC=scan.nextDouble();
		
		promedio=(noteA + noteB + noteC)/3;
		
		if(promedio>20) {
			System.out.println("Error al ingresar las notas");
			System.exit(0);
		}
		else {
			if(promedio>10.5) {
				System.out.println("Aprobado");
			}
			else {
				System.out.println("Desaprobado");
			}
		}
		System.out.println("El promedio es: " + promedio);
		

	}

}
