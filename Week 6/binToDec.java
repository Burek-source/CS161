/* 
Binary To Decimal

Binary numbers are numbers in base 2 (with digits: 1, 0).
Decimal numbers are numbers in base 10 (with digits: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9).
Write a Java program that converts an Binary number to a Decimal number and prints the Decimal number to the screen. Use keyboard input to provide the value for the Binary number.
You are not allowed to use Integer.toString() or Integer.parseInt() to solve this problem.

Sample input

1011

Sample output

11

*/

import java.util.Scanner;

public class binToDec 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
    
    int binNumber = sc.nextInt();
    
    sc.close();

    int sum = 0, pow = 0, remainder = 0;

    while(binNumber != 0)
    {
        remainder = binNumber % 10;

        if(remainder == 1)
        {
            sum = sum + ((int)Math.pow(2, pow));
        }

        binNumber = binNumber / 10;
        pow++;
    }

    System.out.println(sum);
    }
}
