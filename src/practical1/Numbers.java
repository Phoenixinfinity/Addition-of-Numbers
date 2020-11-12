package practical1;
import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Addition of Numbers
		int a,b,c;
		System.out.println("\nEnter the values :");
		Scanner obj = new Scanner(System.in);
		System.out.println("a :-");
		a = obj.nextInt();
		System.out.println("b :-");
		b = obj.nextInt();
		c = a + b;
		System.out.println("\nThe of Numbers is = "+c);

	}

}
