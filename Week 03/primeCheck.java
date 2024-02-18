/*

Prime Number Checker

Write a Java program that uses a do-while loop to determine if a positive integer number is a prime number. 
A number is prime if it is divisible only by 1 and itself. For example, 13 is prime but 12 is not (divisible by 1, 2, 3, 4, 6 and 12).

Please use an int called num when storing your initial value

Sample inputs

13
12

Sample outputs

13 is a prime number
12 is NOT a prime number

 */

public class primeCheck 
{
    public static void main(String[] args) 
    {
        int num = 6;
        int possiblePrime = num;
        int count = 0;

        do
        {
            if (num % possiblePrime == 0)
            {
                count++;
                possiblePrime--;
            }
            else
            {
                possiblePrime--;
            }
        }while (possiblePrime > 0);

        if (count > 2)
        {
            System.out.println(num + " is not a prime number");
        }
        else
        {
            System.out.println(num + " is a prime number");
        }
    }
}
