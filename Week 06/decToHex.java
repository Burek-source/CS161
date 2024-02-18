/*
Decimal To Hexadecimal

Decimal numbers are numbers in base 10 (with digits: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9).
Hexadecimal numbers are numbers in base 16 (with digits: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F).
Write a Java program that converts a decimal number to a hexadecimal number and prints the hexadecimal number to the screen. Use keyboard input to provide the value for the decimal number.
You are not allowed to use Integer.toString() or Integer.parseInt() to solve this problem.

Sample input

30

Sample output

1E 

*/

import java.util.Scanner;

public class decToHex 
{
    public static void main(String[] args) 
    {
        int remainder = 0;
        int decimal = 0;

        String hex = new String("");
        String hexPosition = new String("0123456789ABCDEF");

        Scanner sc = new Scanner(System.in);

        decimal = sc.nextInt();
        sc.close();

        while(decimal != 0)
        {
            remainder = decimal % 16;
            hex = hexPosition.charAt(remainder) + hex;
            decimal = decimal / 16;
        }

        System.out.println(hex);
    }
}
