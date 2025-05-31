package week1.day2;

import java.util.Scanner;

public class PaliandromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numnber :");
		int num= sc.nextInt();
		int originalNum = num; 
		int rev=0;
		while (num!=0)
		{
			rev=rev*10 + num%10;
			num = num/10;
			
		}
		
		if(originalNum==rev)
		{
			System.out.println("Is a Paliandrome number");
		}
		else if(originalNum!=rev)
		{
			System.out.println("It is not a Paliandrome number");
		}

	}

}
