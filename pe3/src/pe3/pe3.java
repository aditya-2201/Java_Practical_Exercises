package pe3;

import java.util.Scanner;

public class pe3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s;
		
		System.out.println("enter the string");
		s = input.nextLine();
		
		boolean flag = true;
		
		for(int i=0; i<s.length();i++)
		{
			int t = (int)s.charAt(i);
			if(( t >= 65 && t<= 90)||(t >= 97 && t<=122))
			{
				continue;
			}
			else
				flag = false;
		}
		
		if(flag==false)
		System.out.println("Error: input are not letters");
		else
		{
			if(s.length()==1)
			{
				int t = (int)s.charAt(0);
				if(t==65||t==69||t==73||t==79||t==85||t==97||t==101||t==105||t==111||t==117)
				{
					System.out.println("Vowel");
				}
				else
				{
					System.out.println("Consonant");
				}
			}
			else
			for(int i=0;i<s.length();i++) {
				
				int t = (int)s.charAt(i);
				if(t==65||t==69||t==73||t==79||t==85||t==97||t==101||t==105||t==111||t==117)
				{
					System.out.print(s.charAt(i)+" - Vowel, ");
				}
				else
				{
					System.out.print(s.charAt(i)+" - Consonant, ");
				}
		
			}
					
		}
		
		input.close();
	}
}
