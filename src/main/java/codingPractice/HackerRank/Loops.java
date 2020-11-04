package codingPractice.HackerRank;

import java.util.Scanner;

/*Task
Given an integer,n, print its first multiples n x i. 
Each multiple n x i (where 1<=i<=10) 
should be printed on a new line in the form: n x i = result.*/

public class Loops {

	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a number: ");

		int n =scanner.nextInt();
		printTable(n);
		scanner.close();
	}


	public static void printTable(int n)
	{
		int result;
		for(int i=1;i<=10;i++) {
			result = n * i;
			System.out.println(n+" x "+i+ " = "+result);
		}
	}

}
