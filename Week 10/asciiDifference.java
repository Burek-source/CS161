/*

Write a Java program, called AsciiDifference that accepts two Strings as user input and then print the difference in the sum of ASCII values of the two Strings as an integer value.

Sample Input

ireland
IRELAND

Sample Output

224

Explanation
String s1 = "ireland"; String s2 = "IRELAND"; The sum of ASCII Values for s1 = 735 The sum
of ASCII Values for s2 = 511 The difference between s1 and s2 = 224 

*/

import java.util.Scanner;

public class asciiDifference 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();

        int sumFirst = 0;
        int sumSecond = 0;

        for(int i = 0; i < first.length(); i++)
        {
            char c = first.charAt(i);
            int n = (int)c;
            sumFirst = sumFirst + n;
        }

        for(int i = 0; i < second.length(); i++)
        {
            char c = second.charAt(i);
            int n = (int)c;
            sumSecond = sumSecond + n;
        }

        System.out.println(sumFirst - sumSecond); 
    }
}
