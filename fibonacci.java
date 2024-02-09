/*

Fibonacci Sequence

Write a Java program that uses a while loop to print the final number in a Fibonacci Sequence of a given size, denoted by a variable "num".
The Fibonacci sequence is a sequence in which each number is the sum of the two preceding ones, starting from 0.
For example, a Fibonacci sequence of size 8 would be 0, 1, 1, 2, 3, 5, 8, 13. Thus our answer would be 13.
Please create an int called num with initial value 10 for this question. This variable should be on its own line.

Sample inputs

8
10

Sample outputs

13
34

 */

public class fibonacci 
{
    public static void main (String[] args)
    {
        int num = 10;
        int num1 = 0;
        int num2 = 1;
        int sum = 0;

        if(num == 2)
        {
            sum = 1;
        }

        while(num - 2 > 0)
        {
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            num--;
        }

        System.out.println(sum);
    }
}
