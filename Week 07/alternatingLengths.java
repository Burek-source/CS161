/*

Alternating Lengths

Write a Java program which creates an array of Strings. You will first take an integer from input to determine how many Strings are in the array.
Once you have populated the array with Strings, your task is to verify if the array has alternating lengths of String.
Your program should print "Valid Ordering" if the Array follows the below rules. If not, it should print the String that breaks the rule and its position in the array.
A "valid" array will have the second String longer than the first, the third String shorter, the fourth larger and so on.
When taking in the Integer, you will need to use Integer.parseInt(scan.nextLine())

Sample inputs

4
hello
hello world
this is a sentence
this is another sentence

4
hello
this is a sentence
hello world
this is another sentence

Sample outputs

this is a sentence
2

Valid Ordering 

*/

import java.util.Scanner;

public class alternatingLengths 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        int lengthA = Integer.parseInt(sc.nextLine());

        String[] strArray = new String[lengthA];

        // Populate array with strings
        for(int i = 0; i < strArray.length; i++)
        {
            strArray[i] = sc.nextLine();
        }

        // Check valid ordering
        for(int i = 1; i < strArray.length; i++)
        {
            if(i % 2 != 0)
            {
                if(strArray[i].length() <= strArray[i - 1].length())
                {
                    System.out.println(strArray[i]);
                    System.out.println(i);
                    count++;
                    break;
                }
            }

            else if(i % 2 == 0)
            {
                if(strArray[i].length() >= strArray[i-1].length())
                {
                    System.out.println(strArray[i]);
                    System.out.println(i);
                    count++;
                    break;
                }
            }
        }
        if(count == 0)
        {
            System.out.println("Valid Ordering");
        }
    }
}
