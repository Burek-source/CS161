/*

String Array

Write a Java program which creates an array of 10 Strings based on user input.
If while taking input the word "invalid" is entered from input, this should be skipped and not count as one of your 10 Strings.
You should then print the completed array out to the screen.

Sample input

sentence 1
sentence 2
invalid
sentence 3
sentence 4
sentence 5
sentence 6
invalid
invalid
sentence 7
sentence 8
sentence 9
sentence 10

Sample output

sentence 1
sentence 2
sentence 3
sentence 4
sentence 5
sentence 6
sentence 7
sentence 8
sentence 9
sentence 10 

*/

import java.util.Scanner;

public class stringArray 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] tenSentences = new String[10];

        String sentence = new String("");

        int count = 0;

        while(count < 10)
        {
            System.out.println("Enter a string: ");
            sentence = sc.nextLine();

            if(sentence.equals("invalid") == false)
            {
                tenSentences[count] = sentence;
                count++;
            }
        }

        for(int i = 0; i < tenSentences.length; i++)
        {
            System.out.println(tenSentences[i]);
        }
    }
}
