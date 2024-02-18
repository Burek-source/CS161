/*

Hexadecimal to Binary

Hexadecimal numbers are numbers in base 16 (with digits: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F).
Binary numbers are numbers in base 2 (with digits: 1, 0),
Write a Java program that converts a hexadecimal number to a binary number and prints the binary number to the screen. You can use 4 digits for each hexadecimal "bit". 
Use keyboard input to provide the value for the hexadecimal number.
You are not allowed to use Integer.toString() or Integer.parseInt() to solve this problem.

Sample input

1E

Sample output

00011110 

*/

import java.util.Scanner;

public class hexToBin 
{
    public static void main(String[] args) 
    {
        int length = 0, remainder = 0, hexNum = 0;
        String hexToBin = new String("");
        String bin = new String("");
        String hex = new String("");
        String hexPositions = new String("0123456789ABCDEF");

        Scanner sc = new Scanner(System.in);
        hex = sc.nextLine();
        sc.close();

        length = hex.length();

        while(length != 0)
        {
            char c = hex.charAt(length - 1);
            hexNum = hexPositions.indexOf(c);

            while(hexNum > 0)
            {
                remainder = hexNum % 2;
                hexToBin = remainder + hexToBin;

                hexNum = hexNum / 2;
            }

            if(hexToBin.length() < 4)
            {
                while(hexToBin.length() < 4)
                {
                    hexToBin = '0' + hexToBin;
                }
            }

            bin = hexToBin + bin;
            hexToBin = "";
            length -= 1;
        }

        System.out.println(bin);
    }
}
