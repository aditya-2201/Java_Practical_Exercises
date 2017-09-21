import java.util.*;

public class PE_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long n, rev = 0, t;
		int total = 0;
		System.out.println("enter the no");
		n = input.nextLong();
		t = n;
		while (t > 0) {
			rev *= 10;
			long temp = t % (long) 10;
			rev += temp;
			if (temp % 2 == 0)
				total += temp;
			t = t / 10;
		}
		if (n == rev) {
			System.out.print(n + " is palindrome and the sum of even numbers is");
			if (total > 25)
				System.out.print(" greater than 25");
			else
				System.out.print(" less than 25");
		} else {
			System.out.println(n + " is not palindrome");
		}
		input.close();
	}
}
