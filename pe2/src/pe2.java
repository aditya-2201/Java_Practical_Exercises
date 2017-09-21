import java.util.Scanner;

public class pe2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("enter the no");
		n = input.nextInt();
		
		if(n>20&&n<30)
			if(n%2==0)
				System.out.println("Tom");
			else
				System.out.println("Jerry");
		
		input.close();
		
	}
		
}