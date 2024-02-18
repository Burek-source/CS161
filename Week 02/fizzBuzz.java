/*

Fizz Buzz 1

Write a Java program that prints a message based on the value of an integer. Your program should have a variable called num.

If the value in "num" is divisible by 3, your program should print "fizz".
If the value in "num" is divisible by your program should print "buzz".
If the value in "num" is divisible by both 3 and 5, your program should print "fizzbuzz".
If the value in "num" is divisible by neither 3 nor 5, your program should simply print the value of num.

You must use a series of if, else if and else statements to solve this problem.
You must use the variable name given.

Sample inputs

3
14

Sample outputs 

fizz
14

 */

public class fizzBuzz 
{
    public static void main (String[] args)
    {
        int num = 3;

        if (num % 15 == 0)
        {
            System.out.println("fizzbuzz");
        }
        else if (num % 5 == 0)
        {
            System.out.println("buzz");
        }
        else if (num % 3 == 0)
        {
            System.out.println("fizz");
        }
        else
        {
            System.out.println(num);
        }
    }
}
