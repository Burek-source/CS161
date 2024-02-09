/* 

String Inputs

Write a program that takes a String in from user input. You should then:

1. Print the String in lowercase.
2. Print every even indexed letter in uppercase and every odd indexed letter in lowercase.
3. Print the length of the word.
4. Print every odd indexed letter of the word on it's own line.

Sample input

PROGRAMMING

Sample output

programming ProgRaMmInG
11
R
G
A
M
N

*/

import java.util.Scanner;

public class stringInputs 
{
    public static void main(String[] args) 
    {
        String s = new String("");
        String temp = new String("");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        s = sc.nextLine();

        System.out.println(s.toLowerCase());

        for (int i = 0; i < s.length(); i++)
        {
            if (i % 2 == 0)
            {
                temp = temp + s.toUpperCase().charAt(i);
            }
            else
            {
                temp = temp + s.toLowerCase().charAt(i);
            }
        }

        System.out.println(temp);
        System.out.println(s.length());

        for (int i = 1; i < s.length(); i++)
        {
            System.out.println(s.charAt(i));
            i++;
        }
    }
}
