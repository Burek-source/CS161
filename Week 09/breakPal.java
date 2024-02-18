/*

Description

Write a Java program that determines and prints the digits that make up every five-digit palindromic number that is divisible by 53. For example, for the palindromic number 74147 
the program should print:

74147
7
4
1
4
7

N.B. Your program should output the digits for every five-digit palindromic number with a row of 10 stars after each number.

Sample Output (for 1 palindromic number)

74147 
7
4
1
4
7 

*/

public class breakPal 
{
    public static void main(String[] args) 
    {
        int divisibleBy = 53;
        int num = 10000;
        int number = num;

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;

        // While number is a five digit number
        while(num < 99999)
        {
            // Check if a five digit number is divisible by 53
            if(number % divisibleBy == 0)
            {
                // Separate five digit number into each digit

                // First digit
                num5 = num % 10;
                num = num / 10;

                // Second digit
                num4 = num % 10;
                num = num / 10;

                // Third digit
                num3 = num % 10;
                num = num / 10;

                // Fourth digit
                num2 = num % 10;
                num = num / 10;

                // Fifth digit
                num1 = num % 10;
                

                // If the first and the last number are same and the second and fourth number are same
                // it is a palindrome
                // Print out details
                if(num1 == num5 && num2 == num4)
                {
                    System.out.println(number);
                    System.out.println(num1);
                    System.out.println(num2);
                    System.out.println(num3);
                    System.out.println(num4);
                    System.out.println(num5);
                    System.out.println("**********");

                    // Increment the number by 1
                    number = number + 1;
                    num = number;
                } 

                // Increment the number by 1
                number = number + 1;
                num = number;
            }

            // Not divisible by 53
            // Increment the number by 1
            else
            {
                number = number + 1;
                num = number;
            }
        }

    }
}
