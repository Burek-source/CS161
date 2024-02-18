/*

Fizzbuzz 2

Write a Java program that prints a sequence of messages based on the fizzbuzz rules below. Your program should have two variables called start and end, the range in which to print messages (inclusive).

If the value in "num" is divisible by 3, your program should print "fizz".
If the value in "num" is divisible by 5, your program should print "buzz".
If the value in "num" is divisible by both 3 and 5, your program should print "fizzbuzz".
If the value in "num" is divisible by neither 3 nor 5, your program should simply print the value of num.

You must use a series of if, else if and else statements to solve this problem, along with a for loop.
You must use the variable names given. You must print all values on one line, space separated.

Sample inputs

2
3

10
15

Sample outputs

2 fizz
buzz 11 fizz 13 14 fizzbuzz

 */

public class fizzbuzz2 
{
    public static void main (String[] args)
    {
        int start = 10;
        int end = 15;

        for(int i = start; i <= end; i++)
        {
            if (i % 15 == 0)
            {
                System.out.print("fizzbuzz ");
            }
            else if (i % 5 == 0)
            {
                System.out.print("buzz ");
            }
            else if (i % 3 == 0)
            {
                System.out.print("fizz ");
            }
            else
            {
                System.out.print(i + " ");
            }

        }
    }
}
