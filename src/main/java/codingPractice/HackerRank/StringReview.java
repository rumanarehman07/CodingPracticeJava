package codingPractice.HackerRank;

import java.util.Scanner;

/*Task
Given a string, S, of length N that is indexed from 0 to N-1, print its even-indexed and odd-indexed characters as
2 space-separated strings on a single line (see the Sample below for more detail).
Note:0 is considered to be an even index. 

Input Format
The first line contains an integer, T (the number of test cases).
Each line i of the T subsequent lines contain a String, . 
*/

public class StringReview {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count, num, len, j;
		String even = "", odd = "";

		System.out.println("Enter the number of word: ");
		num = sc.nextInt();

		String[] s = new String [num];
		for(count=0; count<num;count++) {
			System.out.println("Enter the "+(count+1)+ " string: ");
			s[count] = sc.next();
			len = s[count].length();
			char c[] = s[count].toCharArray();

			for(j=0;j<len;j++) {
				if(j%2==0) {
					even=even+c[j];
				}
				else
				{
					odd=odd+c[j];
				}
			}

			System.out.println(even+" "+odd);
			even="";odd="";

		}
		sc.close();

	}

}
