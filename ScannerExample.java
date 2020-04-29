package ejemplo;
import java.util.*;

import javax.xml.ws.EndpointContext;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("ingresa tu genero");
		String gen=scan.next();
		if(gen.contentEquals("hombre"))
		{
			System.out.println("bienvenido");
		}
		else
		{
			if(gen=="mujer")
			{
			System.out.println("bienvenida");
			}
			else
			{
				System.out.println("Error");
				System.exit(0);
			}
		}
		System.out.println("Ingresa tu edad");
		int edad=scan.nextInt();
		if(edad>6 && edad<=12)
		{
			System.out.println("Tiene que pagar 10 soles");
		}
		else
		{
			if(edad>12 && edad<=60)
			{
				System.out.println("Tiene que pagar 20 soles");
			}
			else
			{
		    if(edad>60)
		    {
		    	System.out.println("Tiene que pagar 15 soles");
		    }
			}
		}

	}

}
