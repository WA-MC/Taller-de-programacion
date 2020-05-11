import java.util.Scanner;
public class TareaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your number");
		int number=scan.nextInt();
		
		if (number<0) {
			System.out.println("Your number is negative");
		}
		else {
			if (number>0) {
				System.out.println("Your number is positive");
			}
			else {
				System.out.println("your number is neutral");
			}
		}
		
	}

}
