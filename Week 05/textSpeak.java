/*

Text Speak

Write a Java program that creates a String variable from user input and replaces every instance of a lowercase 'e' with '3', a lowercase 's' with '5' and a lowercase 'b' with '8'.
You also need to print the total value of numerals you add to your String.

Sample inputs

the cold never bothered me anyway
computer science

Sample outputs

th3 cold n3v3r 80th3r3d m3 anyway 
26

comput3r 5ci3nc3
14 

*/

import java.util.Scanner;

public class textSpeak 
{
    public static void main(String[] args) 
    {
        String s = new String("");
        String textSpeak = new String("");
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        s = sc.nextLine();

        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == 'e')
            {
                textSpeak = textSpeak + 3;
                sum = sum + 3;
            }
            else if (s.charAt(i) == 's')
            {
                textSpeak = textSpeak + 5;
                sum = sum + 5;
            }

            else if (s.charAt(i) == 'b')
            {
                textSpeak = textSpeak + 8;
                sum = sum + 8;
            }

            else
            {
                textSpeak = textSpeak + s.charAt(i);
            }
        }

        System.out.println(textSpeak);
        System.out.println(sum);
    }
}
