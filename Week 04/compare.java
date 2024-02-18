/*
Description

Write a Java program that compares two Strings. You have to declare a String text1 and assign it the value "programming" and then declare another String text2 and assign it the value "development". 
Your program should do the following:

1. If the two Strings are exactly the same print to the screen "Exactly the same: True" otherwise print "Exactly the same: False". You may use boolean variables.
2. If and only if the first comparison was false, a comparison should be done that ignores case sensitivity. If they are the same while ignoring the case print to the screen "Similar: True" otherwise print "Similar: False".

Sample Input

These sentences are the same.
These sentences are the same.

Sample Output

Exactly the same: True
Sample Input

This sentence has Upper case and Lower case letters.
This sentence has upper case and lower case letters.

Sample Output

Exactly the same: False
Similar: True

Sample Input

Well something is wrong here
Obviously they will get a false output

Sample Output

Exactly the same: False
Similar: False 

*/

public class compare 
{
    public static void main(String[] args) 
    {
        String text1 = "programming";
        String text2 = "development";

        // 1
        if (text1.equals(text2))
        {
            System.out.println("Exactly the same: True");
        }
        else
        {
            System.out.println("Exactly the same: False");

            if (text1.compareToIgnoreCase(text2) == 0)
            {
                System.out.println("Similar: True");
            }
            else
            {
                System.out.println("Similar: False");
            }
        }
    }
}
