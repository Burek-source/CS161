/*

Vowels

Write a Java program which creates an array of Strings. You will first take an integer from input to determine how many Strings are in the array.
Once you have populated the array with Strings, your task is to determine which String has the most vowels in it. You should then print this word to the screen, 
along with a number representing how many vowels were in it, as per the sample output below.
When taking in the Integer, you will need to use Integer.parseInt(scan.nextLine())

Sample input

4
hello
hello world
this is a sentence
this is another sentence

Sample output

this is another sentence
8 

*/

import java.util.Scanner;

public class vowels 
{
    public static void main(String[] args) 
    {
        int vowels = 0;
        int tempHighestCount = 0;
        String tempStr = new String("");

        Scanner sc = new Scanner(System.in);
        int length = Integer.parseInt(sc.nextLine());

        String[] sentences = new String[length];

        // Populate array with strings
        for(int i = 0; i < sentences.length; i++)
        {
            sentences[i] = sc.nextLine();
        }

        sc.close();

        // Determine which string has the most vowels in it
        for(int i = 0; i < sentences.length; i++)
        {
            for(int j = 0; j < sentences[i].length(); j++)
            {
                if(sentences[i].charAt(j) == 'a' || sentences[i].charAt(j) == 'e' || sentences[i].charAt(j) == 'i'
                || sentences[i].charAt(j) == 'o' || sentences[i].charAt(j) == 'u')
                {
                    vowels++;
                }
            }

            if(vowels > tempHighestCount)
            {
                tempHighestCount = vowels;
                tempStr = sentences[i];
                vowels = 0;
            }
            else
            {
                vowels = 0;
            }
        }

        System.out.println(tempStr);
        System.out.println(tempHighestCount);
    }
}
