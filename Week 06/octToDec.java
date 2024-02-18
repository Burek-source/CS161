/*

Octal To Decimal

Decimal numbers are numbers in base 10 (with digits: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9).
Octal numbers are numbers in base 8 (with digits: 0, 1, 2, 3, 4, 5, 6, 7).
Write a Java program that converts an octal number to a decimal number and prints the decimal number to the screen. Use keyboard input to provide the value for the octal number.
You are not allowed to use Integer.toString() or Integer.parseInt() to solve this problem.
The input number should be taken as an int.

Sample input

345

Sample output

229 

*/

import java.util.Scanner;

public class octToDec 
{
    public static void main(String[] args) 
    {
        int pow = 0, remainder = 0, decimal = 0;
        Scanner sc = new Scanner(System.in);

        int octal = sc.nextInt();
        sc.close();

        while(octal > 0)
        {
            remainder = octal % 10;

            decimal = decimal + (remainder *(int)Math.pow(8, pow));
            octal = octal / 10;
            pow++;
        }

        System.out.println(decimal);
    }
}
