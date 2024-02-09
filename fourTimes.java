/*

Four Times

Write a java program that takes a String as user input and then prints the string again with every character repeated 4 times.

Sample input

World

Sample output

WWWWoooorrrrlllldddd 

*/

import java.util.Scanner;

public class fourTimes 
{
    public static void main(String[] args) 
    {
        String s = new String("");
        String fourTimes = new String("");
        int count = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        s = sc.nextLine();

        for (int i = 0; i < s.length(); i++)
        {
            count = 0;

            while(count < 4)
            {
                fourTimes = fourTimes + s.charAt(i);
                count++;
            }
        }

        System.out.println(fourTimes);
    }
}
