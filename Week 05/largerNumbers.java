/*

Larger Numbers

Write a Java program that asks the user to enter 10 numbers. The program should count how many times a larger number is entered after a smaller number. 
The exact message as in the sample output should be printed.

Sample input

54 12 36 2 1 89 107 150 4 -2

Sample output

A larger number was entered after a smaller number 4 times 

*/

import java.util.Scanner;

public class largerNumbers 
{
    public static void main(String[] args) 
    {
        int userNumber = 0;
        int largerNumber = 0;
        int count = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        userNumber = sc.nextInt();
        largerNumber = userNumber;

        for (int i = 1; i < 10; i++)
        {
            System.out.println("Enter a number: ");
            userNumber = sc.nextInt();

            if(userNumber > largerNumber)
            {
                count++;
                largerNumber = userNumber;
            }
            else
            {
                largerNumber = userNumber;
            }
        }

        System.out.println("A larger number was entered after a smaller number " + count + " times");
    }
}
