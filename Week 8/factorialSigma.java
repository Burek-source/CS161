/* 

Factorial Sigma

Write a program that counts from 1 to 12 and prints the Sigma and Factorial of all of the numbers. Your output must exactly match the sample box below.

Sample output

When the number is 1, Sigma = 1, factorial = 1 
When the number is 2, Sigma = 3, factorial = 2
..
...
When the number is 12.......

*/

public class factorialSigma 
{
    public static void main(String[] args) 
    {
        int factorial = 1;
        int sigma = 0;

        for(int i = 1; i < 16; i++)
        {
            // Calculate factorial
            factorial = factorial * i;
            sigma = sigma + i;
            System.out.println("When the number is " + i + ", Sigma = " + sigma + ", factorial = " + factorial);
        }
    }
}
