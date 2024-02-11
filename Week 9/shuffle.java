/*

Description

Write a Java program that takes all even-indexed characters and odd-indexed characters from a string, provided by user input, and concatenates them together. 
The new string should be printed to the screen. 

Sample Input 1

0123456

Sample Output 1

0246135

Sample Input 2

abcd

Sample Output 2

acbd

Sample Output 2 Explanation
(a and c are even indexed, b and d are odd indexed) */

import java.util.Scanner;

public class shuffle 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        String even = new String("");
        String odd = new String("");

        for(int i = 0; i < str.length(); i++)
        {
            if(i % 2 == 0)
            {
                even = even + str.charAt(i);
            }
            else
            {
                odd = odd + str.charAt(i);
            }
        }

        System.out.println(even + odd);
    }
}
