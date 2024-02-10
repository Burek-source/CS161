/*

Description

Write a java program that:

Prints to the screen the character equivalence of an inputted decimal value. The format of the output can be seen below.
Stops printing when the decimal value for 'ESC' (27) is inputted.

Note:

• Your program will receive decimal numbers as user input.
• You must convert these numbers to characters to their ASCII character value.
• They must be printed in the order of being input with one space after each.
• You will stop receiving input when you receive the decimal value for 'ESC', and you do not print this.

Sample Input 1

97 98 99 100 101 102 27

Sample Output 1

a b c d e f

Sample Input 2

49 43 50 61 51 27

Sample Output 2

1 + 2 = 3 

*/

import java.util.Scanner;

public class decode 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int decimal = 0;

        while(decimal != 27)
        {
            decimal = sc.nextInt();
            char c = (char)decimal;

            System.out.print(c);
            System.out.print(" ");
        }
    }
}
